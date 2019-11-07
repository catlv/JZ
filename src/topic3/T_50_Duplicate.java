package topic3;

import java.util.HashMap;

public class T_50_Duplicate {
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        if (length == 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            while (i != numbers[i]) {
                if (numbers[i] == numbers[numbers[i]]) {
                    duplication[0] = numbers[i];
                    return true;
                } else {
                    int temp = numbers[numbers[i]]; //此处要先写numbers[numbers[i]]
                    numbers[numbers[i]] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        return false;
    }

    public boolean duplicate2(int numbers[], int length, int[] duplication) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (map.containsKey(numbers[i])) {
                duplication[0] = numbers[i];
                return true;
            } else {
                map.put(numbers[i], 0);
            }
        }
        return false;
    }
}
