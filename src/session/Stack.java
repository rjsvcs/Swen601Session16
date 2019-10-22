package session;

public interface Stack<T> {
    void push(T value);
    T peek();
    T pop();
    int size();
}
