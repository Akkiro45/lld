package parkinglot.system.payment;

import java.util.Date;

import parkinglot.system.Ticket;
import parkinglot.system.coststrategy.CostCalculation;

public class HourlyCostCalculation implements CostCalculation {
    public float calculate(Ticket ticket) {
        long timeDiff = new Date().getTime() - ticket.getStartTimeStamp();
        int hours = (int) Math.ceil(((timeDiff / 1000) / 60) / 60);
        return hours * ticket.getParkingSpot().getRate();
    }
}
