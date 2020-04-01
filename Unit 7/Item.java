public class Item implements Comparable
{
    private int myId;
    private int myInv;

    public Item(int id, int inv)
    {
        myId = id;
        myInv = inv;
    }

    public int getId(){ 
        return myId;
    }

    public int getInv(){ 
        return myInv;
    }

    public int compareTo(Object otherObject){ 
        return 5;
    }

    public boolean equals(Object otherObject){ 
        return true;
    }

    public String toString(){ 
        return "d";
    }
}