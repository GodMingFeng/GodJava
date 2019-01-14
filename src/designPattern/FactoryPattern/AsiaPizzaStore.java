package designPattern.FactoryPattern;

public class AsiaPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "chinese":
                return new ChinesePizza();
            case "korea":
                return new KoreaPizza();
            default:
                return null;
        }
    }
}
