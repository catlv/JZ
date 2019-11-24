package topic2;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class T_29_LeastK {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        if (input == null || k <= 0 || k > input.length) {
            return new ArrayList<>();
        }
        //使用前k个数来建立一个大根堆，堆顶为最大元素
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, (a, b) -> b.compareTo(a));
        for (int e : input) {
            if (maxHeap.size() < k) {
                maxHeap.add(e);
            } else if (maxHeap.peek() > e) {
                maxHeap.poll();
                maxHeap.add(e);
            }
        }
        return new ArrayList<>(maxHeap);
    }
}