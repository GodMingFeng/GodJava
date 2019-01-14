package designPattern.FactoryPattern;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare().bake().cut().box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
