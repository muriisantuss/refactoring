package queue;

public class Queue extends Node{
    public Queue(int size) {
        super(size);
    }

    public boolean isEmpty(){
        return (getTotal() == 0);
    }
    public boolean isFull(){
        return (getTotal() == getValues().length);
    }
}
