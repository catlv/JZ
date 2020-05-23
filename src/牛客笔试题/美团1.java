package 牛客笔试题;

import java.util.Scanner;

/**
 * 在观星的时候，一种常用的方式是划出类似于正方形的区域内，确定其中所有星星的坐标。
 * <p>
 * 现在我们在星空（一个无限大的二维平面）上建立坐标系。由于星星很小，我们忽略它的面积，认为每一个星星是一个点，且所有星星的坐标都是整数。
 * <p>
 * 幸运星的定义是这一颗星星在这个平面内，正上，正下，正左，正右都有其他的星星(不一定相邻)。
 * <p>
 * 现在，我们已经将这个正方形的区域取出，并且将他们所在的坐标给你。现在希望你能计算，这个平面内有多少颗幸运星？
 * <p>
 * 输入：输入第一行包含一个数n，代表正方形区域内星星的总数。
 * <p>
 * 接下来n行，每行两个整数xi,yi,代表这颗星星的坐标。
 * <p>
 * (n<=2000,-1000<=xi,yi<=1000,没有两颗星星的坐标是相同的。)
 * <p>
 * 输出包含一个数，即有多少颗星星是幸运星。
 * <p>
 * 8
 * 0 0
 * 0 1
 * 0 2
 * 0 3
 * 1 1
 * 1 2
 * -1 1
 * -1 2
 * <p>
 * 输出：2
 */
public class 美团1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[2002][2002];
        final int[] one = new int[n];
        final int[] two = new int[n];
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt() + 1000;
            int r = sc.nextInt() + 1000;
            one[i] = l; //1
            two[i] = r; //2
            a[l][r] = 1;
        }
        int res = solve(a, n, one, two);
        System.out.println(res);
    }

    public static int solve(int[][] a, int n, int[] one, int[] two) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            int yi = one[i]; //1
            int er = two[i]; //2
            if (helper1(a, yi, er) && helper2(a, yi, er)) {
                count++;
            }
        }
        return count;
    }

    private static boolean helper1(int[][] a, int yi, int er) {
        boolean h1 = false;
        boolean h2 = false;
        for (int i = 0; i < er; i++) {
            if (a[yi][i] == 1) {
                h1 = true;
                break;
            }
        }
        for (int i = er + 1; i < 2000; i++) {
            if (a[yi][i] == 1) {
                h2 = true;
                break;
            }
        }
        return h1 && h2;
    }

    private static boolean helper2(int[][] a, int yi, int er) {
        boolean h1 = false;
        boolean h2 = false;
        for (int i = 0; i < yi; i++) {
            if (a[i][er] == 1) {
                h1 = true;
                break;
            }
        }
        for (int i = yi + 1; i < 2000; i++) {
            if (a[i][er] == 1) {
                h2 = true;
                break;
            }
        }
        return h1 && h2;
    }
}
