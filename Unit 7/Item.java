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
        Item other = (Item) otherObject;
        return (myId != other.myId)? (myId-other.myId) : (myInv-other.myInv);
    }

    public boolean equals(Object otherObject){ 
        Item other = (Item) otherObject;
        return (other.myId == myId) && (other.myInv == myInv);
    }

    public String toString(){ 
        return "\"ID\": " + Integer.toString(myId) + ", \"Inventory\": " + Integer.toString(myInv);
    }
}