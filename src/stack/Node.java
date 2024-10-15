package stack;

public class Node {
  private int element[];
  private int top;

  public Node(int[] element, int top) {
    this.element = element;
    this.top = top;
  }

  public int[] getElement() {
    return element;
  }

  public void setElement(int[] element) {
    this.element = element;
  }

  public int getTop() {
    return top;
  }

  public void setTop(int top) {
    this.top = top;
  }

}
