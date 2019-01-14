package designPattern.StrategyPattern;

public class RocketFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("RocketFly!");
    }
}
