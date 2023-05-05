package parkinglot.system.coststrategy;

import parkinglot.system.payment.Payment;

public class DebitCard implements Payment {
    public boolean pay(float amount) {
        return true;
    }
}
