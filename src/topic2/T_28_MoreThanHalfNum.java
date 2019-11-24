package topic2;

import java.util.Arrays;

public class T_28_MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int[] array) {
        Arrays.sort(array);
        int mid = array[(array.length - 1) / 2];
        int count = 0;
        for (int a : array) {
            if (a == mid) {
                count++;
            }
        }
        if (count > array.length / 2) {
            return mid;
        } else {
            return 0;
        }
    }
}
