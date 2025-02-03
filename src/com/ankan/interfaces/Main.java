package com.ankan.interfaces;

public class Main {
    public static void main(String[] args) {
        /*What things you access depends on ->*/ Engine car = /*Which version you access depends on this ->*/ new Car();
//        car.a;
//        car.accelerate();
//        car.start();
//        car.stop();

//        Media carMedia = new Car();
//        carMedia.stop();

        NiceCar car1 = new NiceCar();
        car1.start();
        car1.startMusic();
        car1.upgradeEngine();
        car1.start();
    }
}
