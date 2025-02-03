package com.ankan.access;

public class ObjectDemo {

    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
    }

    // it basically gives an unique number representation of a object
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // already covered
    @Override
    public String toString() {
        return super.toString();
    }
    // already covered
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(34, 9.2f);
        ObjectDemo obj2 = new ObjectDemo(34, 8.2f);

        if (obj1 == obj2) {
            System.out.println("obj is equal to obj2");
        }

        if (obj1.equals(obj2)) {
            System.out.println("obj is equal to obj2");
        }

        System.out.println(obj1.getClass().getName());

//        System.out.println(obj2.hashCode());
//        System.out.println(obj1.hashCode());
    }
}
