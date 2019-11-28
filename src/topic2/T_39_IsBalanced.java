package topic2;

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */
public class T_39_IsBalanced {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) {
            return true;
        }
        return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right)&&Math
    }
}
