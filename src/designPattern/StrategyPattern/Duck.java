package designPattern.StrategyPattern;

//设计模式之策略模式
public abstract class Duck {
    protected FlyBehavior fly;

    public void swim() {
        System.out.println("swim!");
    }

    public void fly() {
        fly.fly();
    }
}