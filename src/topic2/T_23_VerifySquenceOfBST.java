package topic2;

//判断数组是不是某二叉搜索树的后序遍历的结果
public class T_23_VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length == 0) {
            return false;
        }
        return isTreeBST(sequence, 0, sequence.length - 1);
    }

    private boolean isTreeBST(int[] sequences, int start, int end) {
        if (start >= end) {
            return true;
        }
        int i = start;
        while (i < end && sequences[i] < sequences[end]) {
            i++;
        }
        for (int j = i; j < end; j++) {
            if (sequences[j] <= sequences[end]) {
                return false;
            }
        }
        return isTreeBST(sequences, start, i - 1) && isTreeBST(sequences, i, end - 1);
    }
}
