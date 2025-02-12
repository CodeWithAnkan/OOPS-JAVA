package com.ankan.Questions;

public class Fellowship {
    public static void main(String[] args) {
        int h0 = Numinor.Members.HOBBITS.getHeight();
        System.out.println(h0);
//        int h1 = Numinor.Members.getHeight();
        int h3 = Numinor.Members.ELVES.height;
        System.out.println(h3);
    }
}
class Numinor {
    enum Members {
        HOBBITS(48), ELVES(74), DWARVES(50);
        int height;
        Members(int h) {
            this.height = h;
        }
        int getHeight () {
            return height;
        }
    }
}