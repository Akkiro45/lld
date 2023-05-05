package parkinglot.system.parkingspot;

import parkinglot.system.VehicleType;

public class TwoWheelerSpot extends ParkingSpot {
    public TwoWheelerSpot(String id, float rate, int level) {
        super(id, VehicleType.TWO_WHEELERS, rate, level);
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
