package stack;

public class Run {
  public static void main(String[] args) {
    Stack s = new Stack(10);

    s.push(19);
    s.push(29);
    s.push(39);
    
    s.show();
    
    while (!s.isEmpty()) {
      System.out.println("Removed element "+ s.pop());
    }

  }
}
