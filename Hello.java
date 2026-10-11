import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        int r = 3;
        int c = 4;
        int[][] matrix = {
                { 10, 20, 30, 40 },
                { 25, 35, 50, 60 },
                { 90, 11, 14, 15 }
        };

        int[] arr = { 20, 35, 50, 60, 15, 14 };

        boolean[][] trace = new boolean[r][c];
        while (true) {
            int[] findIdx = findEle(matrix, trace, arr[0], r, c);
            if (findIdx[0] == -1) {
                break;
            } else {
                if (bfs(findIdx, matrix, arr, trace, r, c, 0, findIdx)) {
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");

    }

    public static boolean bfs(int[] seq, int[][] matrix, int[] arr, boolean[][] trace, int r, int c, int idx,
            int[] findIdx) {
        idx++;
        ArrayList<int[]> dq = new ArrayList<>();
        dq.add(findIdx);
        while (!dq.isEmpty()) {
            int[] poped = dq.removeLast();
            int i = poped[0];
            int j = poped[1];
            trace[i][j] = true;
            int[][] dirs = { { i, j - 1 }, { i, j + 1 }, { i + 1, j }, { i - 1, j } };
            for (int[] dir : dirs) {
                int a = dir[0];
                int b = dir[1];
                if (a >= 0 && a < r && b >= 0 && b < c && !trace[a][b]) {
                    if (matrix[a][b] == seq[idx]) {
                        idx++;
                        if (idx == seq.length) {
                            return true;
                        }
                        dq.addLast(new int[] { a, b });
                    }
                }
            }
        }
        if (idx == seq.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public static int[] findEle(int[][] matx, boolean[][] trace, int ele, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (matx[i][j] == ele && !trace[i][j]) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}