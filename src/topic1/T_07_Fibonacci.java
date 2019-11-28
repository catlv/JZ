package topic1;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 */
public class T_07_Fibonacci {
    public int Fibonacci_Recursive(int n) {
        if (n <= 1) {
            return n;
        } else {
            return Fibonacci_Recursive(n - 1) + Fibonacci_Recursive(n - 2);
        }
    }

    public int Fibonacci_Non_Recursive(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            b = b + a;
            a = b - a;
        }
        return b;
    }
}