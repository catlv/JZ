package topic1;

/**
 * 动态规划：
 * 1.定义数组元素含义
 * 2.找出关系式
 * 3.找出初始条件
 */
public class T_08_JumpFloor {
    public int JumpFloor(int target) {
//        dp法：
//        if (target <= 2) {
//            return target;
//        }
//        int[] dp = new int[target + 1];
//        dp[1] = 1;
//        dp[2] = 2;
//        for (int i = 3; i <= target; i++) {
//            dp[i] = dp[i - 1] + dp[i - 2];
//        }
//        return dp[target];

        //dp空间优化
        if (target <= 2) {
            return target;
        }
        int f1 = 1;
        int f2 = 2;
        int res = 0;
        for (int i = 3; i <= target; i++) {
            res = f1 + f2;
            f1 = f2;
            f2 = res;
        }
        return res;
    }
}
