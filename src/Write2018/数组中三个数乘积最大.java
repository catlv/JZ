package Write2018;

import java.util.Scanner;

/**
 * 找出最大的三个数 和 最小的两个数+最大的一个数，即可。
 * https://www.nowcoder.com/practice/5f29c72b1ae14d92b9c3fa03a037ac5f?tpId=90&tqId=30776&tPage=1&rp=1&ru=/ta/2018test&qru=/ta/2018test/question-ranking
 */
public class 数组中三个数乘积最大 {
    private static void helper(long[] nums, int len) {
        long max1 = 0;
        long max2 = 0;
        long max3 = 0;
        long min1 = 0;
        long min2 = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            } else if (nums[i] > max2) {
                max3 = max2;
                max2 = nums[i];
            } else if (nums[i] > max3) {
                max3 = nums[i];
            } else if (nums[i] < min1) {
                min2 = min1;
                min1 = nums[i];
            } else if (nums[i] < min2) {
                min2 = nums[i];
            }
        }
        long max = Math.max(max1 * max2 * max3, max1 * min1 * min2);
        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        long[] nums = new long[len];
        for (int i = 0; i < len; i++) {
            nums[i] = sc.nextInt();
        }
        helper(nums, len);
        sc.close();
    }
}
