package com.ankan.interfaces;

public class CDPlayer implements Media {
    @Override
    public void start() {
        System.out.println("Music started");
    }

    @Override
    public void stop() {
        System.out.println("Music stopped");
    }
}
