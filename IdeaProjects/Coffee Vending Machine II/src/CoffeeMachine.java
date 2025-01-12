import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CoffeeMachine {
    private static CoffeeMachine coffee = new CoffeeMachine();
    private List<Coffee> coffeeMenu;
    private HashMap<String, Ingredients> ingredients;

    public static CoffeeMachine getCoffee() {
        return coffee;
    }

    private CoffeeMachine(){
        coffeeMenu = new ArrayList<>();
        ingredients = new HashMap<>();
        initializeCoffeeMenu();
        initializeIngredients();

    }
    private void initializeCoffeeMenu(){
        HashMap<Ingredients ,Integer> espressoRecipe = new HashMap<>();
        espressoRecipe.put(ingredients.get("Coffee"), 1);
        espressoRecipe.put(ingredients.get("Water"), 2);
        coffeeMenu.add(new Coffee("Espresso",250,espressoRecipe));

        HashMap<Ingredients, Integer> cappuccinoRecipe = new HashMap<>();
        cappuccinoRecipe.put(ingredients.get("Coffee"), 1);
        cappuccinoRecipe.put(ingredients.get("Water"), 1);
        cappuccinoRecipe.put(ingredients.get("Milk"), 1);
        coffeeMenu.add(new Coffee("Cappuccino", 3.5, cappuccinoRecipe));

        HashMap<Ingredients, Integer> latteRecipe = new HashMap<>();
        latteRecipe.put(ingredients.get("Coffee"), 1);
        latteRecipe.put(ingredients.get("Water"), 1);
        latteRecipe.put(ingredients.get("Milk"), 2);
        coffeeMenu.add(new Coffee("Latte", 4.0, latteRecipe));
    }

    private void initializeIngredients(){
        ingredients.put("Coffee", new Ingredients("Coffee", 10));
        ingredients.put("Water", new Ingredients("Water", 10));
        ingredients.put("Milk", new Ingredients("Milk", 10));
    }

    public void displayMenu() {
        System.out.println("Coffee Menu:");
        for(Coffee coffee : coffeeMenu){
            System.out.println(coffee.getName() + " - Rs. " + coffee.getPrice());
        }
    }
    public synchronized Coffee selectCoffee(String coffeeName) {
        for (Coffee coffee : coffeeMenu) {
            if (coffee.getName().equalsIgnoreCase(coffeeName)) {
                return coffee;
            }
        }
        return null;
    }
    public synchronized void dispenseCoffee(Coffee coffee, Payment payment) {
        if (payment.getAmount() >= coffee.getPrice()) {
            if (hasEnoughIngredients(coffee)) {
                updateIngredients(coffee);
                System.out.println("Dispensing " + coffee.getName() + "...");
                double change = payment.getAmount() - coffee.getPrice();
                if (change > 0) {
                    System.out.println("Please collect your change: $" + change);
                }
            } else {
                System.out.println("Insufficient ingredients to make " + coffee.getName());
            }
        } else {
            System.out.println("Insufficient payment for " + coffee.getName());
        }
    }
    private boolean hasEnoughIngredients(Coffee coffee) {
        for (HashMap.Entry<Ingredients, Integer> entry : coffee.getRecipe().entrySet()) {
            Ingredients ingredient = entry.getKey();
            int requiredQuantity = entry.getValue();
            if (ingredient.getQuantity() < requiredQuantity) {
                return false;
            }
        }
        return true;
    }
    private void updateIngredients(Coffee coffee) {
        for (HashMap.Entry<Ingredients, Integer> entry : coffee.getRecipe().entrySet()) {
            Ingredients ingredient = entry.getKey();
            int requiredQuantity = entry.getValue();
            ingredient.updateQuantity(-requiredQuantity);
            if (ingredient.getQuantity() < 3) {
                System.out.println("Low inventory alert: " + ingredient.getName());
            }
        }
    }
}
