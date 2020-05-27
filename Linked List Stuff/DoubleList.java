/**
 *  Test the implementation of a doubly linked-list class
 *
 * @author     G. Peck
 * @created    July 18, 2002
 */

import chn.util.*;

public class DoubleList
{
  ConsoleIO console;

  public DoubleList()
  {
    console = new ConsoleIO();
  }

  public void testDelete(DoublyLinkedList dList)
  {
    int idToDelete;
    boolean success;

    System.out.println("Testing delete algorithm\n");
    System.out.print("Enter Id value to delete (-1 to quit) --> ");
    idToDelete = console.readInt();

    while (idToDelete >= 0)
    {
      Item idInvItem = new Item(idToDelete, 0);

      if (dList.remove(idInvItem) == null)
        System.out.println("Id# " + idToDelete + "  No such part in stock");
      else
        System.out.println("     Id #" + idToDelete + " was deleted");
      System.out.println();
      System.out.print("Enter Id value to delete (-1 to quit) --> ");

      idToDelete = console.readInt();
    }
  }

  public void readData(DoublyLinkedList dList)
  {
    FileInput inFile;

    String fileName = "file10.txt";
    int id, inv;

    inFile = new FileInput(fileName);

    int howMany = inFile.readInt();
    for (int k = 1; k <= howMany; k++)
    {
      id = inFile.readInt();
      inv = inFile.readInt();
      dList.insert(new Item(id, inv));
    }
  }

  public void mainMenu (DoublyLinkedList dList)
  {
    String choice;

    do
    {
      System.out.println("Doubly-Linked List algorithm menu\n");
      System.out.println("(1) Read data from disk");
      System.out.println("(2) Print list forward");
      System.out.println("(3) Print list backwards");
      System.out.println("(4) Count nodes in list");
      System.out.println("(5) Delete from list");
      System.out.println("(Q) Quit\n");
      System.out.print("Choice ---> ");
      choice = console.readLine() + " ";  // kludge to ensure choice.charAt(0) > 0

      System.out.println();

      if ('1' <= choice.charAt(0) && choice.charAt(0) <= '5')
      {
        switch (choice.charAt(0))
        {
          case '1' :
            readData(dList);
            break;
          case '2' :
            System.out.println();
            System.out.println("The tree printed inorder\n");
            dList.printListForward();
            System.out.println();
            break;
          case '3' :
            dList.printListBackward();
            break;
          case '4' :
            System.out.println("Number of nodes = " + dList.size ());
            System.out.println();
            break;
          case '5' :
            testDelete(dList);
            break;
        }
      }
    }
    while (choice.charAt(0) != 'Q' && choice.charAt(0) != 'q');
  }

  public static void main(String[] args)
  {
    DoubleList test = new DoubleList();
    DoublyLinkedList list = new DoublyLinkedList();

    test.mainMenu (list);
  }
}