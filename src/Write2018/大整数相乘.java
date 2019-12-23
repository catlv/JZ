package Write2018;

import java.util.Scanner;

/**
 * 字符串相乘
 */
public class 大整数相乘 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextBigDecimal().toString();
        String s2 = sc.nextBigDecimal().toString();
        int[] nums = new int[s1.length() + s2.length()];
        for (int i = s1.length() - 1; i >= 0; i--) {
            int x = s1.charAt(i) - '0';
            for (int j = s2.length() - 1; j >= 0; j--) {
                int y = s2.charAt(j) - '0';
                nums[i + j] += (nums[i + j + 1] + x * y) / 10;
                nums[i + j + 1] = (nums[i + j + 1] + x * y) % 10;
            }
        }
        StringBuilder s = new StringBuilder();
        for (int num : nums) {
            //删除开头的0
            if (s.length() == 0 && num == 0) {
                continue;
            }
            s.append(num);
        }
        System.out.println(s);
    }
}
