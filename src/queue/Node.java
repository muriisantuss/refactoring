package queue;

public class Node {
  private int values[];
  private int first;
  private int last;
  private int total;

  public Node(int size) {
    this.values = new int[size];
    this.first = 0;
    this.last = 0;
    this.total = 0;
  }

  public int[] getValues() {
    return values;
  }

  public void setValues(int[] values) {
    this.values = values;
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
