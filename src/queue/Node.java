package queue;

public class Node<T> {
  private Object[] values;
  private int first;
  private int last;
  private int total;

  public Node(int size) {
    this.values = new Object[size];
    this.first = 0;
    this.last = 0;
    this.total = 0;
  }

  public Object[] getValues() {
    return values;
  }

  public void setValues(int index, T values) {
    this.values[index] = values;
  }

  public int getFirst() {
    return first;
  }

  public void setFirst(int first) {
    this.first = first;
  }

  public int getLast() {
    return last;
  }

  public void setLast(int last) {
    this.last = last;
  }

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

}
