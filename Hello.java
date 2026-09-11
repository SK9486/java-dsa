
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 3;
        int[][] matx = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matx[i][j] = sc.nextInt();
            }
        }
        int[] c = { 0 };
        recursion(matx, 0, 0, c, m);
        System.out.println(c[0]);
        // for (int[] ar : matx) {
        // System.out.println(Arrays.toString(ar));
        // }
    }

    public static void recursion(int[][] matx, int i, int prev, int[] c, int m) {
        if (i == m) {
            // System.out.println("prev :" + prev);
            c[0]++;
            return;
        }
        int[] arr = matx[i];
        for (int j = 0; j < arr.length; j++) {
            int curr = arr[j];
            if (curr > prev) {
                recursion(matx, i + 1, curr, c, m);
            } else {
                return;
            }
        }
    }
}