package vendingmachine;

import java.util.List;
import java.util.Map;

import vendingmachine.coin.Coin;
import vendingmachine.item.Item;
import vendingmachine.state.State;

public class Machine {
    private Wallet wallet;
    private Map<Integer, List<Item>> items;
    private State state;
    private float currAmount = 0;

    public void addCoin(Coin coin) {
        wallet.deposite(coin);
        currAmount += coin.getAmount();
    }

    public void cancel() {
        wallet.withdraw(currAmount);
        currAmount = 0;
    }

    public boolean purchase(Item item) {
        if(item.getPrice() <= currAmount) {
            return removeItem(item);
        }
        return false;
    }

    public State getState() {
        return this.state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void addItem(Item item) {
        
    }

    public boolean removeItem(Item item) {
        return true;
    }

}
