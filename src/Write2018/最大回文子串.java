package Write2018;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 输出该字符串的最长回文子串的长度。（不要求输出最长回文串，并且子串不要求连续）
 * 例如：adbca，输出3 ，也就是 ada / aba / aca /
 */
public class 最大回文子串 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] c = br.readLine().toCharArray();
        int len = c.length;
        int[][] dp = new int[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = 1;
        }
        for (int i = 1; i < len; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (c[i] == c[j]) {
                    dp[j][i] = dp[j + 1][i - 1] + 2;
                } else {
                    dp[j][i] = Math.max(dp[j][i - 1], dp[j + 1][i]);
                }
            }
        }
        System.out.println(dp[0][len - 1]);
    }
}
