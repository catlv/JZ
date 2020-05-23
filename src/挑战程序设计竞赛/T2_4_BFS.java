package 挑战程序设计竞赛;

/**
 * 给定一个 nxm 的迷宫，n,m<=100，迷宫由走道'.'和墙壁'#'组成，每一步可以走相邻的上下左右四格
 * 问从起点S到终点G所需的最少步数。
 */
public class T2_4_BFS {
    int INF = Integer.MAX_VALUE;
    int n;
    int m;
    char[][] maze = new char[n][m];
    int sx, sy;
    int gs, gy;
    int[][] d = new int[n][m]; //到各个位置的最短距离的数组
    int[] dx = new int[]{1, 0, -1, 0};
    int[] dy = new int[]{0, 1, 0, -1}; //4个方向移动的向量

}
