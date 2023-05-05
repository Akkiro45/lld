package parkinglot.system.parkingspot;

import parkinglot.system.VehicleType;

public abstract class ParkingSpot {
    private String id;
    private float rate; // Hourly
    private VehicleType spotType;
    private boolean isAvailable;
    private int level;

    public ParkingSpot(String id, VehicleType spotType, float rate, int level) {
        this.id = id;
        this.spotType = spotType;
        this.rate = rate;
        this.isAvailable = true;
        this.level = level;
    }

    public float getRate() {
        return this.rate;
    }

    public String getId() {
        return this.id;
    }

    public VehicleType getSpotType() {
        return this.spotType;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    protected void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public int getLevel() {
        return this.level;
    }
    
    public abstract boolean bookSpot(VehicleType vehicleType);

    public abstract void freeSpot();
}
