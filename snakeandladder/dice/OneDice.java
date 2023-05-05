package snakeandladder.dice;

public class OneDice extends Dice {

    public OneDice() {
        super(6);
    }

    public int roll() {
        return (int) Math.floor(Math.random() * this.getMaxValue() + 1);
    }
    
}
