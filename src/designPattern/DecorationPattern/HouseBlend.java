package designPattern.DecorationPattern;

public class HouseBlend extends Beverage {

    public HouseBlend(Beverage beverage) {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
