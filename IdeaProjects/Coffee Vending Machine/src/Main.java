import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CoffeeVendingMachine machine = new CoffeeVendingMachine();
        Coffee latte = new LatteCoffee();
        Coffee cappuccino = new CappuccinoCoffee();

        machine.displayMenu();

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the choice: ");
        int choice = sc.nextInt();

        if(choice == 1)
            machine.makeCoffee(latte, 500.0);

        if(choice == 2)
            machine.makeCoffee(cappuccino, 300.0);

//        Coffee coffee = new BaseCoffee();
//
//        System.out.println(coffee.name() + " " + coffee.price());
//
//        //Milk Decorator
//        coffee = new MilkDecorator(coffee);
//        System.out.println(coffee.name() + " " + coffee.price());
//
//        //Sugar Decorator
//        coffee = new SugarDecorator(coffee);
//        System.out.println(coffee.name() + " " + coffee.price());
//
//        //Caramel Decorator
//        coffee = new CaramelDecorator(coffee);
//        System.out.println(coffee.name() + " " + coffee.price());
    }
}