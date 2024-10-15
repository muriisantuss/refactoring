package stack;

public class Stack extends Node {

  public Stack(int size) {
    super(size);
  }

  public boolean isEmpty() {
    return (getTop() == -1);
  }

  public boolean isFull() {
    return (getTop() == getElement().length - 1);
  }

}
