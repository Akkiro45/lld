package parkinglot.system;

import java.util.ArrayList;
import java.util.List;

import parkinglot.system.gate.EntryGate;
import parkinglot.system.gate.ExitGate;
import parkinglot.system.gate.Gate;
import parkinglot.system.parkingspot.ParkingSpot;

public class ParkingSpace {
    private static ParkingSpace instance = null;
    private List<Level> levels;
    private List<Gate> entries;
    private List<Gate> exits;

    private ParkingSpace() {
        this.levels = new ArrayList<>();
        this.entries = new ArrayList<>();
        this.exits = new ArrayList<>();
    }

    public static ParkingSpace getParkingSpace() {
        if(instance == null) {
            instance = new ParkingSpace();
        }
        return instance;
    }

    public void addLevel(String id) {
        this.levels.add(new Level(id));
    }

    public void addEntryGate(String id) {
        entries.add(new EntryGate(id));
    }

    public void addExitGate(String id) {
        exits.add(new ExitGate(id));
    }

    public List<Gate> getEntries() {
        return entries;
    }

    public List<Gate> getExits() {
        return exits;
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        this.levels.get(parkingSpot.getLevel()).addParkingSpot(parkingSpot);
    }

    public ParkingSpot findParkingSpot(VehicleType vehicleType) {
        ParkingSpot parkingSpot = null;
        for(Level level : levels) {
            parkingSpot = level.findParkingSpot(vehicleType);
            if(parkingSpot != null) {
                return parkingSpot;
            }
        }
        return parkingSpot;
    }

    public void bookParkingSpot(ParkingSpot parkingSpot, VehicleType vehicleType) {
        this.levels.get(parkingSpot.getLevel()).bookParkingSpot(parkingSpot, vehicleType);
    }

    public void freeParkingSpot(ParkingSpot parkingSpot) {
        this.levels.get(parkingSpot.getLevel()).freeParkingSpot(parkingSpot);
    }
}
