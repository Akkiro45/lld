package parkinglot;

import parkinglot.system.ParkingSpace;
import parkinglot.system.parkingspot.FourWheelerSpot;
import parkinglot.system.parkingspot.TwoWheelerSpot;

public class Main {
    public static void main(String[] args) {
        ParkingSpace parkingSpace = ParkingSpace.getParkingSpace();
        parkingSpace.addLevel("L1");
        parkingSpace.addLevel("L2");
        parkingSpace.addParkingSpot(new TwoWheelerSpot("S1", 10, 0));
        parkingSpace.addParkingSpot(new FourWheelerSpot("S2", 20, 1));
        parkingSpace.addParkingSpot(new TwoWheelerSpot("S3", 10, 1));
        parkingSpace.addEntryGate("E1");
        parkingSpace.addExitGate("E2");
    }
}