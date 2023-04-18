package entity;

import interfaces.MyList;

import java.util.*;

public class MyArrayList<T> implements MyList<T> {


    private Object[] listElements;
    private int size;


    public MyArrayList(final int size) { //констурктор по умолчанию
        this.size = size;
        listElements = new Object[size];

    }

    @Override
    public void add(final Object element) { //добавление элемента в конец списка
        int currentLength = listElements.length;
        if(size == currentLength){
            int newSize = currentLength*2;
            Object[] array = new Object[newSize];
            for (int i = 0; i < currentLength; i++) {
                array[i] = listElements[i];
            }
            listElements=array;
        }
        listElements[size+1] = element;
    }

    @Override
    public void add(final Object element, final int index) { //добавление элемента в заданную позицию
        int currentLength = listElements.length;
        if(size == currentLength){
            int newSize = currentLength*2;
            Object[] array = new Object[newSize];
            for (int i = 0; i < currentLength; i++) {
                array[i] = listElements[i];
            }
            listElements=array;
        }
        listElements[index] = element;
    }

    @Override
    public T get(final int index) { //получаение элемента по индексу
        return (T) listElements[index];
    }


    @Override
    public T remove(final int index) { //удаление элемента по индексу со сдвигом влево
        int currentLength = listElements.length;
        for (int i = index; i <size-1; i++) {
           listElements[i]=listElements[i+1];
        }
        listElements[size-1]=null;
        size--;
        return get(index);
    }

    @Override
    public boolean remove(final Object item) { //проверка на удаление элемента
        int currentLength = listElements.length;
        for (int i = 0; i < currentLength; i++) {
            if(item!=listElements[i]){
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() { // очистка всего
        int currentLength = listElements.length;
        for (int i = 0; i <currentLength ; i++) {
            listElements[i] = null;
        }

    }

    @Override
    public int indexOf(final Object o) { // посмотреть по какому индексу стоит элемент
        int currentLength = listElements.length;
        for (int i = 0; i <currentLength ; i++) {
            if(o.equals(listElements[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public void sort() { // упорядочивает элементы
        Arrays.sort(listElements);
    }

    @Override
    public int lastIndexOf(final Object o) { // получает последний индекс


        return (int)get(size-1);
    }

    @Override
    public int size() { //показывает количество элементов внутри списка
        return size;
    }

    @Override
    public boolean contains(final Object o) { //проверка на содержания внутри элемента
        int currentLength = listElements.length;
        for (int i = 0; i <currentLength ; i++) {
            if(o.equals(listElements[i])){
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() { //интерфейс для итерации
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> {
        private int cursor;

        @Override
        public boolean hasNext() {
            return cursor < size();
        }

        @Override
        public T next() {
            return get(cursor++);
        }
    }
}
