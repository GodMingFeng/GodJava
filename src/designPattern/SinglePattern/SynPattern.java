package designPattern.SinglePattern;

/**
 * Created by wujieshuai on 2019/1/31.
 **/
public class SynPattern {
    private int propertyA;
    private int propertyB;
    private static SynPattern instance;

    private SynPattern(int propertyA, int propertyB) {
        this.propertyA = propertyA;
        this.propertyB = propertyB;
    }

    public static SynPattern getInstance(int propertyA, int propertyB) {
        if (instance == null) {
            synchronized (SynPattern.class) {
                if (instance == null) {
                    instance = new SynPattern(propertyA, propertyB);
                }
            }
        }
        return instance;
    }

    public int getPropertyA() {
        return this.propertyA;
    }

    public int getPropertyB() {
        return this.propertyB;
    }

}
