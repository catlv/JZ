package topic2;

import java.util.ArrayList;

public class T_24_FindPath {

    ArrayList<ArrayList<Integer>> resultList = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> list = new ArrayList<Integer>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) {
            return resultList;
        }
        list.add(root.val);
        target -= root.val;
        if (target == 0 && root.left == null && root.right == null) {
            resultList.add(new ArrayList<>(list));
        } else {
            FindPath(root.left, target);
            FindPath(root.right, target);
        }
        //每返回上一层一次就要回退一个节点,使它回到上一次状态。回溯法
        list.remove(list.size() - 1); //移除的是最后一个节点
        return resultList;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}