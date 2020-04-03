package 牛客笔试题;

import java.util.Scanner;

/**
 * 二叉树转为小根堆，小根堆中序遍历
 * 日志实时打印的命令
 * 电梯scan算法
 *
 * 6 9
 * 3
 * 18  18-3=15
 *
 * 4 5
 * 1
 * 20   20-1=19
 *
 * 10
 * 9 10  89
 * 8 10
 * 8 9
 *
 * 9
 * 2147484632
 *
 */
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long lcm = n * (n - 1);
        long gcd = 1;
        long res = lcm - gcd;
        System.out.println(res);
    }
}
