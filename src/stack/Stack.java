package stack;

public class Stack<T> extends Node<T> {

  public Stack(int size) {
    super(size);
  }

  public void push(T value) {
    if (this.isFull()) {
      throw new RuntimeException("Stack's full");
    }
    this.setTop(getTop() + 1);
    setElement(getTop(), value);
  }
  
  @SuppressWarnings("unchecked")
  public T pop() {
    if (this.isEmpty()) {
      throw new RuntimeException("Stack's empty");
    }
    T arrayElements = (T) getElement()[getTop()];
    this.setTop(getTop() - 1);

    return arrayElements;
  }

  @SuppressWarnings("unchecked")
  public T top() {
    if (this.isEmpty()) {
      throw new RuntimeException("Stack's empty");
    }
    
    return (T) getElement()[getTop()];
    
  }

  public boolean isEmpty() {
    return (getTop() == -1);
  }

  public boolean isFull() {
    return (getTop() == getElement().length - 1);
  }

  public void show() {
    if (this.isEmpty()) {
      throw new RuntimeException("Stack's empty");
    } 

    for (int i = getTop(); i >= 0; i--) {
      System.out.println(" -" + getElement()[i] + "- ");
    };
  }

}
