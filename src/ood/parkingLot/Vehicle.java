package ood.parkingLot;

import java.util.ArrayList;

public abstract class Vehicle {
    protected ArrayList<ParkingSpot> parkingSpots = new ArrayList<ParkingSpot>();
    protected String licensePlate;
    protected int spotsNeeded;
    protected VehicleSize size;

    public int getSpotsNeeded() {
        return spotsNeeded;
    }

    public VehicleSize getSize() {
        return size;
    }

    // Park vehicle in this spot (among others, potentially)
    public void parkInSpot(ParkingSpot s) {
        parkingSpots.add(s);
    }

    // Remove car from spot and notify spot that it's gone
    public void clearSpots() {
        //...
        parkingSpots.clear();
        System.out.println("Spots for Vehicle cleared.");
    }

    public abstract boolean canFitInSpot(ParkingSpot spot);
    public abstract void print();
}
