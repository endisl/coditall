package ood.parkingLot;

public class Level {
    private int floor;
    private ParkingSpot[] spots;
    private int availableSpots = 0;
    private static final int SPOTS_PER_ROW = 10;

    public Level(int floor, int numberSpots) {
        this.floor = floor;
        spots = new ParkingSpot[numberSpots];
        int largeSpots = numberSpots / 4;
        int motoSpots = numberSpots / 4;
        int compactSpots = numberSpots - largeSpots - motoSpots;
        for (int i = 0; i < numberSpots; i++) {
            VehicleSize size = VehicleSize.Motorcycle;
            if (i < largeSpots)
                size = VehicleSize.Large;
            else if (i < largeSpots + compactSpots)
                size = VehicleSize.Compact;
            int row = i / SPOTS_PER_ROW;
            spots[i] = new ParkingSpot(this, row, i, size);
        }
        availableSpots = numberSpots;
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
