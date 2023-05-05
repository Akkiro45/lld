package vendingmachine.state;

import vendingmachine.Machine;
import vendingmachine.coin.Coin;
import vendingmachine.item.Item;

public abstract class State {
    private Machine machine;

    public State(Machine machine) {
        this.machine = machine;
    }

    public Machine getMachine() {
        return machine;
    }

    public void addCoin(Coin coin) throws Exception {
        throw new Exception("Not allowed");
    }

    public void selectItems() throws Exception {
        throw new Exception("Not allowed");
    }

    public void purchaseItem(Item item) throws Exception {
        throw new Exception("Not allowed");
    }

    public void cancel() throws Exception {
        throw new Exception("Not allowed");
    }

    public void getItem() throws Exception {
        throw new Exception("Not allowed");
    }
}
