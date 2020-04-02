import chn.util.*;
public class Store
{
    private Item[] myStore;
    private ConsoleIO console;
    public Store(String fileName) { 
        console = new ConsoleIO();
        System.out.println("\u000C");
        loadFile(fileName);
    }

    public void displayStore() {
        System.out.print("Display in JSON, Regular, or both ? (j/r/b)");
        String type = console.readLine();
        if (type.charAt(0) == 'j' || type.charAt(0) == 'J' || type.charAt(0) == 'b' || type.charAt(0) == 'B') {
            System.out.println("\"store\": [ ");
            for (int i = 0; i < myStore.length-1; i++) {
                System.out.println("{ " + myStore[i].toString() + "}, ");
            }
            System.out.println("{ " + myStore[myStore.length-1].toString() + "} ");
            System.out.println("]");
        }
        if (type.charAt(0) == 'r' || type.charAt(0) == 'R' || type.charAt(0) == 'b' || type.charAt(0) == 'B') {
            System.out.println("Store:");
            System.out.println("          Id       Inv");
            for (int i = 0; i < myStore.length; i++) {
                if (i%10 == 0) 
                    System.out.println();
                System.out.print(Integer.toString(i+1));
                for (int spaces = 0; spaces < 12 - Integer.toString(i+1).length() - Integer.toString(myStore[i].getId()).length(); spaces++)
                    System.out.print(" ");
                System.out.print(myStore[i].getId());
                for (int spaces = 0; spaces < 10 - Integer.toString(myStore[i].getInv()).length(); spaces++) 
                    System.out.print(" ");
                System.out.println(myStore[i].getInv());
            }
        }
    }

    public void saveFile(String filename, String type) {
        FileOutput out = new FileOutput(filename);
        if (type.charAt(0) == 'j' || type.charAt(0) == 'J' ) {
            out.println("\"store\": [ ");
            for (int i = 0; i < myStore.length-1; i++) {
                out.println("{ " + myStore[i].toString() + "}, ");
            }
            out.println("{ " + myStore[myStore.length-1].toString() + "} ");
            out.println("]");
        } else {
            out.println("Store:");
            out.println("          Id       Inv");
            for (int i = 0; i < myStore.length; i++) {
                if (i%10 == 0) 
                    out.println();
                out.print(Integer.toString(i+1));
                for (int spaces = 0; spaces < 12 - Integer.toString(i).length() - Integer.toString(myStore[i].getId()).length(); spaces++)
                    out.print(" ");
                out.print(myStore[i].getId());
                for (int spaces = 0; spaces < 10 - Integer.toString(myStore[i].getInv()).length(); spaces++) 
                    out.print(" ");
                out.println(myStore[i].getInv());
            }
        }
        out.close();
    }

    public String toString(){ 
        String toReturn = "\"store\": [ ";
        for (int i = 0; i < myStore.length-1; i++) {
            toReturn += "{ " + myStore[i].toString() + "}, ";
        }
        toReturn += "{ " + myStore[myStore.length-1].toString() + "} ";
        toReturn += "]";
        return toReturn;
    }

    public void displayString() {
        System.out.println(toString());
    }

    public void doSort() { 
        quickSort(myStore, 0, myStore.length-1);
    }

    private void quickSort(Item[] list, int first, int last) {
        int g = first, h = last;

        int midIndex = (first + last) / 2;
        Item dividingValue = list[midIndex];
        do
        {
            while (dividingValue.compareTo(list[g])>0)
                g++;
            while (dividingValue.compareTo(list[h])<0)
                h--;
            if (g <= h)
            {
                Item temp = list[g];
                list[g] = list[h];
                list[h] = temp;
                g++;
                h--;
            }
        }
        while (g < h);

        if (h > first)
            quickSort (list,first,h);
        if (g < last)
            quickSort (list,g,last);
    }

    private void loadFile(String inFileName) {
        FileInput inFile = new FileInput(inFileName);
        myStore = new Item[Integer.parseInt(inFile.readLine())]; 
        for (int i = 0; i < myStore.length; i++) {
            String line = inFile.readLine();
            String id = line.substring(0, 10);
            while (id.indexOf(" ") != -1) {
                id = id.substring(1);
            }
            String inv = line.substring(10);
            while (inv.indexOf(" ") != -1) {
                inv = inv.substring(1);
            }
            myStore[i] = new Item(Integer.parseInt(id), Integer.parseInt(inv));
        }
    }

    public void testSearch()
    {
        int idToFind;
        int invReturn;
        int index;
        ConsoleIO console = new ConsoleIO();

        System.out.println("Testing search algorithm\n");
        System.out.print("Enter Id value to search for (-1 to quit) ---> ");
        idToFind = console.readInt();
        while (idToFind >= 0)
        {
            index = bsearch(new Item(idToFind, 0));
            // recursive version call
            // index = bsearch (new Item(idToFind, 0), 0, myStore.length-1);
            System.out.print("Id # " + idToFind);
            if (index == -1)
                System.out.println("     No such part in stock");
            else
                System.out.println("     Inventory = " + myStore[index].getInv());
            System.out.print("\nEnter Id value to search for (-1 to quit) ---> ");
            idToFind = console.readInt();
        }
    }

    /**
     *  Searches the myStore array of Item Objects for the specified
     *  item object using a iterative binary search algorithm
     *
     * @param  idToSearch  Item object containing Id value being search for
     * @return             index of Item if found, -1 if not found
     */
    int bsearch(Item idToSearch)
    {
        boolean moreToSearch = true;
        int upper = myStore.length-1;
        int lower = 0;
        int id = idToSearch.getId();
        while(moreToSearch){
            if (myStore[lower].getId() == id) {
                return lower;
            } else if (myStore[upper].getId() == id) {
                return upper;
            } else if (myStore[(upper+lower)/2].getId() == id) {
                return (upper+lower)/2;
            } else if (myStore[(upper+lower)/2].getId() > id) {
                upper = (upper+lower)/2;
            } else if (myStore[(upper+lower)/2].getId() < id) {
                lower = (upper+lower)/2;
            } 
            if ((upper+lower)/2 == lower || (upper+lower)/2 == upper) {
                moreToSearch = false;
            }
        }
        return -1;
    }

    /**
     *  Searches the specified array of Item Objects for the specified
     *  item object using a recursive binary search algorithm
     *
     * @param  idToSearch  Item object containing Id value being search for
     * @param  first       Starting index of search range
     * @param  last        Ending index of search range
     * @return             index of Item if found, -1 if not found
     */ 
    int bsearch (Item idToSearch, int first, int last)
    {
        int id = idToSearch.getId();
        //System.out.println(myStore[last].getId() + " " + myStore[first].getId() + " " + myStore[(first+last)/2].getId() + " " + id);
        if (myStore[first].getId() == id) {
            return first;
        } else if (myStore[last].getId() == id) {
            return last;
        }
        if (myStore[(last+first)/2].getId() >= id) {
            return bsearch(idToSearch, first, (last+first)/2);
        } else if (myStore[(last+first)/2].getId() < id) {
            return bsearch(idToSearch, (last+first)/2, last);
        }
        return -1;
    }

    public static void main(String[] args) {
        Store costco = new Store("file50.txt");
        costco.displayStore();

        costco.doSort();
        costco.displayStore();

        costco.saveFile("sortedFiles50.txt", "regular");
        costco.saveFile("sortedFiles50.json", "json");
        costco.testSearch();
    }
}