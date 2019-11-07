package topic2;

import java.util.Arrays;

public class T_28_MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int[] array) {
        int len = array.length;
        Arrays.sort(array);
        int mid = array[(len - 1) / 2];
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] == mid) {
                count++;
            }
        }
        if (count > len / 2) {
            return mid;
        } else {
            return 0;
        }
    }
}
