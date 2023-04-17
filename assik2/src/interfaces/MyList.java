package interfaces;

public interface MyList<T> extends Iterable<T> {
    int size();
    boolean contains(Object o);

    void add(T element);
    void add(T element, int index);


    T get(int index);

    T remove(int index);
    boolean remove(T item);
    void clear();
    int indexOf(Object o);
    void sort();
    int lastIndexOf(Object o);


}
