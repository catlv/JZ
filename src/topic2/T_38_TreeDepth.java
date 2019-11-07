package topic2;

import java.util.LinkedList;

public class T_38_TreeDepth {
    //递归
    public int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = TreeDepth(root.left) + 1;
        int rightDepth = TreeDepth(root.right) + 1;
        return leftDepth < rightDepth ? rightDepth : leftDepth;
    }

    //非递归，层次遍历
    public int TreeDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        LinkedList<TreeNode> q = new LinkedList<>();
        q.add(root);
        int deep = 0;
        while (!q.isEmpty()) {
            deep++;
            int count = 0;
            int size = q.size();
            while (count < size) { //弹出当前层的所有节点
                TreeNode cur = q.remove();
                count++;
                if (cur.left != null) {
                    q.add(cur.left);
                }
                if (cur.right != null) {
                    q.add(cur.right);
                }
            }
        }
        return deep;
    }
}
