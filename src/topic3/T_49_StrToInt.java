package topic3;

/**
 * long是长整型，int是整型，str.charAt()是字符型
 * 由 str.charAt()-'0' 即可得到此字符型对应的整型了
 */
public class T_49_StrToInt {
    public int StrToInt(String str) {
        if (str.length() == 0) {
            return 0;
        }
        int flag = 0; //判断第一位是不是符号位
        if (str.charAt(0) == '+') {
            flag = 1;
        }
        if (str.charAt(0) == '-') {
            flag = 2;
        }
        int start = flag > 0 ? 1 : 0;
        long res = 0;
        while (start < str.length()) {
            if (str.charAt(start) > '9' || str.charAt(start) < '0') {
                //return后整个方法就结束了，也就是如果里面有非数字型的数值，直接返回0
                return 0;
            }
            res = res * 10 + (str.charAt(start) - '0');
            start++;
        }
        return (int) (flag == 2 ? -res : res);
    }
}
