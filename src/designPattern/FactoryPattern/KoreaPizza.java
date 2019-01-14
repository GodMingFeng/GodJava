package designPattern.FactoryPattern;

public class KoreaPizza implements Pizza {
    @Override
    public Pizza prepare() {
        System.out.println("Korea prepare!");
        return this;
    }

    @Override
    public Pizza bake() {
        System.out.println("Korea bake!");
        return this;
    }

    @Override
    public Pizza cut() {
        System.out.println("Korea bake!");
        return this;
    }

    @Override
    public Pizza box() {
        System.out.println("Korea box!");
        return this;
    }
}
