package interfaces;

public interface MyList<T> extends Iterable<T> {
    void add(T element);
    void get(int index);

    void remove(int index);



}
