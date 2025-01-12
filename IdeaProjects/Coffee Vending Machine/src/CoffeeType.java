public class CoffeeType extends BaseCoffeeDecorator{
    public CoffeeType(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String name() {
        return super.name();
    }

    @Override
    public double price() {
        return super.price();
    }
}
