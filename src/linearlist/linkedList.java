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

  public boolean sizeEqualOne() {
    return (this.size == 1);
  }

  public int addSize() {//
    return this.size++;
  }

  public int decSize() {
    return this.size--;
  }

  public String theListEmpty() {
    return "The list is empty.";
  }

  // linked list methods
  public T addLast(T element) {
    Node<T> item = new Node<>(element);
    if (this.empty()) {
      return addFirst(element);
    }
    if (this.notEmpty()) {
      this.last.setNext(item);
    }
    this.last = item;
    this.addSize();

    return element;
  }

  public T addFirst(T element) {
    if (empty()) {
      Node<T> item = new Node<T>(element);
      this.first = this.last = item;
    }
    if (notEmpty()) {
      Node<T> newNode = new Node<T>(element, this.first);
      this.first = newNode;
    }
    this.addSize();
    return element;
  }

  public String travel() {
    if (this.empty()) {
      return "[]";
    }

    Node<T> current = this.first;
    System.out.print("[");
    for (int i = 0; i < this.size - 1; i++) {
      System.out.print(current.getElement() + ", ");
      current = current.getNext();
    }
    
    return current.getElement() + "]";
  }

  @Override
  public String toString() {
    return travel();
  }

}
