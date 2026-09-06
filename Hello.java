import java.util.ArrayList;
import java.util.Arrays;

class Hello {
    public static void main(String[] args) {
        int[][] matx = {
                { 1, 2, 3, 4, 5, 6 },
                { 1, 2, 3, 4, 5, 6 },
                { 1, 2, 3, 4, 5, 6 },
                { 1, 2, 3, 4, 5, 6 },
                { 1, 2, 3, 4, 5, 6 },
                { 1, 2, 3, 4, 5, 6 },
        };
        // int[][] matx = {
        // { 11, 12, 13 },
        // { 21, 22, 23 },
        // { 31, 32, 33 }
        // };
        int n = matx.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    printRem(i, j, matx);
                    break;
                } else {
                    System.out.print(matx[i][j] + " ");
                }
            }
        }

    }

    public static void printRem(int i, int j, int[][] matx) {
        for (int a = i; a >= 0; a--) {
            System.out.print(matx[a][j] + " ");
        }
        System.out.println();
        // System.out.println("printRem");
    }
}