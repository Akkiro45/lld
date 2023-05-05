package parkinglot.system.coststrategy;

import parkinglot.system.payment.Payment;

public class CreditCard implements Payment {
    public boolean pay(float amount) {
        return true;
    }
}
