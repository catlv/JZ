package 挑战程序设计竞赛;

/**
 * 大小为 NxM 的园子，雨后积起了水，八连通的积水被认为是连在一起的，求出园子里有多少水洼。N,M<=100
 * 思路：从任意w水洼位置开始DFS，每次DFS都将w邻接位置用'.'代替。一次DFS后，与初始这个w连接的所有w都被替换
 * 直到不存在w为止。DFS次数就是答案。时间复杂度为O(NM)
 */
public class T2_3_DFS2 {
    int n, m;
    char[][] field = new char[n][m];

    public int count() {
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (field[i][j] == 'W') {
                    dfs(i, j);
                    res++;
                }
            }
        }
        return res;
    }

    private void dfs(int x, int y) {
        field[x][y] = '.';
        for (int dx = -1; dx <= 1; dx++) {
            for (int dy = -1; dy <= 1; dy++) {
                int nx = x + dx;
                int ny = y + dy;
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && field[nx][ny] == 'W') {
                    dfs(nx, ny);
                }
            }
        }
    }

    public static void main(String[] args) {
        T2_3_DFS2 t = new T2_3_DFS2();
        t.n = 2;
        t.m = 2;
        t.field = new char[][]{{'.', '.'}, {'.', 'W'}};
        int c = t.count();
        System.out.println(c);
    }
}
