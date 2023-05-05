package vendingmachine.coin;

public abstract class Coin {
    private int amount;

    public Coin(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return this.amount;
    }
}
