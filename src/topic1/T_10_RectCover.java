package topic1;

public class T_10_RectCover {
    public int RectCover(int target) {
        if (target <= 2) {
            return target;
        } else {
            return RectCover(target - 1) + RectCover(target - 2);
        }
    }
}