import java.util.HashMap;
import java.util.Map;

public class CappuccinoCoffee implements Coffee{
    @Override
    public String name() {
        return "Cappuccino Coffee";
    }

    @Override
    public double price() {
        return 250;
    }

    @Override
    public Map<String, Integer> getRecipe() {
        Map<String, Integer> recipe = new HashMap<>();
        recipe.put("water", 5);
        recipe.put("coffee", 2);
        return recipe;
    }
}
