package designPattern.DecorationPattern;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresson";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
