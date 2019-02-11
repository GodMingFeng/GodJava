import java.io.IOException;

public class Main {

    public static String Lock = "LOCK";

    public static void main(String[] args) {
        LeetCode leetCode = new LeetCode();
        RandomPic randomPic = new RandomPic();
        try {
            randomPic.random();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

