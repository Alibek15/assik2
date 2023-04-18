package entity;

import interfaces.MyList;
import org.w3c.dom.Node;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<T> implements MyList<T> {

    private class MyNode {
        private final T data;
        private MyNode next;
        private MyNode prev;

        public MyNode(T data) {
            this.data = data;
        }
    }

    private MyNode head;
    private MyNode tail;
    private int size;


    public void add(T item){
        MyNode newNode = new MyNode(item);
        size++;
        if(head == null){
            head = tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public T get(int index) {
        if (index < size / 2) {
            MyNode current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.data;
        }
        MyNode current = tail;
        for (int i = size - 1; i > index; i--) {
            current = current.prev;
        }
        return current.data;
    }

    public int size(){
        return size;
    }

   public void remove(int index){

       for (int i = 0; i < index; i++) {
           head = head.next;
       }

       if (head == head) {
           head = head.next;
       } else {
           head.prev.next = head.next;
       }

       if (head == tail) {
           tail = head.prev;
       } else {
           head.next.prev = head.prev;
       }

       size--;

   }

    public Iterator<T> iterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T>{
        MyNode cursor = head;

        @Override
        public boolean hasNext() {
            return cursor != null;
        }

        @Override
        public T next(){
            T data = cursor.data;
            cursor = cursor.next;
            return data;
        }

    }
}
