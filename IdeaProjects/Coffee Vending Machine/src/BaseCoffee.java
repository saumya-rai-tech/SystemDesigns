import java.util.Map;

public class BaseCoffee implements Coffee{
    @Override
    public String name() {
        return "Simple Coffee";
    }

    @Override
    public Map<String, Integer> getRecipe() {
        return null;
    }

    @Override
    public double price() {
        return 500;
    }
}
