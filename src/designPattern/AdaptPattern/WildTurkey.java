package designPattern.AdaptPattern;

/**
 * Created by wujieshuai on 2019/1/31.
 **/
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("野生火鸡Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("野生火鸡 fly fly");
    }
}
