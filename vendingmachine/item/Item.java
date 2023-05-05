package vendingmachine.item;

public abstract class Item {
    private int id;
    private int code;
    private float price;

    public Item(int id, int code, int price) {
        this.id = id;
        this.code = code;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public int getCode() {
        return code;
    }

    public float getPrice() {
        return price;
    }
}
