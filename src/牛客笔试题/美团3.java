package 牛客笔试题;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 现在有n名选手进行轮流报数，选手按顺序编号为1~n，另外我们会给出一个序列A，游戏会进行n轮，每轮会出局一名选手，第i轮淘汰的选手最后的排名是n-i+1,即第一轮出局的是倒数第一。出局的选手不会参与下一轮报数。
 * <p>
 * 每轮游戏都是从第一个选手开始报数，即如果1号选手仍在，则从1号选手开始，否则从2号选手开始，以此类推，但是注意，每轮报数是从0开始的，第i轮时，第一个报到A[i]的选手会出局，且当前轮游戏结束。A[i]有可能大于当前的剩余人数，则最后一个人报完以后，会由第一个人接着报，直到报出A[i]。
 * <p>
 * 输入第一行包含一个正整数n，表示有n名选手。(1<=n<=100000)
 * <p>
 * 输入第二行包含n个正整数，表示序列A。(0<=A[i]<=10^9)
 * <p>
 * 输出包含n行，每行一个正整数，第i行的正整数表示i号选手的排名是多少。即输出是一个1~n的排列。
 * <p>
 * 4
 * 1 2 1 2
 * <p>
 * 输出
 * 1
 * 4
 * 2
 * 3
 */
public class 美团3 {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        final int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        final int[] res = new int[n];
        final ArrayList<Integer> tmp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            tmp.add(i + 1);
        }
        for (int i = 0; i < n; i++) {
            int b = a[i] % (n - i);
            res[tmp.get(b) - 1] = n - i;
            tmp.remove(b);
        }
        for (int b : res) {
            System.out.println(b);
        }
    }
}
