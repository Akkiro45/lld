package vendingmachine.state;

import vendingmachine.Machine;
import vendingmachine.coin.Coin;

public class IdelState extends State {
    public IdelState(Machine machine) {
        super(machine);
    }

    public void addCoin(Coin coin) throws Exception {
        this.getMachine().setState(new SelectState(this.getMachine()));
    }
}
