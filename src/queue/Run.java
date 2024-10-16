package queue;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== Queue Program ===");
        System.out.println("Enter size of the queue (type 'exit' to close):");

        int size = in.nextInt();
        Queue<String> q = new Queue<>(size);

        while (true) {
            System.out.print("Enter a name (or type 'exit' to stop adding): ");
            String name = in.next();

            if (name.equalsIgnoreCase("exit")) {
                System.out.println("Exiting input loop.");
                break;
            }
            try {
                q.enqueue(name);
                System.out.println("Added: " + name);
            } catch (RuntimeException e) {
                System.out.println("Error: " + e.getMessage());
                break;
            }
        }

        System.out.println("\n=== Queue Contents ===");
        q.show();

        System.out.println("\n=== Removing Elements ===");
        while (!q.isEmpty()) {
            System.out.println("Name removed: " + q.dequeue());
        }

        System.out.println("All elements removed. Exiting program.");
        in.close();
    }
}
