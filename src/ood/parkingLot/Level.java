package ood.parkingLot;

public class Level {
    private int floor;
    private ParkingSpot spot;
    private int availableSpots = 0;
    private static final int SPOTS_PER_ROW = 10;

    public Level(int floor, int numberSpots) {
        //...
    }

    public int getAvailableSpots() {
        return availableSpots;
    }
    public boolean parkVehicle(Vehicle vehicle) {
        //...
    }
    private boolean parkStartingAtSpot(int num, Vehicle v) {
        //...
    }

    private int findAvailableSpots(Vehicle vehicle) {
        //...
    }
    public void spotFreed() {
        availableSpots++;
    }
}
