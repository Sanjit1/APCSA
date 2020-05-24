/**
 *  Implementation of a node of a singly linked list.
 *
 *  Adapted from the College Board's AP Computer Science AB:
 *  Implementation Classes and Interfaces.
 */
public class ListNode<T>
{
  private T value;
  private ListNode<T> next;

  /**
   *  Constructs a new element with object initValue,
   *  followed by next element
   *
   * @param  initValue  New element object
   * @param  initNext   Reference to next element
   */
  public ListNode(T initValue, ListNode<T> initNext)
  {
    value = initValue;
    next = initNext;
  }

  /**
   *  Constructs a new tail of a list with object initValue
   *
   * @param  initValue  New element object
   */
  public ListNode(T initValue)
  {
    this(initValue, null);
  }

  /**
   *  Sets the value attribute of the ListNode object
   *
   * @param  theNewValue  value attribute of the ListNode object
   */
  public void setValue(T theNewValue)
  {
    value = theNewValue;
  }

  /**
   *  Sets reference to new next value
   *
   * @param  theNewNext  The new next value
   */
  public void setNext(ListNode<T> theNewNext)
  {
    next = theNewNext;
  }

  /**
   *  Returns value associated with this element
   *
   * @return    The value associated with this element
   */
  public T getValue()
  {
    return value;
  }

  /**
   *  Returns reference to next value in list
   *
   * @return    The next value in the list
   */
  public ListNode<T> getNext()
  {
    return next;
  }
}