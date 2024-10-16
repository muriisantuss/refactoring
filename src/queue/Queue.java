package queue;

public class Queue extends Node {
    public Queue(int size) {
        super(size);
    }

    public void enqueue(int value) {
        if (this.isFull()) {
            throw new RuntimeException("Queue's full!");
        }
        setValues(getTotal(), value);
        setLast(getTotal());
        setTotal((getTotal() + 1) % getValues().length);
    }

    public int dequeue() {
        if (this.isEmpty()) {
            throw new RuntimeException("Queue's empty!");
        }

        int element = getValues()[getFirst()];
        setFirst((getFirst() + 1) % getValues().length);
        setTotal(getTotal() - 1);
        return element;
    }

    public boolean isEmpty() {
        return (getTotal() == 0);
    }

    public boolean isFull() {
        return (getTotal() == getValues().length);
    }

    public void show() {
        if (this.isEmpty()) {
            throw new RuntimeException("Queue's empty!");
        }
        
        for (int travel = 0; travel < getTotal(); travel++) {
            System.out.println("Element[" + travel + "] " + getValues()[travel]);
        }
    }
}
