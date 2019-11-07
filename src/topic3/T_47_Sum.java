package topic3;

public class T_47_Sum {
    public int Sum_Solution(int n) {
        int sum = n;
        boolean t = (n > 0) && (sum += Sum_Solution(n - 1)) > 0;
        return sum;
    }
}
