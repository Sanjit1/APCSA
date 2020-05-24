import java.util.*;

/**
 *  Implementation of lists, using singly linked elements.
 *
 * @author     G. Peck
 * @created    April 27, 2002
 */
public class SinglyLinkedList<E>
{
    private ListNode<E> first;  // first element
    private ListNode<E> last;
    /**
     *  Constructor for the SinglyLinkedList object
     *  Generates an empty list.
     */
    public SinglyLinkedList()
    {
        first = null;
        last = null;
    }

    /**
     *  Returns the first element in this list.
     *
     * @return  the first element in the linked list.
     */
    public E getFirst()
    {
        if (first == null)
        {
            throw new NoSuchElementException();
        }
        else
            return first.getValue();
    }

    public E getLast() {
        if (last == null) {
            return getFirst();
        } else {
            return last.getValue();
        }
    }

    public int size() {
        int size = 0;
        if(first != null) {
            size++;
            ListNode<E> next = first;
            while(next.getNext() != null) {
                next = next.getNext();
                size++;
            }
        }
        return size;
    }

    public E remove(E element){
        Comparable<E> elemC = (Comparable<E>) element;
        ListNode<E> next = first;
        while(next.getNext() != null && elemC.compareTo(next.getNext().getValue()) != 0) {
            next = next.getNext();
        }
        if (next.getNext()==null)
            return null;
        else{
            ListNode<E> gc = next.getNext();
            next.setNext(next.getNext().getNext());
            gc = null;
            return next.getNext().getValue();
        }
    }

    public void clear() {
        first = null;
        last = null;
        //could not figure out garbage collection.
    }

    /**
     *  Inserts the given element at the beginning of this list.
     *
     * @param  value  the element to be inserted at the beginning of this list.
     */
    public void addFirst(E value)
    {
        // note the order that things happen:
        // head is parameter, then assigned
        first = new ListNode<E>(value, first);
    }

    public void addLast (E value) {
        if (first == null) {
            addFirst(value);
        } else {
            ListNode<E> last = new ListNode<E>(value, null);
            ListNode<E> next = first;
            while(next.getNext() != null) {
                next = next.getNext();
            }
            next.setNext(last);
        }
    }

    public E get(int pos) {
        ListNode<E> next = first;
        for (int i = 0; i < pos; i++) {
            next = next.getNext();
        }
        return next.getValue();
    }

    public void insertAtPos(int pos, E value) {
        ListNode<E> newNode = new ListNode<E>(value, null);
        ListNode<E> next = first;
        for (int i = 1; i < pos; i++) {
            next = next.getNext();
        }
        newNode.setNext(next.getNext());
        next.setNext(newNode);
    }

    public void insert(E element) {
        Comparable<E> elemC = (Comparable<E>) element;
        if(first == null || elemC.compareTo(first.getValue())<1) {
            addFirst(element);
        } else {
            ListNode<E> newNode = new ListNode<E>(element, null);
            ListNode<E> next = first;
            while(next.getNext()!=null && elemC.compareTo(next.getNext().getValue())>-1) {
                next = next.getNext();
            }
            newNode.setNext(next.getNext());
            next.setNext(newNode);
        }
    }

    public E find (E element) {
        Comparable<E> elemC = (Comparable<E>) element;
        ListNode<E> next = first;
        while(next.getNext() != null && elemC.compareTo(next.getNext().getValue()) != 0) {
            next = next.getNext();
        }
        return next.getNext() == null ? null : next.getNext().getValue();
    }

    /**
     *  Print the contents of the entire linked list
     */
    public void printList()
    {               
        ListNode<E> temp = first;// start from the first node
        while (temp != null)
        {
            System.out.println(temp.getValue() + " ");
            temp = temp.getNext();// go to next node
        }
    }

    public void printBackwards() { // for some dumb fucking reason
        if(first != null)
            printBackwards(first);
        else 
            System.out.println("The list is MT like my dogs brain.");
    }

    public void printBackwards (ListNode<E> temp) {
        if(temp.getNext() != null) {
            printBackwards(temp.getNext());
        } 
        System.out.println(temp.getValue() + " ");
    }

    /**
     *  Returns a string representation of this list. The string
     *  representation consists of the list's elements in order,
     *  enclosed in square brackets ("[]"). Adjacent elements are
     *  separated by the characters ", " (comma and space).
     *
     * @return    string representation of this list
     */
    public String toString()
    {
        String s = "[";

        ListNode<E> temp = first;  // start from the first node
        while (temp != null)
        {
            s += temp.getValue(); // append the data
            temp = temp.getNext();      // go to next node
            if (temp != null)
                s += ", ";
        }
        s += "]";
        return s;
    }
}