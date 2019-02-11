/**
 * Created by wujieshuai on 2019/2/3.
 **/
public class CodeCheckImpl implements CodeCheck {
    @Override
    public boolean codeLength(String s) {
        return s.length() >= 6 && s.length() <= 20;
    }

    @Override
    public boolean codeWord(String s) {
        return false;
    }

    @Override
    public boolean multiWord(String s) {
        return false;
    }
}
