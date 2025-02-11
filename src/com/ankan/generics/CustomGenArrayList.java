package com.ankan.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenArrayList<T> {
// Here we created a custom ArrayList with a Generic <T>
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
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
        T removed = (T) data[--size];
        return removed;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public void set (int index, T value) {
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
        CustomGenArrayList list = new CustomGenArrayList();
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

        CustomGenArrayList<Double> list3 = new CustomGenArrayList<>();
        for (double i = 0; i < 14; i++) {
         list3.add(2.5 * i);
        }
        System.out.println(list3);
        System.out.println(list3.get(5));
        System.out.println(list3.remove());
    }
}