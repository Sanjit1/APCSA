public class List1
{
  SinglyLinkedList<Integer> myList;

  public List1()
  {
    myList = new SinglyLinkedList<Integer>();
  }

  public void createList(int howMany)
  {
    for (int k = 1; k <= howMany; k++)
      myList.addLast(new Integer(k));
//      myList.addFirst(new Integer(k));
  }

  public void displayFirst()
  {
    System.out.println("First Element: " + myList.getFirst());
  }

  public void displayLast()
  {
    System.out.println("Last Element: " + myList.getLast());
  }

  public void printList ()
  {
    System.out.print("SinglyLinkedList: ");
    myList.printList();
    System.out.println();
  }

  public void size()
  {
    System.out.println("Nodes: " + myList.size());
  }

  public String toString()
  {
    return myList.toString();
  }

  public static void main(String[] args)
  {
    List1 sList = new List1();

    sList.createList(20);
    sList.displayFirst();
    sList.displayLast();
    sList.printList();
    System.out.println("sList: " + sList);
    sList.size();
  }
}