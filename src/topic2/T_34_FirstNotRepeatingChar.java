package topic2;

import java.util.HashMap;

public class T_34_FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        if (str.length() == 0) {
            return -1;
        }
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : chars) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}
