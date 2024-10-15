package stack;

public class Run {
  public static void main(String[] args) {
    Stack s = new Stack(3);
    s.push(1);
    s.push(2);
    s.push(3);

    while (!s.isEmpty()) {
      System.out.print(s.pop());
    }

  }
}
