package 牛客笔试题;

import java.util.Scanner;

/**
 * 数轴上有n个点，第一个点是小熊现在的位置，最后一个点是他家的位置，他需要按照坐标点的排列顺序依次走回家，
 * 中间n-2个点可以选出一个忽略掉，问他最少走多少距离回到家。
 *
 * 输入例子：
 * 4
 * 1  4  -1  3
 *
 * 输出：
 * 4
 *
 * 需要忽略掉-1，因为|-1-4| + |-1-3| = 9
 * 思路是计算这n-2个点中每个点和它左右两边相邻点的距离和，选出最大的那个点忽略掉即可。
 */
public class 按坐标点走回家 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //表示某点和它左右两边相邻点的距离和，以及对应下标
        int max = 0;
        int maxIndex = 0;

        按坐标点走回家 main = new 按坐标点走回家();

        for (int i = 1; i < n - 1; i++) {
            int t = main.abs(arr[i], arr[i - 1]) + main.abs(arr[i], arr[i + 1]);
            if (t > max) {
                max = t;
                maxIndex = i;
            }
        }

        int res = 0;
        for (int i = 1; i < n; i++) {
            if (i < maxIndex || i > maxIndex + 1) {
                res += main.abs(arr[i], arr[i - 1]);
            } else if (i == maxIndex + 1) {
                res += main.abs(arr[i], arr[i - 2]);
            }
        }
        System.out.println(res);
    }

    private int abs(int a, int b) {
        if (a >= b) {
            return a - b;
        } else {
            return b - a;
        }
    }
}
