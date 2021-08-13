package com.company;

public class Application {
    public static void main(String[] args) {
        // write your code here
        Vehicle vehicle = Factory.manufacture("motorcycle");

        vehicle.start();
        vehicle.stop();
        System.out.println(vehicle.type());

        Vehicle vehicle1 = Factory.manufacture("automobile");

        vehicle1.start();
        vehicle1.stop();
        System.out.println(vehicle1.type());

    }
}
