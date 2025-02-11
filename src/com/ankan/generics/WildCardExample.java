package com.ankan.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildCardExample<T extends Number> {
// Here to restrict to only Integer types, we must extend to Number
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public WildCardExample() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<Number> list) {
        // do something

        // here you can only pass Number type
    }

    // WildCard

    public void getList1(List<? extends Number> list) {
        // here we can pass subclasses of Number -> int, float, double
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the new items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T) (data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public void set (int index, int value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        WildCardExample list = new WildCardExample();
//        list.add(3);
//        list.add(5);
//        list.add(9);

//        for (int i = 0; i < 14; i++) {
//            list.add(2 * i);
//        }
//
//        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("dfgg");
        // Generics help us in providing a parameterized type for stuff like <Integer> and all.

        WildCardExample<Integer> list3 = new WildCardExample<>();
        for (int i = 0; i < 14; i++) {
         list3.add(2 * i);
        }
        System.out.println(list3);
    }
}