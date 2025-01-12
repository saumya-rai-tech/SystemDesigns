import java.util.HashMap;

public class Coffee {
    String name;
    double price;
    HashMap<Ingredients,Integer> recipe;

    public Coffee(String name, double price, HashMap<Ingredients, Integer> recipe) {
        this.name = name;
        this.price = price;
        this.recipe = recipe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public HashMap<Ingredients, Integer> getRecipe() {
        return recipe;
    }

    public void setRecipe(HashMap<Ingredients, Integer> recipe) {
        this.recipe = recipe;
    }
}
