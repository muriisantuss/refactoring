package stack;

public class Node<T>{
  private Object[] element;
  private int top;

  public Node(int size) {
    this.element = new Object[size];
    this.top = -1;
  }

  public Object[] getElement() {
    return element;
  }

  public void setElement(int index, T value) {
    this.element[index] = value;
  }

  public int getTop() {
    return top;
  }

  public void setTop(int top) {
    this.top = top;
  }

}
