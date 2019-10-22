package session;

public class NodeStack<T> implements Stack<T> {
    private Node<T> top;
    private int size;

    public NodeStack() {
        top = null;
        size = 0;
    }

    @Override
    public void push(T value) {
        Node<T> node = new Node<>(value, top);
        top = node;
        size++;
    }

    @Override
    public T peek() {
        return top.getValue();
    }

    @Override
    public T pop() {
        T value = top.getValue();
        top = top.getNext();
        size--;
        return value;
    }

    @Override
    public int size() {
        return size;
    }
}
