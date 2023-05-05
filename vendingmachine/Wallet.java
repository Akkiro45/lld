package vendingmachine;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import vendingmachine.coin.Coin;

public class Wallet {
    private Map<Integer, List<Coin>> coins;

    public Wallet() {
        coins = new HashMap<>();
    }

    public void deposite(List<Coin> coins) {
        for(Coin coin : coins) {
            deposite(coin);
        }
    }

    public void deposite(Coin coin) {
        if(!this.coins.containsKey(coin.getAmount())) {
            this.coins.put(coin.getAmount(), new ArrayList<>());
        }
        this.coins.get(coin.getAmount()).add(coin);
    }

    public List<Coin> withdraw(float amount) {
        List<Coin> coins = new ArrayList<>((int)amount);

        // for(Map.Entry<Integer, List<Coin>> coinList : this.coins.entrySet()) {
        //     while(!coinList.getValue().isEmpty() && amount != 0) {

        //     }
        // }

        return coins;
    }
}
