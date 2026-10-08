import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hello {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int M = sc.nextInt();
            int amt = sc.nextInt();
            int[] arr = new int[M];
            for (int j = 0; j < M; j++) {
                arr[j] = sc.nextInt();
            }
            int no = findMaxItemBuy(arr, amt);
            System.out.println("Case #" + (i + 1) + ": " + no);
        }
        // int amt = 50;
        // int[] arr = { 51, 99, 85, 84, 50, 97 };

    }

    public static int findMaxItemBuy(int[] arr, int amt) {
        Arrays.sort(arr);
        if (amt < arr[0]) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            // System.out.println("i: " + i);
            int curr = arr[i];
            sum += curr;
            if (sum >= amt) {
                // System.out.println("breaked at : " + i);
                return i;
            }

            // System.out.println("curr : " + curr);
            // System.out.println("sum : " + sum);
        }
        return 0;
    }
}