package Write2018;

import java.util.Scanner;

/**
 * 逆时针打印矩阵
 * 输入 3 3
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * <p>
 * 输出：1 4 7 8 9 6 3 2 5
 */

public class 螺旋矩阵 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] nums = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = sc.nextInt();
            }
        }
        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = m - 1;
        while (rowStart <= rowEnd && colStart <= colEnd) {
            for (int i = rowStart; i <= rowEnd; i++) {
                System.out.print(nums[i][colStart] + " ");
            }
            colStart++;

            for (int i = colStart; i <= colEnd; i++) {
                System.out.print(nums[rowEnd][i] + " ");
            }
            rowEnd--;

            if (colEnd >= colStart) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    System.out.print(nums[i][colEnd] + " ");
                }
            }
            colEnd--;

            if (rowEnd >= rowStart) {
                for (int i = colEnd; i >= colStart; i--) {
                    System.out.print(nums[rowStart][i] + " ");
                }
            }
            rowStart++;
        }
        sc.close();
    }
}
