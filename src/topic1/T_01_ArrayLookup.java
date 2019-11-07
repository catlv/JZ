package topic1;

public class T_01_ArrayLookup {
    public boolean Find(int target, int[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            return false;
        }
        int row = 0;
        int col = array[0].length - 1;
        while (row < array.length && col > -1) {
            if (array[row][col] > target) {
                col--;
            } else if (array[row][col] == target) {
                return true;
            } else {
                row++;
            }
        }
        return false;
    }
}
