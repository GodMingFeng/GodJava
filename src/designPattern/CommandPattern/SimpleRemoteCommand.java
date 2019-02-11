package designPattern.CommandPattern;

/**
 * Created by wujieshuai on 2019/1/31.
 **/
public class SimpleRemoteCommand {
    Command slot;

    public SimpleRemoteCommand() {
    }


    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.excute();
    }
}
