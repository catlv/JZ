package topic2;

import java.util.ArrayList;

public class T_24_FindPath {
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        helper(root, target, res, new ArrayList<Integer>());
        return res;
    }

    private void helper(TreeNode root, int target, ArrayList<ArrayList<Integer>> res, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            res.add(new ArrayList<Integer>(list));
        } else {
            if (root.left != null) {
                helper(root.left, target, res, list);
            }
            if (root.right != null) {
                helper(root.right, target, res, list);
            }
        }
        list.remove(list.size() - 1); //回溯法
    }
}
