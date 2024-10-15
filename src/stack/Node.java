package stack;

public class Node {
  private int element[];
  private int top;

  public Node(int size) {
    this.element = new int[size];
    this.top = -1;
  }

  public int[] getElement() {
    return element;
  }

  public void setElement(int index, int value) {
    this.element[index] = value;
  }

  public int getTop() {
    return top;
  }

  public void setTop(int top) {
    this.top = top;
  }

}
