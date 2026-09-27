import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class Hello {
    public static void main(String[] args) {
        int r = 6;
        int c = 7;
        // int[][] grid = new int[c][r];
        int[][] grid = {
                { 0, 0, 3, 1, 1, 1, 0 },
                { 0, 0, 0, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 0, 0, 0 },
                { 0, 1, 0, 1, 0, 0, 0 },
                { 5, 0, 1, 0, 0, 0, 0 },
                { 1, 1, 1, 0, 1, 0, 1 }
        };
        boolean[][] track = new boolean[r][c];
        int[][] dist = new int[r][c];
        int[] st = findSt(grid, r, c);
        int i = st[0];
        int j = st[1];
        if (i == -1) {
            System.out.println("st not found");
            return;
        } else {
            bfs(i, j, grid, track, r, c, dist);
        }
        printDist(dist);
    }

    public static void bfs(int x, int y, int[][] grid, boolean[][] track, int r, int c, int[][] dist) {
        Deque<int[]> dq = new ArrayDeque<>();
        // st.push(new int[] { x, y });
        dq.addLast(new int[] { x, y });
        track[x][y] = true;
        dist[x][y] = 0;
        while (!dq.isEmpty()) {
            int[] poped = dq.removeFirst();
            int i = poped[0];
            int j = poped[1];
            int[][] dirs = { { i - 1, j }, { i + 1, j }, { i, j + 1 }, { i, j - 1 }, { i - 1, j - 1 },
                    { i + 1, j + 1 } };
            for (int[] dir : dirs) {
                int a = dir[0];
                int b = dir[1];
                if (a >= 0 && a < r && b >= 0 && b < c && !track[a][b] && (grid[a][b] == 1 || grid[a][b] == 5)) {
                    track[a][b] = true;
                    dist[a][b] = dist[i][j] + 1;
                    dq.addLast(new int[] { a, b });
                    if (grid[a][b] == 5) {
                        System.out.println("reached the end");
                        return;
                    }
                }
            }
        }
    }

    public static int[] findSt(int[][] grid, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 3) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }

    public static void printTracer(boolean[][] track) {
        for (boolean[] tr : track) {
            System.out.println(Arrays.toString(tr));
        }
    }

    public static void printDist(int[][] dist) {
        for (int[] dis : dist) {
            System.out.println(Arrays.toString(dis));
        }
    }
}