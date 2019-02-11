package designPattern.CommandPattern;

/**
 * Created by wujieshuai on 2019/1/31.
 **/
public class LightOnCommand implements Command {
    private Light light;

    @Override
    public void excute() {
        this.light.on();
    }

    public LightOnCommand(Light light) {
        this.light = light;
    }
}
