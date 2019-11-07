package topic3;

import java.util.ArrayList;

public class T_41_FindSequenceEqualsSum {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (sum < 3) {
            return res;
        }
        int start = 1;
        int end = 2;
        int mid = (1 + sum) >> 1;
        while (start < mid) {
            int s = totalSum(start, end);
            if (s == sum) {
                res.add(getSequence(start, end));
                end++; //也可以写 start++
            } else if (s < sum) {
                end++;
            } else {
                start++;
            }
        }
        return res;
    }

    private ArrayList<Integer> getSequence(int start, int end) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            list.add(i);
        }
        return list;
    }

    private int totalSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}
