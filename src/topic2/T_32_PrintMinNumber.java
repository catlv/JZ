package topic2;

import java.util.ArrayList;

public class T_32_PrintMinNumber {
    public String PrintMinNumber(int[] numbers) {
        ArrayList<String> list = new ArrayList<>();
        for (int i : numbers) {
            list.add(i + "");
        }
        list.sort((a, b) -> (a + b).compareTo(b + a));
        StringBuilder res = new StringBuilder();
        for (String s : list) {
            res.append(s);
        }
        return res.toString();
    }
}
