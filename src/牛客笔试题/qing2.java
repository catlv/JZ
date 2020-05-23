package 牛客笔试题;

import java.util.Scanner;

public class qing2 {
    public static int[] helper(int n, int[] nums) {
        int[] ji = new int[nums.length];
        int[] ou = new int[nums.length];
        int len1 = 0;
        int len2 = 0;
        for (int num : nums) {
            if (num % 2 == 1) {
                ji[len1++] = num;
            } else {
                ou[len2++] = num;
            }
        }
        int maxLen1 = ji[0] - 1;
        int maxLen2 = ou[0] - 2;
        int index1 = 0;
        int index2 = 0;

        for (int i = 1; i < len1; i++) {
            if (maxLen1 < ji[i] - ji[i - 1] - 1) {
                index1 = ji[i] + 2;
            }
            maxLen1 = Math.max(maxLen1, ji[i] - ji[i - 1] - 1);
        }
        maxLen1 = Math.max(maxLen1, 99 - ji[len1]) / 2;

        for (int i = 1; i < len2; i++) {
            if (maxLen2 < ou[i] - ou[i - 1] - 1) {
                index2 = ou[i] + 2;
            }
            maxLen2 = Math.max(maxLen2, ou[i] - ou[i - 1] - 1);
        }
        maxLen2 = Math.max(maxLen2, 100 - ou[len2]) / 2;


        int[] res = new int[2];
        if (maxLen1 > maxLen2) {
            res[0] = index1;
            res[1] = maxLen1;
        } else {
            res[0] = index2;
            res[1] = maxLen2;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] solve = helper(n, nums);
        System.out.println(solve[0] + " " + solve[1]);
    }
}
