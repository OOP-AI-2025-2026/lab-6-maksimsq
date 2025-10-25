package org.example;

public class Smartphone implements GPS, Cellular {
    private String model;
    private double latitude;
    private double longitude;

    public Smartphone(String model, double latitude, double longitude) {
        this.model = model;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double[] getCoordinates() {
        return new double[]{latitude, longitude};
    }

    @Override
    public void makeCall() {
        System.out.println(model + " is making a call...");
    }

    public void receiveCall() {
        System.out.println(model + " is receiving a call...");
    }

    public void printCoordinates() {
        double[] coords = getCoordinates();
        System.out.println(model + " location: Latitude = " + coords[0] + ", Longitude = " + coords[1]);
    }
}
}