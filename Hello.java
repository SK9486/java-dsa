import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println("N : " + n);
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            // System.out.println("M : " + m);
            int[] arr = new int[m];
            for (int j = 0; j < m; j++) {
                arr[j] = sc.nextInt();
            }
            // System.out.println(Arrays.toString(arr));
            int count = inputHandling(arr);
            System.out.println("Case #" + (i + 1) + ": " + count);

        }

    }

    public static int inputHandling(int[] arr) {
        int c = 0;
        int curr_max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int nxt;
            if (i < arr.length - 1) {
                nxt = arr[i + 1];
            } else {
                nxt = Integer.MIN_VALUE;
            }
            int prev;
            if (i == 0) {
                prev = 0;
            } else {
                prev = arr[i - 1];
            }

            if (curr > curr_max) {
                curr_max = curr;
            }
            // System.out.println("i : " + i);
            if (checkIsSatisfy(arr, 0, i, curr_max, nxt, curr, prev)) {
                c++;
                // System.out.println("YES!!");
            }
            // System.out.println("c : " + c);
        }
        return c;
    }

    public static boolean checkIsSatisfy(int[] arr, int st, int ed, int max, int next, int curr, int prev) {

        // System.out.println("curr : " + curr);
        // System.out.println("curr max : " + max);
        // System.out.println("next : " + next);
        // System.out.println("prev : " + prev);

        // for (int i = st; i < ed; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        if (curr == max && next < curr && prev < curr) {
            return true;
        } else {
            return false;
        }

    }
}