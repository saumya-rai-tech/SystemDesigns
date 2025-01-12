import java.util.HashMap;
import java.util.Map;

public class MilkDecorator extends BaseCoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String name() {
        return super.name() + ", Milk";
    }

    @Override
    public double price() {
        return super.price() + 350;
    }

    @Override
    public Map<String, Integer> getRecipe() {
        Map<String, Integer> recipe = new HashMap<>(coffee.getRecipe());
        recipe.put("Milk", recipe.getOrDefault("Milk", 0) + 10);
        return recipe;
    }
}
