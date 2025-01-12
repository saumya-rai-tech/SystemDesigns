public class CoffeeVendingMachine {
    public synchronized void displayMenu() {
        System.out.println("Available Coffee Options:");
        System.out.println("1. Cappuccino - Rs.250");
        System.out.println("2. Latte - Rs.200");
    }

    public void makeCoffee(Coffee coffee, double payment) {
        synchronized (this) {
            if (payment < coffee.price()) {
                System.out.println("Insufficient payment. Please pay Rs." + coffee.price());
                return;
            }
        }

        System.out.println("Dispensing: " + coffee.name());
        if (payment > coffee.price()) {
            System.out.println("Change: Rs." + (payment - coffee.price()));
        }
    }
}
