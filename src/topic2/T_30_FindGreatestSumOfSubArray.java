package topic2;

public class T_30_FindGreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            int flag = 0;
            for (int a = i; a < array.length; a++) {
                flag += array[a];
                if (max < flag) {
                    max = flag;
                }
            }
        }
        return max;
    }
}