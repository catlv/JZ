package topic3;

import java.util.LinkedList;

public class T_46_LastRemaining {
    public int LastRemaining_Solution(int n, int m) {
        if (n < 1 || m < 1) {
            return -1;
        }
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int index = -1;
        while (list.size() > 1) {
            index = (index + m) % list.size();
            list.remove(index);
            index--; //每次加m的时候，实际要加的是m-1
        }
        return list.get(0);
    }
}
