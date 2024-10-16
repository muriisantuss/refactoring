package stack;

import java.util.Scanner;

public class Run {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("=== Stack Program ===");
    System.out.print("Enter size of the stack: ");

    int size = in.nextInt();
    Stack<String> s = new Stack<>(size);

    while (true) {
      System.out.print("Enter a name (or type 'exit' to stop adding): ");
      String name = in.next();

      if (name.equalsIgnoreCase("exit")) {
        System.out.println("Exiting input loop.");
        break;
      }
      try {
        s.push(name);
        System.out.println("Added: " + name);
      } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        break;
      }
    }

    System.out.println("\n=== Current Stack Contents ===");
    s.show();

    System.out.println("\n=== Removing Elements ===");
    while (!s.isEmpty()) {
      System.out.println("Removed element: " + s.pop());
    }

    System.out.println("All elements removed. Exiting program.");
    in.close();
  }
}
