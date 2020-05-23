package 牛客笔试题;

import java.util.Scanner;

/**
 * Cassidy和Eleanore是一对好朋友，她们经常会一起玩游戏。某一天她们玩了一个回文游戏。游戏规则是这样的：给出一个仅包含小写字母的字符串S，在每一个人的回合中，她们会进行两个操作：
 *
 * 1. 尝试重新排列这个字符串，如果可以把这个字符串排列成回文字符串，则立即获胜。
 *
 * 2. 否则，她们必须删掉字符串中的一个字符。
 *
 * 已知，Cassidy先手，在两个人都采取最佳策略的情况下，谁可以获胜。
 *
 * 输入第一行仅包含一个正整数t，表示数据组数，(t<=10)
 *
 * 接下来有t行，每行有一个字符串S，表示一组测试数据。(|S|<=1000)
 *
 * 对于每组数据输出一行，如果Cassidy获胜，则输出Cassidy，否则输出Eleanore
 */
public class 微众2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] S = new String[t];
        for (int i = 0; i < t; i++) {
            S[i] = sc.next();
        }
        for (int i = 0; i < t; i++) {
            String s = S[i];
            String res = helper(s);
            System.out.println(res);
        }
    }

    private static String helper(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j && chars[i] == chars[j]) {
            i++;
            j--;
        }
        if (i < j) {
            if (isValid(chars, i + 1, j) || isValid(chars, i, j - 1)) {
                return "Eleanore";
            } else {
                helper(s.substring(i, j));
            }
        }
        return "Cassidy";
    }

    private static boolean isValid(char[] chars, int i, int j) {
        while (i < j) {
            if (chars[i++] != chars[j--]) {
                return false;
            }
        }
        return true;
    }
}
