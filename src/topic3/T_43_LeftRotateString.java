package topic3;

public class T_43_LeftRotateString {
    public String LeftRotateString(String str, int n) {
        int len = str.length();
        if (len == 0) {
            return str;
        }
        char[] chars = str.toCharArray();

        for (int i = 0, j = len - 1; i < j; i++, j--) {
            swap(chars, i, j);
        }
        for (int i = 0, j = len - 1 - n; i < j; i++, j--) {
            swap(chars, i, j);
        }
        for (int i = len - n, j = len - 1; i < j; i++, j--) {
            swap(chars, i, j);
        }

        return String.valueOf(chars);
    }

    public void swap(char[] chars, int i, int j) {
        char temp;
        temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }

    public String LeftRotateString2(String str, int n) {
        int len = str.length();
        if (len == 0) {
            return str;
        }
        n %= len;
        //字符串分割，尾部不包括
        String s1 = str.substring(0, n);
        String s2 = str.substring(n, len);
        return s2 + s1;
    }
}