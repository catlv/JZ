package Write2019;

import java.util.Scanner;

/**
 * 将一组红包分为三份，第一份的金额总数等于第三份，最后得到的是第一份，最多能得多少奖金？
 */
public class 获得最多的奖金 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        int l = 0;
        int r = n - 1;
        long sum1 = d[l];
        long sum2 = d[r];
        long sum3 = 0;
        while (l < r) {
            if (sum1 < sum2) {
                sum1 += d[++l];
            } else if (sum1 > sum2) {
                sum2 += d[--r];
            } else {
                sum3 = sum1;
                sum1 += d[++l];
                sum2 += d[--r];
            }
        }
        System.out.println(sum3);
    }
}
