package 牛客笔试题;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 4
 * 1 2 3 5
 * 1 2 3 1
 * 2 3 4 1
 *
 * 2 3 0 1
 * 3 4 0 2
 *
 * 3 0 0 2
 * 4 0 0 3
 *
 * 0 0 0 3
 * 0 0 0 4
 *
 * 0 0 0 0
 *
 * 1 0 3
 * 1 0 0
 * 2 0 0
 *
 * 5
 * 1 1 2 3 3
 * 1 1 2 3 -2
 *
 * 3
 * 1 3 6
 * 1 3 3
 * 2 4 3
 *
 * 2 1 3
 * 3 1 4
 *
 * 3 1 1
 * 4 2 1
 *
 * 1 3 2
 *
 * 2 0 3
 *
 * 3 1 0
 *
 * 0 2 1
 *
 * ---
 * 1 3 6
 *
 * 1 3 3
 * 2 4 3
 * 2 3 4
 *
 * 2 3 1
 * 3 4 1
 * 1 3 4
 *
 * 1 3 1
 * 2 4 1
 * 1 2 4
 *
 * 1 2 1
 * 2 3 1
 * 1 2 3
 *
 * 1 2 0
 * 2 3 0
 * 0 2 3
 *
 * 0 2 0
 * 1 3 0
 * 0 1 3
 *
 * 0 1 0
 * 1 2 0
 * 0 1 2
 */
public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int k = 0;
        int len = a.length - 1;
        while (a[len] >= n) {
            a[len] -= n;
            for (int i = 0; i <= len - 1; i++) {
                a[i] += 1;
            }
            k++;
            Arrays.sort(a);
        }
        System.out.println(k);
    }
}
