package parkinglot.system;

import java.util.Date;

import parkinglot.system.parkingspot.ParkingSpot;

public class Ticket {
    private long id;
    private ParkingSpot parkingSpot;
    private String vehicleNumber;
    private long startTimeStamp;

    public Ticket(String vehicleNumber, ParkingSpot parkingSpot) {
        this.vehicleNumber = vehicleNumber;
        this.parkingSpot = parkingSpot;
        this.startTimeStamp = new Date().getTime();
        this.id = this.startTimeStamp;
    }

    public long getId() {
        return this.id;
    }

    public ParkingSpot getParkingSpot() {
        return this.parkingSpot;
    }

    public String getVehicleNumber() {
        return this.vehicleNumber;
    }

    public long getStartTimeStamp() {
        return this.startTimeStamp;
    }
}
