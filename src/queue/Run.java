package queue;

public class Run {
    public static void main(String[] args) {
        Queue<String> q = new Queue<>(10);

        q.enqueue("Amanda");
        q.enqueue("Ary");
        q.enqueue("Marcia");

        q.show();

        System.out.println();

        while (!q.isEmpty()) {
            System.out.println("Name removed: " + q.dequeue());
        }
    }
}
