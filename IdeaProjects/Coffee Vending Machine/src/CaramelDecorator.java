public class CaramelDecorator extends BaseCoffeeDecorator{
    public CaramelDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String name() {
        return super.name() + ", Caramel";
    }

    @Override
    public double price() {
        return super.price() + 500;
    }
}
