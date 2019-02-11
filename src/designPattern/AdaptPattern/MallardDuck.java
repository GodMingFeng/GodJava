package designPattern.AdaptPattern;

/**
 * Created by wujieshuai on 2019/1/31.
 **/
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("绿头鸭Quack!");
    }

    @Override
    public void fly() {
        System.out.println("绿头鸭flying");
    }
}
