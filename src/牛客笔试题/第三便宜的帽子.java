package 牛客笔试题;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 度度熊想去商场买一顶帽子，商场里有N顶帽子，有些帽子的价格可能相同。度度熊想买一顶价格第三便宜的帽子，问第三便宜的帽子价格是多少？
 * 首先输入一个正整数N（N <= 50），接下来输入N个数表示每顶帽子的价格（价格均是正整数，且小于等于1000）
 * 如果存在第三便宜的帽子，请输出这个价格是多少，否则输出-1
 * <p>
 * 输入例子：
 * 10
 * 10 10 10 10 20 20 30 30 40 40
 * <p>
 * 输出30
 */
public class 第三便宜的帽子 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int count = 1;
        int res = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                count++;
                res = arr[i];
            }
            if (count == 3) {
                break;
            }
        }
        if (count == 3) {
            System.out.println(res);
        } else {
            System.out.println(-1);
        }
    }
}
