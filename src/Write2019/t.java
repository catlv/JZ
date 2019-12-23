package Write2019;

import java.util.Scanner;

/**
 * next        nextLine             输入一个数后，就结束，nextLine未能执行
 * nextLine    next                 完整输入两个数后结束
 * nextLine    nextLine             完整输入两个数后结束
 * 结论：
 * 遇到 nextLine ，输入后可以继续
 * 遇到 next ，输入后立刻结束输入。
 */
public class t {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.next();
        String c = sc.nextLine();
    }
}
