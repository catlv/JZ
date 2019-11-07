package topic2;

import java.util.ArrayList;
import java.util.Comparator;

public class T_32_PrintMinNumber {
    public String PrintMinNumber(int[] numbers) {
        if (numbers.length == 0) {
            return "";
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int number : numbers) {
            list.add(number);
        }
        list.sort((Comparator<Integer>) (o1, o2) -> {
            String s1 = o1 + "" + o2;
            String s2 = o2 + "" + o1;
            return s1.compareTo(s2);
        });

        StringBuilder s = new StringBuilder();
        for (int j : list) {
            s.append(j);
        }
        return s.toString();
    }
}
