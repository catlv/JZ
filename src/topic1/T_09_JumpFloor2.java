package topic1;

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
