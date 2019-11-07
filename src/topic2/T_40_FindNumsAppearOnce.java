package topic2;

import java.util.HashMap;

//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class T_40_FindNumsAppearOnce {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int n : array) {
            if (hashMap.containsKey(n)) {
                hashMap.remove(n);
            } else {
                hashMap.put(n, 1);
            }
        }

        int a[] = new int[array.length];
        int i = 0;
        for (int k : hashMap.keySet()) {
            a[i] = k;
            i++;
        }
        num1[0] = a[0];
        num2[0] = a[1];
    }
}