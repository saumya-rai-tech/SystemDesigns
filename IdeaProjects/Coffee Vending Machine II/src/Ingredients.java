import java.util.HashMap;

public class Ingredients {
    String name;
    int quantity;

    public Ingredients(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public synchronized void updateQuantity(int amount) {
        quantity += amount;
    }
}
