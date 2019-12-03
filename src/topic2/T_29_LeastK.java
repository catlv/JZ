package topic2;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class T_29_LeastK {
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        if (input == null || k <= 0 || k > input.length) {
            return new ArrayList<>();
        }
        //使用前k个数来建立一个大根堆，堆顶为最大元素。优先队列默认是小根堆
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