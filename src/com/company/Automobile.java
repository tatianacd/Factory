package com.company;

public class Automobile implements Vehicle {
    @Override
    public void start() {
        System.out.println("Automobile starting...");
    }

    @Override
    public void stop() {
        System.out.println("Automobile stopping...");
    }

    @Override
    public String type() {
        return "Automobile";
    }
}
