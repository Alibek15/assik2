package entity;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList implements List {

    private Object[] listElements;
    private int size;
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(final Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(final Object o) {

        return false;
    }

    @Override
    public boolean remove(final Object o) {
        return false;
    }

    @Override
    public boolean addAll(final Collection c) {
        return false;
    }

    @Override
    public boolean addAll(final int index, final Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Object get(final int index) {
        return null;
    }

    @Override
    public Object set(final int index, final Object element) {
        return null;
    }

    @Override
    public void add(final int index, final Object element) {

    }

    @Override
    public Object remove(final int index) {
        return null;
    }

    @Override
    public int indexOf(final Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(final Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(final int index) {
        return null;
    }

    @Override
    public List subList(final int fromIndex, final int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(final Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(final Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(final Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(final Object[] a) {
        return new Object[0];
    }
}
