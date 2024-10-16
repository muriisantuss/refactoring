package queue;

public class Queue<T> extends Node<T> {
    public Queue(int size) {
        super(size);
    }

    public void enqueue(T value) {
        if (this.isFull()) {
            throw new RuntimeException("Queue's Full!");
        }
        setValues(getLast(), value);
        setLast((getLast() + 1) % getValues().length);
        setTotal(getTotal() + 1);
    }
    

    @SuppressWarnings("unchecked")
    public T dequeue() {
        if (this.isEmpty()) {
            throw new RuntimeException("Queue's empty!");
        }

        T element = (T) getValues()[getFirst()];
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
            int index = (getFirst() + travel) % getValues().length;
            System.out.println("Name[" + travel + "] " + getValues()[index]);
        }
    }
}
