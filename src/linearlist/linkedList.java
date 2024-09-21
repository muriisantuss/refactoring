package linearlist;

public class linkedList<T> {
  private Node<T> first;
  private Node<T> last;
  private int size;

  public linkedList() {
    this.first = null;
    this.last = null;
    this.size = 0;
  }

  // support methods
  public boolean empty() {
    return (this.size == 0);
  }

  public boolean notEmpty() {
    return (this.size > 0);
  }

  public int addSize() {//
    return this.size++;
  }

  public int decSize() {
    return this.size--;
  }

  // linked list methods
  public T add(T element) {
    Node<T> item = new Node<>(element);
    if (this.empty()) {
      this.first = item;
    }
    if (this.notEmpty()) {
      this.last.setNext(item);
    }
    this.last = item;
    this.addSize();

    return element;
  }

  @Override
  public String toString() {
    return "linkedList [first=" + first + ", last=" + last + ", size=" + size + "]\n";
  }

}
