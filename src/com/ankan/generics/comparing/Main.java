package com.ankan.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student ankan = new Student(1814, 95.87f);
        Student rahul = new Student(2222, 99.98f);
        Student amrit = new Student(1812, 92.92f);
        Student abin = new Student(1806, 89.90f);
        Student pritam = new Student(1851, 72.23f);
        Student srestho = new Student(1875, 100.00f);

        Student[] list = {ankan, rahul, amrit, abin, pritam, srestho};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks));
//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return (int) (o1.marks - o2.marks);
//            }
//        });

//        Arrays.sort(list);
        /*
        When you call Arrays.sort(list), Java automatically sorts the array using the natural ordering defined by the compareTo() method in the Student class. This works because:

        Student implements Comparable<Student>

        This means Java knows how to compare two Student objects.
        compareTo() is overridden in Student

        Arrays.sort() Uses TimSort Algorithm

        It repeatedly calls compareTo() on elements to compare and sort them.
*/

        System.out.println(Arrays.toString(list));

//        if (ankan.compareTo(rahul) < 0) {
//            System.out.println(ankan.compareTo(rahul));
//            System.out.println("Rahul has more marks");
//        }
    }
}
