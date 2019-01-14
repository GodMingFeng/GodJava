public class Solution {

    static int[][] square(int n) {
        int[][] res = new int[n][n];
        int a = 0, b = -1;
        for (int i = 1; i <= n * n; i++) {
            if (!dir("up", a, b, res) && dir("right", a, b, res)) {
                res[a][b + 1] = i;
                b++;
            } else if (dir("down", a, b, res)) {
                res[a + 1][b] = i;
                a++;
            } else if (dir("left", a, b, res)) {
                res[a][b - 1] = i;
                b--;
            } else if (dir("up", a, b, res)) {
                res[a - 1][b] = i;
                a--;
            }
        }
        return res;
    }

    static void printList(int[][] n) {
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print(n[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static void printList(int[] n) {
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }

    private static boolean dir(String dir, int a, int b, int[][] n) {
        switch (dir) {
            case "right":
                return (b + 1 < n.length) && (n[a][b + 1] == 0);
            case "down":
                return (a + 1 < n.length && n[a + 1][b] == 0);
            case "left":
                return (b - 1 >= 0 && n[a][b - 1] == 0);
            case "up":
                return (a - 1 >= 0 && n[a - 1][b] == 0);
            default:
                return false;
        }
    }


    private static void swap(int[] n, int a, int b) {
        int temp = n[a];
        n[a] = n[b];
        n[b] = temp;
    }

    //快排
    static void quickSort(int[] n, int i, int j) {
        int left = i;
        int right = j;
        while (left != right) {
            while (n[right] >= n[left] && left < right) {
                right--;
            }
            if (left < right) {
                swap(n, left, right);
            }
            while (n[left] <= n[right] && left < right) {
                left++;
            }
            if (left < right) {
                swap(n, left, right);
            }
        }
        if (i < left - 1) {
            quickSort(n, i, left - 1);
        }
        if (right + 1 < j) {
            quickSort(n, right + 1, j);
        }
    }

    //阶乘
    static int Factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * Factorial(n - 1);
    }

    //获取杨辉三角
    static int yanghui(int i, int j) {
        int res = 1;
        if (j == 1 || i == 1 || j == i) {
            return 1;
        }
        return yanghui(i - 1, j - 1) + yanghui(i - 1, j);
    }



}
