package vendingmachine.state;

import vendingmachine.Machine;
import vendingmachine.coin.Coin;
import vendingmachine.item.Item;

public class SelectState extends State {
    public SelectState(Machine machine) {
        super(machine);
    }

    public void addCoin(Coin coin) throws Exception {
        this.getMachine().setState(this);
    }

    public void selectItems() throws Exception {
        
    }

    public void purchaseItem(Item item) throws Exception {
        this.getMachine().setState(new DispatchState(this.getMachine()));
    }

    public void cancel() throws Exception {
        this.getMachine().setState(new IdelState(this.getMachine()));
    }
}
