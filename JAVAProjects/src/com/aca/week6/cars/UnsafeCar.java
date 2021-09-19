package com.aca.week6.cars;

import java.util.ArrayList;
import java.util.List;

public class UnsafeCar implements Car {
    private final static int PASSENGERS_COUNT = 6;

    private int busyPlaces = 0;
    private final List<String> passengersNames = new ArrayList<>();

    @Override
    public void add(String passengerName) {
        if(busyPlaces != PASSENGERS_COUNT) {
            passengersNames.add(passengerName);
            busyPlaces++;
        }
    }

    @Override
    public void printPassengerNames() {
        System.out.println("Passengers: ");
        for(String name: passengersNames) {
            System.out.println(name);
        }

    }

}
