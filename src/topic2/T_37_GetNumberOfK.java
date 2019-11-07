package topic2;

public class T_37_GetNumberOfK {
    //二分查找
    public int GetNumberOfK(int[] array, int k) {
        int len = array.length;
        if (len == 0)
            return 0;
        int first = getFirst(array, k, 0, len - 1);
        int last = getLast(array, k, 0, len - 1);
        if (first != -1 && last != -1) {
            return last - first + 1;
        }
        return 0;
    }

    public int getFirst(int[] array, int k, int start, int end) {
        int mid;
        while (start <= end) {
            mid = start + ((end - start) >> 1);
            if (k <= array[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        if (start < array.length && array[start] == k)
            return start;
        else
            return -1;
    }

    public int getLast(int[] array, int k, int start, int end) {
        int mid;
        while (start <= end) {
            mid = start + ((end - start) >> 1);
            if (k >= array[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        if (end >= 0 && array[end] == k)
            return end;
        else
            return -1;
    }

    //构造k-0.5，k+0.5
    public int GetNumberOfK2(int[] array, int k) {
        return biSearch(array, k + 0.5) - biSearch(array, k - 0.5);
    }

    private int biSearch(int[] array, double k) {
        int start=0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + ((end - start) >> 1);
            if (k < array[mid]) {
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return start; //也可以写成 return end;
    }
}