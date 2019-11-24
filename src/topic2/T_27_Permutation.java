package topic2;

import java.util.ArrayList;
import java.util.Arrays;

public class T_27_Permutation {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if (str.length() == 0) {
            return res;
        }
        char[] c = str.toCharArray();
        Arrays.sort(c);
        helper(res, new StringBuilder(), c, new boolean[c.length]);
        return res;
    }

    private void helper(ArrayList<String> res, StringBuilder s, char[] c, boolean[] used) {
        if (s.length() == c.length) {
            res.add(s.toString());
            return;
        }
        for (int i = 0; i < c.length; i++) {
            if (used[i]) {
                continue;
            }
            if (i > 0 && c[i] == c[i - 1] && used[i - 1]) {
                continue;
            }
            used[i] = true;
            s.append(c[i]);
            helper(res, s, c, used);
            s.deleteCharAt(s.length() - 1);
            used[i] = false;
        }
    }
}
