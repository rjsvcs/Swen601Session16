package session;

public interface Queue<T> {
    void enqueue(T value);
    T peek();
    T dequeue();
    int size();
}
