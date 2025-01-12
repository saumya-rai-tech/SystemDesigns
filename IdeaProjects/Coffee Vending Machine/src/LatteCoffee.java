import java.util.HashMap;
import java.util.Map;

public class LatteCoffee implements Coffee{

    @Override
    public String name() {
        return "Latte";
    }

    @Override
    public double price() {
        return 200;
    }

    @Override
    public Map<String, Integer> getRecipe() {
        Map<String, Integer> recipe = new HashMap<>();
        recipe.put("water", 20);
        recipe.put("coffee", 40);
        recipe.put("milk", 30);
        return recipe;
    }
}
