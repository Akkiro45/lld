package parkinglot.system;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import parkinglot.system.parkingspot.ParkingSpot;

public class Level {
    private String id;
    private Map<VehicleType, Set<ParkingSpot>> freeParkingSpots;
    private Map<VehicleType, Set<ParkingSpot>> occupiedParkingSpots;

    public Level(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void addParkingSpot(Map<VehicleType, Set<ParkingSpot>> spots, ParkingSpot parkingSpot) {
        if(!spots.containsKey(parkingSpot.getSpotType())) {
            spots.put(parkingSpot.getSpotType(), new HashSet<ParkingSpot>());
        }
        spots.get(parkingSpot.getSpotType()).add(parkingSpot);
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        this.addParkingSpot(freeParkingSpots, parkingSpot);
    }

    public ParkingSpot findParkingSpot(VehicleType vehicleType) {
        if(!freeParkingSpots.containsKey(vehicleType)) {
            throw new IllegalArgumentException("Given vehicle is not allowed!");
        }
        Set<ParkingSpot> availableSpots = freeParkingSpots.get(vehicleType);
        if(availableSpots.size() == 0) {
            return null;
        }
        return availableSpots.iterator().next();
    }

    public void bookParkingSpot(ParkingSpot parkingSpot, VehicleType vehicleType) {
        parkingSpot.bookSpot(vehicleType);
        freeParkingSpots.get(vehicleType).remove(parkingSpot);
        this.addParkingSpot(occupiedParkingSpots, parkingSpot);
    }

    public void freeParkingSpot(ParkingSpot parkingSpot) {
        parkingSpot.freeSpot();
        occupiedParkingSpots.get(parkingSpot.getSpotType()).remove(parkingSpot);
        this.addParkingSpot(freeParkingSpots, parkingSpot);
    }
}
