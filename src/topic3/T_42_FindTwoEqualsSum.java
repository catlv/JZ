package topic3;

import java.util.ArrayList;

public class T_42_FindTwoEqualsSum {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        if (array.length < 2) {
            return res;
        }
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            int s = array[i] + array[j];
            if (s == sum) {
                res.add(array[i]);
                res.add(array[j]);
                break;
            } else if (s < sum) {
                i++;
            } else {
                j--;
            }
        }
        return res;
    }
}
