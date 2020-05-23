package 牛客笔试题;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        int len = s1.length;
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = Integer.parseInt(s1[i]);
        }
        System.out.println(nums.length);

        Scanner sc2 = new Scanner(System.in);
        int len2 = sc2.nextInt();
        int[] nums2 = new int[len2];
        for (int i = 0; i < len2; i++) {
            nums2[i] = sc.nextInt();
        }
        System.out.println(nums2.length);
    }
}
