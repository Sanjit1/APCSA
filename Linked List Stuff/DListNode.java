public class DListNode<T> {
    private T value;
    private DListNode next;
    private DListNode previous;
    
    public DListNode(T initValue, DListNode initNext, DListNode initPrevious) {
        value = initValue;
        next = initNext;
        if (next != null)
            next.previous = this;
        previous = initPrevious;
        if (previous != null)
            previous.next = this;
    }

    public DListNode(T initValue) {
        this(initValue, null, null);
    }

    public T getValue() {
        return value;
    }

    public DListNode getNext() {
        return next;
    }

    public DListNode getPrevious() {
        return previous;
    }

    public void setValue(T theNewValue) {
        value = theNewValue;
    }

    public void setNext(DListNode theNewNext) {
        next = theNewNext;
    }

    public void setPrevious(DListNode theNewPrevious) {
        previous = theNewPrevious;
    }

    public String toString() {
        return "[ " + getValue() + "]";
    }
}