package parkinglot.system.gate;

import parkinglot.system.Ticket;
import parkinglot.system.VehicleType;

public class EntryGate extends Gate {
    public EntryGate(String id) {
        super(id);
    }

    public Ticket handleEntry(String vehicleNumber, VehicleType vehicleType) {
        // Get availble spot
        // Book spot
        // Generate ticket;
        return null;
    }
}
