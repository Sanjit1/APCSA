/**
 *  Encapsulates and Inventory Item
 *
 * @author     G. Peck
 * @created    July 18, 2002
 *
 * Using generics.  (In comments at bottom: shows version without generics.)
 */


public class Item implements Comparable<Item>
{
  private int myId;
  private int myInv;

  /**
   *  Constructor for the Item object
   *
   * @param  id   id value
   * @param  inv  inventory value
   */
  public Item(int id, int inv)
  {
    myId = id;
    myInv = inv;
  }

  /**
   *  Gets the id attribute of the Item object
   *
   * @return    The id value
   */
  public int getId()
  {
    return myId;
  }

  /**
   *  Gets the inv attribute of the Item object
   *
   * @return    The inv value
   */
  public int getInv()
  {
    return myInv;
  }

  /**
   *  Compares two Item objects by their Id (myId) fields
   *
   * @param  otherObject  Item object to compare to
   * @return              positive int if myId > otherObject.myId
   *                      0 if myId == otherObject.myId
   *                      negative int if myId < otherObject.myId
   */
  public int compareTo(Item otherObject)
  {
	return myId - otherObject.myId;
  }
 
  /**
   *  Compares the Item to the specified object.
   *  (Parameter needs to be 'Object' which is then
   *  typecast to 'Item'.)
   *
   * @param  otherObject  Item object to compare to
   * @return              true if equal, false otherwise
   */
  public boolean equals(Object otherObject)
  {
  	return this.compareTo((Item)otherObject) == 0;
  }

  public String toString()
  {
    return "Id=" + myId + ",Inv=" + myInv;
  }
}

/*****************************************************************
 *
// Without generics: 

public class Item implements Comparable
{
	
	// showing only the parts that are different:
	
	public int compareTo(Object otherObject)
   	{
     	Item other = (Item) otherObject;
     	return myId - other.myId;
   	}	

  	public boolean equals(Object otherObject)
  	{
    	return this.compareTo(otherObject) == 0;
    	// ALTERNATIVE:
    	//Item other = (Item)otherObject;
    	//return myId == other.myId;
  	}

}
 *
 *
 ******************************************************************/
 