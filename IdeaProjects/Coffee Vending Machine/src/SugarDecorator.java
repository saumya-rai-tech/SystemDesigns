public class SugarDecorator extends BaseCoffeeDecorator{
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String name() {
        return super.name() + ", Sugar";
    }

    @Override
    public double price() {
        return super.price() + 150;
    }
}
