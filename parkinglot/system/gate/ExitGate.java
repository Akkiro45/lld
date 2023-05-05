package parkinglot.system.gate;

import parkinglot.system.Ticket;
import parkinglot.system.coststrategy.CostCalculation;
import parkinglot.system.payment.Payment;

public class ExitGate extends Gate {
    public ExitGate(String id) {
        super(id);
    }

    public void handleExit(Ticket ticket, CostCalculation costCalculation, Payment payment) {
        // Calculate cost
        float amount = costCalculation.calculate(ticket);

        // Do payment
        payment.pay(amount);

        // Free spot
        ticket.getParkingSpot().freeSpot();
    }
}
