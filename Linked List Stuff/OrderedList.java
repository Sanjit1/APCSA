/**
 *  Lesson 31 Ordered List
 *
 * @author     G. Peck
 * @created    July 18, 2002
 */

//import apcslib.*;
import chn.util.*;

public class OrderedList
{
    void testFind(SinglyLinkedList<Item> list)
    {
        int idToFind;
        Item location;

        ConsoleIO console = new ConsoleIO();

        System.out.println("Testing search algorithm\n");
        System.out.print("Enter Id value to search for (-1 to quit) --> ");
        idToFind = console.readInt();

        while (idToFind >= 0)
        {
            location = list.find(new Item(idToFind, 0));
            if (location == null)
                System.out.println("Id = " + idToFind + "  No such part in stock");
            else
                System.out.println(location);
            System.out.println();
            System.out.print("Enter Id value to search for (-1 to quit) --> ");
            idToFind = console.readInt();
        }
    }

    public void testDelete(SinglyLinkedList<Item> list)
    {
        int idToDelete;
        boolean success;

        ConsoleIO console = new ConsoleIO();

        System.out.println("Testing delete algorithm\n");
        System.out.print("Enter Id value to delete (-1 to quit) --> ");
        idToDelete = console.readInt();

        while (idToDelete >= 0)
        {
            Item idInvItem = new Item(idToDelete, 0);

            if (list.remove(idInvItem) == null)
                System.out.println("Id# " + idToDelete + "  No such part in stock");
            else
                System.out.println("     Id #" + idToDelete + " was deleted");
            System.out.println();
            System.out.print("Enter Id value to delete (-1 to quit) --> ");

            idToDelete = console.readInt();
        }
    }

    public void readData(SinglyLinkedList<Item> list)
    {
        FileInput inFile;

        String fileName = "file20.txt";
        int id, inv;

        inFile = new FileInput(fileName);

        int howMany = inFile.readInt();
        for (int k = 1; k <= howMany; k++)
        {
            id = inFile.readInt();
            inv = inFile.readInt();
            list.insert(new Item(id, inv));
        }
    }

    public void mainMenu (SinglyLinkedList<Item> head)
    {
        String choice;
        ConsoleIO console = new ConsoleIO();

        do
        {
            System.out.println("Linked List algorithm menu\n");
            System.out.println("(1) Read data from disk");
            System.out.println("(2) Print ordered list");
            System.out.println("(3) Search list");
            System.out.println("(4) Delete from list");
            System.out.println("(5) Clear entire list");
            System.out.println("(6) Count nodes in list");
            System.out.println("(7) Print list backwards");
            System.out.println("(8) Clear Screen");
            System.out.println("(Q) Quit\n");
            System.out.print("Choice ---> ");
            choice = console.readLine() + " ";  // kludge to ensure choice.charAt(0) > 0

            System.out.println();

            if ('1' <= choice.charAt(0) && choice.charAt(0) <= '8')
            {
                switch (choice.charAt(0))
                {
                    case '1' :
                    readData(head);
                    break;
                    case '2' :
                    System.out.println();
                    System.out.println("The tree printed inorder\n");
                    head.printList();
                    System.out.println();
                    break;
                    case '3' :
                    testFind(head);
                    break;
                    case '4' :
                    testDelete(head);
                    break;
                    case '5' :
                    head.clear();
                    break;
                    case '6' :
                    System.out.println("Number of nodes = " + head.size ());
                    System.out.println();
                    break;
                    case '7' :
                    head.printBackwards();
                    break;
                    case '8' :
                    System.out.print('\u000C');
                    break;
                }
            }
        }
        while (choice.charAt(0) != 'Q' && choice.charAt(0) != 'q');
    }

    public static void main(String[] args)
    {
        OrderedList test = new OrderedList();
        SinglyLinkedList<Item> list = new SinglyLinkedList<Item>();

        test.mainMenu (list);
    }
}