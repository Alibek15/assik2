package interfaces;

public interface MyList<T> extends Iterable<T> {
    void add(T element);
    T get(int index);

    void remove(int index);

    int size();

}
