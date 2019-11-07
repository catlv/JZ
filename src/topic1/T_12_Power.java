package topic1;

public class T_12_Power {
    //非递归方式
    public double Power(double base, int exponent) {
        double result = base;
        int n = exponent;
        if (exponent == 0) {
            return 1;
        }
        if (exponent < 0) {
            exponent = -exponent;
        }
        for (int i = 2; i <= exponent; i++) {
            result *= base;
        }

        return n < 0 ? 1 / result : result;
    }

    //递归方式
    public double getTheResult(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        } else {
            double res = getTheResult(base, exponent >> 1);
            res *= res;
            if (exponent % 2 == 1) {
                return res *= base;
            }
            return res;
        }
    }

    public double Power2(double base, int exponent) {
        boolean isNegetive = false;
        if (exponent < 0) {
            exponent = -exponent;
            isNegetive = true;
        }
        double result = getTheResult(base, exponent);
        if (isNegetive) {
            return 1 / result;
        } else {
            return result;
        }
    }
}
