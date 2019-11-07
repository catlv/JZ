package topic3;

public class T_51_Multiply {
    public static int[] multiply(int[] A) {
        int[] B = new int[A.length];
        for (int i = 0; i < B.length; i++) {
            B[i] = 1;
            for (int j = 0; j < B.length; j++) {
                if (j == i) {
                    continue;
                }
                B[i] *= A[j];
            }
        }
        return B;
    }
}
