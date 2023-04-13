package entity;

import interfaces.MyList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList implements MyList {

    private Object[] listElements;
    private int size;

    public MyArrayList(final int size) {
        this.size = size;
        listElements = new Object[size];

    }

    @Override
    public void add(final Object element) {
        int currentLength = listElements.length;
        if(size == currentLength){
            int newSize = currentLength*2;
            Object[] array = new Object[newSize];
            for (int i = 0; i < currentLength; i++) {
                array[i] = listElements[i];
            }
            listElements=array;
        }
    }

    @Override
    public void get(final int index) {

    }

    @Override
    public void remove(final int index) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
