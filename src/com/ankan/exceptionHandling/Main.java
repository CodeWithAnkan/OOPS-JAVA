package com.ankan.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//           divide(a, b);
           // mimicking an expression
          String name = "Ankan";
          if (name.equals("Ankan")) {
              throw new myException("Name is Ankan");
          }
        } catch (myException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("normal exception");
        } finally { // finally will execute despite any errors
            System.out.println("This will always execute");
        }
    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Please do not divide by zero");
        }
        return a/b;
    }
}