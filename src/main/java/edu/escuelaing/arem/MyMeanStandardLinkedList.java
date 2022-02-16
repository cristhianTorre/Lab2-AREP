package edu.escuelaing.arem;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyMeanStandardLinkedList implements List {

    Node head = new Node(0,null);
    Node tail = new Node(0,null);
    int size = 0;
    int mean;
    int total = 0;
    int innermean;

    public static class Node{
        int index;
        double data;
        Node next;
        Node prior;

        public Node(double data, Node prior){
            this.data = data;
            this.prior = prior;
            this.next = null;
        }
    }

    public double calcMean(){
        mean = total/size;
        return mean;
    }

    public  double calcStandard(){
        double tmp = 0;
        innermean = total/size;
        Node data = head;
        for (int i=0;i<size;i++){
            tmp += (double)Math.pow((data.data - innermean),2);
        }
        return (double)Math.sqrt(tmp/(size-1));
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if(size == 0){
            return true;
        }
        return false;
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public boolean add(Object o) {
        return false;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean addAll(Collection c) {
        return false;
    }

    public boolean addAll(int index, Collection c) {
        return false;
    }

    public void clear() {

    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator listIterator() {
        return null;
    }

    public ListIterator listIterator(int index) {
        return null;
    }

    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    public boolean retainAll(Collection c) {
        return false;
    }

    public boolean removeAll(Collection c) {
        return false;
    }

    public boolean containsAll(Collection c) {
        return false;
    }

    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
