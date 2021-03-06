package topic1;

/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class T_10_RectCover {
    public int RectCover(int target) {
        if (target <= 2) {
            return target;
        }
        int a = 1;
        int b = 2;
        for (int i = 3; i <= target; i++) {
            b = a + b;
            a = b - a;
        }
        return b;
    }

    public int RectCover2(int target) {
        if (target <= 2) {
            return target;
        } else {
            return RectCover(target - 1) + RectCover(target - 2);
        }
    }
}