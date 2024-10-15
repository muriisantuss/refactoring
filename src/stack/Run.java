package stack;

public class Run {
  public static void main(String[] args) {
    Stack<String> s = new Stack<>(10);

    s.push("Muri");
    s.push("Yara");
    s.push("Forever");
    
    s.show();
    
    while (!s.isEmpty()) {
      System.out.println("Removed element "+ s.pop());
    }

  }
}
