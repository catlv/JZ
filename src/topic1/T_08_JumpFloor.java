package topic1;

public class T_08_JumpFloor {
    public int JumpFloor(int target) {
        if (target < 3) {
            return target;
        }
        int a = 1;
        int b = 2;
        for (int i = 3; i <= target; i++) {
            b = a + b;
            a = b - a;
        }
        return b;

//        递归法，复杂度很高
//        if (target <= 2) {
//            return target;
//        } else {
//            return JumpFloor(target - 1) + JumpFloor(target - 2);
//        }
    }
}
