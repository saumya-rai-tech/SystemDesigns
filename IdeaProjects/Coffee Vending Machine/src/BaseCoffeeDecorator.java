import java.util.Map;

public abstract class BaseCoffeeDecorator implements Coffee{
    Coffee coffee;
    public BaseCoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public String name() {
        return coffee.name();
    }

    @Override
    public double price() {
        return coffee.price();
    }

    @Override
    public Map<String, Integer> getRecipe() {
        return coffee.getRecipe();
    }
}
