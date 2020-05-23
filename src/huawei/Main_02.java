package huawei;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 * 注意：
 * 1.对于字符串的遍历，用 charAt(i)
 * 2.将字符串变成大写或小写：str.toUpperCase(); str.toLowerCase;
 */
public class Main_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();
        String s = sc.next().toUpperCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (s.charAt(0) == str.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
