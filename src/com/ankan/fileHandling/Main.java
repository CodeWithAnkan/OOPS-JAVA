package com.ankan.fileHandling;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        // create
        try{
            File fo = new File("new-file.txt");
            fo.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // write in the file
        try{
            FileWriter fw = new FileWriter("new-file.txt");
            fw.write("सर्वधर्मान्परित्यज्य मामेकं शरणं व्रज |\n" + "अहं त्वां सर्वपापेभ्यो मोक्षयिष्यामि मा शुच:");
            fw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // reading the file
        try {
            BufferedReader br = new BufferedReader(new FileReader("new-file.txt"));
            while (br.ready()) {
                System.out.println(br.readLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // creating random file and deleting
        try{
            File fo = new File("random.txt");
            fo.createNewFile();
            if (fo.delete()){
                System.out.println(fo.getName());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
