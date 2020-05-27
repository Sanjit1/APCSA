import java.util.*;
public class DoublyLinkedList<E> {
    private DListNode<E> first; 
    private DListNode<E> last;
    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    public E getFirst() {
        if (first == null) {
            throw new NoSuchElementException();
        } else {
            return first.getValue();
        }
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
            DListNode<E> next = first;
            while(next.getNext() != null) {
                next = next.getNext();
                size++;
            }
        }
        return size;
    }

    public E remove(E element) {
        Comparable<E> elemC = (Comparable<E>) element;
        DListNode<E> next = new DListNode(null, first, null);
        while(next.getNext() != next && elemC.compareTo((E)next.getNext().getValue()) !=0) {
            next = next.getNext();
        }
        if (next.getNext()==null) {
            return null;
        } else {
            DListNode<E> gc = next.getNext();
            next.setNext(next.getNext().getNext());
            next.getNext().getNext().setPrevious(next);
            gc = null;
            return (E)next.getNext().getValue();
        }
    }

    public void clear() {
        first = null;
        last = null;
        //could not figure out garbage collection.
    }

    public void addFirst(E value) {
        first = new DListNode<E>(value, first, null);
    }

    public void addLast (E value) {
        if (first == null) {
            addFirst(value);
        } else {
            DListNode<E> last = new DListNode<E>(value, null, null);
            DListNode<E> next = first;
            while(next.getNext() != null) {
                next = next.getNext();
            }
            next.setNext(last);
            last.setPrevious(next);
        }
    }

    public E get(int pos) {
        DListNode<E> next = first;
        for (int i = 0; i < pos; i++) {
            next = next.getNext();
        }
        return next.getValue();
    }

    public void insertAtPos(int pos, E value) {
        DListNode<E> newNode = new DListNode<E>(value, null, null);
        DListNode<E> next = first;
        for (int i = 1; i < pos; i++) {
            next = next.getNext();
        }
        newNode.setNext(next.getNext());
        newNode.setPrevious(next);
        next.getNext().setPrevious(newNode);
        next.setNext(newNode);
    }

    public void insert(E element) {
        Comparable<E> elemC = (Comparable<E>) element;
        if(first == null || elemC.compareTo(first.getValue())<1) {
            addFirst(element);
        } else {
            DListNode<E> newNode = new DListNode<E>(element, null, null);
            DListNode<E> next = first;
            while(next.getNext()!=null && elemC.compareTo((E) next.getNext().getValue())>-1) {
                next = next.getNext();
            }
            if(next.getNext()==null) {
                addLast(element);
            } else {
                newNode.setNext(next.getNext());
                newNode.setPrevious(next);
                next.getNext().setPrevious(newNode);
                next.setNext(newNode);
            }
        }
    }

    public E find(E element) {
        Comparable<E> elemC = (Comparable<E>) element;
        DListNode<E> next = new DListNode<E>(null, first, null);
        while(next.getNext() != null && elemC.compareTo((E) next.getNext().getValue()) != 0) {
            next = next.getNext();
        }
        return next.getNext() == null ? null : (E) next.getNext().getValue();
    }

    public void printListForward() {               
        DListNode<E> temp = first;
        while (temp != null) {
            System.out.println(temp.getValue() + " ");
            temp = temp.getNext();
        }
    }

    public void printListBackward() {
        if(first != null) {
            printListBackward(first);
        } else {
            System.out.println("The list is MT like my dogs brain.");
        }
    }

    public void printListBackward(DListNode<E> temp) {
        if(temp.getNext() != null) {
            printListBackward(temp.getNext());
        } 
        System.out.println(temp.getValue() + " ");
    }

    public String toString() {
        String s = "[";
        DListNode<E> temp = first;
        while (temp != null) {
            s += temp.getValue(); 
            temp = temp.getNext();
            if (temp != null) {
                s += ", ";
            }
        }
        s += "]";
        return s;
    }
}