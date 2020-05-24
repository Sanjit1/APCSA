/**
 *  Demostrates the use of the SinglyLinkedList class.
 *
 * @author     G. Peck
 * @created    May 12, 2002
 */
public class ListDemo
{
  SinglyLinkedList myList;

  public ListDemo()
  {
    myList = new SinglyLinkedList();
  }

  /**
   *  Creates a SinglyLinkedList of 5 Integer nodes
   */
  public void createList()
  {
    for (int k = 1; k <= 20; k++)
    {
      myList.addFirst(new Integer(k));
    }
  }

  /**
   *  Display the first element of the list
   */
  public void displayFirst()
  {
    System.out.println("First Element: " + myList.getFirst());
  }

  /**
   *  Print the contents of myList
   */
  public void print()
  {
    myList.printList();
    System.out.println();
  }

  /**
   *  Demostrates the use of the SinglyLinkedList class.
   *  Creates and prints a list of 5 consecutive Integer ojects.
   *
   * @param  args  The command line arguments (not used)
   */
  public static void main(String[] args)
  {
    ListDemo sList = new ListDemo();

    sList.createList();
    sList.displayFirst();
    sList.print();
    System.out.println("Last Node: " + sList.myList.getLast());
    System.out.println("Size of List: " + sList.myList.size());
  }
}