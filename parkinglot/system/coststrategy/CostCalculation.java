package parkinglot.system.coststrategy;

import parkinglot.system.Ticket;

public interface CostCalculation {
    public float calculate(Ticket ticket);
}
