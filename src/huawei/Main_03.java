package huawei;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * 随机生成一串数字，对它们进行去重和排序
 * 注意：
 * TreeSet是一个有序且没有重复元素的数据结构，所以直接向里面放入元素即可达到去重和排序的目的。
 */
public class Main_03 {
    public static TreeSet<Integer> solve(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            TreeSet<Integer> res = solve(nums);
            for (Integer i : res) {
                System.out.println(i);
            }
        }
    }
}
