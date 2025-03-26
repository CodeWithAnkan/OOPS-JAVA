package com.ankan.fileHandling;

import java.io.*;

public class fileReader {
    public static void main(String[] args) throws IOException {
//        try (FileReader fr = new FileReader("fileHandling.txt")) {
//            int letters = fr.read(); // read() returns integer that's why we store the values in int
//            while (fr.ready()) {
//                System.out.println((char) letters);
//                letters = fr.read(); // moves to the next value
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) { // has to be reader type not inputStream type, so we need to convert byte stream into character stream using InputStreamReader
//            // byte to char stream --> reading char stream
//            System.out.print("Type something: ");
//            System.out.println("You typed: " + br.readLine());
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//        try (BufferedReader br2 = new BufferedReader(new FileReader("note.txt"))) {
//            while (br2.readLine() != null) {
//                System.out.println(br2.readLine());
//            }
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//    }

        //OutputWriter

        OutputStream os = System.out;
//    os.write(😘); // range is exceeded
        os.write(10); // adds new line, takes raw data (byte-based stream, 0-255)

        try(OutputStreamWriter osw = new OutputStreamWriter(System.out)) {
            osw.write("Hello World \n");
            osw.write(97);
            osw.write("\n");
            char[] arr = "Hello World".toCharArray();
            osw.write(arr);
            osw.write("😘");
            osw.write(10);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(FileWriter fw = new FileWriter("note.txt", true)) {
            fw.write(" I am in my 4th semester");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("note.txt"))) {
            bw.write("Hare Krishna");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

/*
The important note is that our keyboard gives byte input which is handled by InputStreamReader but for a class of Character stream it cannot handle input of type byte so we need InputStreamReader inside a bufferedReader to take byte as an input and then convert into char so that we can read one line at a time using readLine().
 */

}