package designPattern.FactoryPattern;

public class ChinesePizza implements Pizza {
    @Override
    public Pizza prepare() {
        System.out.println("Chinese prepare!");
        return this;
    }

    @Override
    public Pizza bake() {
        System.out.println("Chinese bake!");
        return this;
    }

    @Override
    public Pizza cut() {
        System.out.println("Chinese cut!");
        return this;
    }

    @Override
    public Pizza box() {
        System.out.println("Chinese box!");
        return this;
    }
}
