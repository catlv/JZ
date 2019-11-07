package topic2;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class T_29_LeastK {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        return getKLeastNumbersWithMaxHeap(input, k);
    }

    private ArrayList<Integer> getKLeastNumbersWithMaxHeap(int[] array, int k) {
        if (array == null || array.length == 0
                || k <= 0 || k > array.length) {
            return new ArrayList<>(0);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, (a, b) -> b.compareTo(a));
        for (int i = 0; i < k; i++) {
            maxHeap.add(array[i]);
        }
        for (int i = k; i < array.length; i++) {
            if (maxHeap.peek() > array[i]) {
                maxHeap.poll();
                maxHeap.add(array[i]);
            }
        }
        return new ArrayList<>(maxHeap);
    }
}