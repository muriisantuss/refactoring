package queue;

public class Run {
    public static void main(String[] args) {
        Queue q = new Queue(10);

        q.enqueue(19);
        q.enqueue(29);
        q.enqueue(39);

        q.show();

        System.out.println();
        
        while (!q.isEmpty()) {
            System.out.println("Element removed: " + q.dequeue());
        }
    }
}
