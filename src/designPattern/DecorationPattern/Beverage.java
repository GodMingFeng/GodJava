package designPattern.DecorationPattern;

public abstract class Beverage {
    String description = "UnKnown Beverage";

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    ;
}
