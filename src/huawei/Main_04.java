package huawei;

import java.util.Scanner;

/**
 * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * 输入：
 * abc
 * 123456789
 * 输出：
 * abc00000
 * 12345678
 * 90000000
 * 注意：
 * 1.字符串之间进行拼接需要转换为 StringBuilder
 * 2.字符串按每8个字符划分一次，可以通过 s.substring() 来实现。substring都是小写。
 */
public class Main_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            int len = str.length();
            int a = len % 8;
            int b = 8 - a;
            if (a != 0) {
                StringBuilder sb = new StringBuilder(str);
                for (int i = 0; i < b; i++) {
                    sb.append('0');
                }
                str = sb.toString();
            }

            while (str.length() >= 8) {
                System.out.println(str.substring(0, 8));
                str = str.substring(8);
            }
        }
    }
}
