package topic2;

import java.util.ArrayList;
import java.util.LinkedList;

public class T_22_PrintFromTopToBottom {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> array = new ArrayList<>();
        if (root == null) {
            return array;
        }
        /**
         * ArrayList 查找时间复杂度为O(1)，添加删除为O(n)
         * LinkedList查找时间复杂度为O(n)，添加删除为O(1)
         */
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(root);

        while (!list.isEmpty()) {
            TreeNode node = list.poll();
            array.add(node.val);
            if (node.left != null) {
                list.add(node.left);
            }
            if (node.right != null) {
                list.add(node.right);
            }
        }
        return array;
    }
}
