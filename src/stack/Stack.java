package stack;

public class Stack extends Node {

  public Stack(int size) {
    super(size);
  }

  public void push(int value) {
    if (this.isFull()) {
      throw new RuntimeException("Stack's full");
    }
    this.setTop(getTop() + 1);
    setElement(getTop(), value);
  }

  public int pop() {
    if (this.isEmpty()) {
      throw new RuntimeException("Stack's empty");
    }
    int arrayElements = getElement()[getTop()];
    this.setTop(getTop() - 1);

    return arrayElements;
  }

  public int top() {
    if (this.isEmpty()) {
      throw new RuntimeException("Stack's empty");
    }
    return getElement()[getTop()];
  }

  public boolean isEmpty() {
    return (getTop() == -1);
  }

  public boolean isFull() {
    return (getTop() == getElement().length - 1);
  }

}
