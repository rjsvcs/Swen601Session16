package session;

public class NodeQueue<T> implements Queue<T> {

    private Node<T> front;
    private Node<T> back;
    private int size;

    public NodeQueue() {
        front = null;
        back = null;
        size = 0;
    }

    @Override
    public void enqueue(T value) {
        Node<T> node = new Node<>(value);
        if(front == null) {
            front = node;
            back = node;
        } else {
            back.setNext(node);
            back = node;
        }
        size++;
    }

    @Override
    public T peek() {
        return front.getValue();
    }

    @Override
    public T dequeue() {
        T value = front.getValue();
        front = front.getNext();
        size--;
        return value;
    }

    @Override
    public int size() {
        return size;
    }
}
