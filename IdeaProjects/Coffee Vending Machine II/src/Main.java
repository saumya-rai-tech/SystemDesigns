public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = CoffeeMachine.getCoffee();

        // Display coffee menu
        coffeeMachine.displayMenu();

        // Simulate user requests
        Coffee espresso = coffeeMachine.selectCoffee("Espresso");
        coffeeMachine.dispenseCoffee(espresso, new Payment(300));

        Coffee cappuccino = coffeeMachine.selectCoffee("Cappuccino");
        coffeeMachine.dispenseCoffee(cappuccino, new Payment(350));


        Coffee latte = coffeeMachine.selectCoffee("Latte");
        coffeeMachine.dispenseCoffee(latte, new Payment(400));
    }
}