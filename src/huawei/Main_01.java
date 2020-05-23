package huawei;

import java.util.Scanner;

/**
 * 计算字符串最后一个单词的长度，单词以空格隔开。
 * 注意：
 * 1.由于是输入一个字符串，所以要用 sc.nextLine() ，而不能用 sc.next();
 * 2.split()的功能是去掉空格，并按空格分开存放
 * 3.对于String[] str，要计算长度应该用 str.length 。
 */

public class Main_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] str = s.split(" ");
        System.out.println(str[str.length - 1].length());
    }
}
