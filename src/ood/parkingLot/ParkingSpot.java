package ood.parkingLot;

public class ParkingSpot {
    private Vehicle vehicle;
    private VehicleSize spotSize;
    private int row;
    private int spotNumber;
    private Level level;

    public ParkingSpot(Level lvl, int r, int n, VehicleSize s) {
        level = lvl;
        row = r;
        spotNumber = n;
        spotSize = s;
    }

    public boolean isAvailable() {
        return vehicle == null;
    }

    public boolean canFitVehicle(Vehicle vehicle) {
        return isAvailable() && vehicle.canFitInSpot(this);
    }

    public boolean park(Vehicle v) {
        if (!canFitVehicle(v))
            return false;

        vehicle = v;
        vehicle.parkInSpot(this);
        return true;
    }

    public int getRow() {
        return row;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public VehicleSize getSize() {
        return spotSize;
    }

    public void removeVehicle() {
        level.spotFreed();
        vehicle = null;
    }

    public void print() {
        if (vehicle == null) {
            if (spotSize == VehicleSize.Compact)
                System.out.print("c");
            else if (spotSize == VehicleSize.Large)
                System.out.print("l");
            else if (spotSize == VehicleSize.Motorcycle)
                System.out.print("m");
        }
        else
            vehicle.print();
    }
}
