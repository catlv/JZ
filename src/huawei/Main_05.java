package huawei;

import java.util.Scanner;

/**
 * 输入十六进制的数，输出它的十进制表示，多组输入。
 * 注意：
 * 1. Integer.parseInt(string, radix) 指将字符串 string 转换为 radix 进制的整数。
 * 2. 十六进制的前两位为 0x，所以最开始要 substring(2)。
 */
public class Main_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next().substring(2);
            System.out.println(Integer.parseInt(str, 16));
        }
    }
}
