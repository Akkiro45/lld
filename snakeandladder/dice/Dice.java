package snakeandladder.dice;

public abstract class Dice {
    private int maxValue;

    public Dice(int maxValue) {
        this.maxValue = maxValue;
    }

    public int getMaxValue() {
        return this.maxValue;
    }

    public abstract int roll();
}
