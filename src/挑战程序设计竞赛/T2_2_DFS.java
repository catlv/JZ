package 挑战程序设计竞赛;

/**
 * 给定整数a1,a2...,an，判断是否可以从中选出若干数，使它们的和为k。1<=n<=20
 */
public class T2_2_DFS {
    int[] a = new int[21];
    int n;
    int k;

    //已经从前i项得到了 sum，现在对 i 之后的情况进行分支
    public boolean dfs(int i, int sum) {
        if (i == n) {
            return sum == k;
        }
        //不加上 a[i+1]
        if (dfs(i + 1, sum)) {
            return true;
        }
        //加上 a[i+1]
        if (dfs(i + 1, sum + a[i])) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        //n=4，a={1,2,4,7}，k=15
        T2_2_DFS t = new T2_2_DFS();
        t.n = 4;
        t.a = new int[]{1, 2, 4, 8};
        t.k = 15;
        boolean res = t.dfs(0, 0);
        System.out.println(res);
    }
}
