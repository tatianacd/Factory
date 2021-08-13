package com.company;

public class Factory {
    public static Vehicle manufacture(String tipo) {
        switch (tipo) {
            case "motorcycle":
                return new Motorcycle();
            case "automobile":
                return new Automobile();
            default:
                System.out.println("the selected vehicle is not available at the factory");
                return null;

        }
    }
}
