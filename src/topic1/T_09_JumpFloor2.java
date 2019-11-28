package topic1;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class T_09_JumpFloor2 {
    public int JumpFloor2(int target) {
        int sum = 1;
        for (int i = 2; i <= target; i++) {
            sum *= 2;
        }
        return sum;

//        递归法，复杂度高
//        if (target <= 1) {
//            return target;
//        } else {
//            return JumpFloor2(target - 1) * 2;
//        }
    }
}
