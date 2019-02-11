import java.util.*;

/**
 * Created by wujieshuai on 2019/1/30.
 **/
public class LeetCode {


    public int strongPasswordChecker(String s) {
        int hasNum = 1;
        int hasLow = 1;
        int hasUp = 1;
        int word = 0;
        int operate;
        int time = 1;
        char[] ss = s.toCharArray();
        for (int i = 0; i < ss.length; i++) {
            if (Character.isDigit(ss[i])) {
                hasNum = 0;
            }
            if (Character.isLowerCase(ss[i])) {
                hasLow = 0;
            }
            if (Character.isUpperCase(ss[i])) {
                hasUp = 0;
            }
            if (i - 1 >= 0) {
                if (ss[i - 1] == ss[i]) {
                    time++;
                } else {
                    time = 1;
                }
            }
            if (time % 3 == 0) {
                word++;
            }
        }
        System.out.println("length: " + s.length());
        System.out.println("hasNum:" + hasNum);
        System.out.println("hasUp:" + hasUp);
        System.out.println("hasLow: " + hasLow);
        System.out.println("word: " + word);

        if (s.length() > 20) {
            if (hasNum + hasLow + hasUp >= word) {
                operate = hasNum + hasLow + hasUp + (s.length() - 20);
            } else if (hasLow + hasNum + hasUp > 0) {
                operate = Math.max(word - (hasLow + hasNum + hasUp), s.length() - 20) + hasNum + hasLow + hasUp;
            } else {
                operate = word + s.length() - 20;
            }
        } else if (s.length() < 6) {
            operate = Math.max(Math.max(6 - s.length(), hasNum + hasLow + hasUp), word);
        } else {
            operate = Math.max(hasNum + hasLow + hasUp, word);
        }
        return operate;
    }
}
