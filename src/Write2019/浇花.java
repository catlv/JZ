package Write2019;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//o2 > o1  return 1 ，表示从大到小排序
public class 浇花 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int x1 = Integer.parseInt(s[1]);
        int y1 = Integer.parseInt(s[2]);
        int x2 = Integer.parseInt(s[3]);
        int y2 = Integer.parseInt(s[4]);
        long[][] r = new long[n][2];
        long d2 = 0, min = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            String[] temp = br.readLine().split(" ");
            int x = Integer.parseInt(temp[0]);
            int y = Integer.parseInt(temp[1]);
            r[i][0] = (long) (Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
            r[i][1] = (long) (Math.pow(x - x2, 2) + Math.pow(y - y2, 2));
        }
        Arrays.sort(r, (o1, o2) -> o2[0] > o1[0] ? 1 : -1);
        for (int i = 0; i < n; i++) {
            min = Math.min(min, r[i][0] + d2);
            d2 = Math.max(d2, r[i][1]);
        }
        System.out.println(Math.min(min, d2));
    }
}
