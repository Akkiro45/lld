package parkinglot.system.parkingspot;

import parkinglot.system.VehicleType;

public class FourWheelerSpot extends ParkingSpot {
    public FourWheelerSpot(String id, float rate, int level) {
        super(id, VehicleType.FOUR_WHEELERS, rate, level);
    }

    public boolean bookSpot(VehicleType vehicleType) {
        if(this.getSpotType() != vehicleType) {
            throw new IllegalArgumentException("Given vehicle cannot be park at this spot!");
        }
        return this.getIsAvailable();
    }

    public void freeSpot() {
        this.setIsAvailable(true);
    }
}
