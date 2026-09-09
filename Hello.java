
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        int[] arr = { 3, 3, 3, 3 };
        int[] c = { Integer.MAX_VALUE };
        recursion(arr, 0, c);
        System.out.println("final : " + c[0]);
    }

    public static void recursion(int[] arr, int i, int[] c) {
        if (i == arr.length) {
            System.out.println(Arrays.toString(arr));
            int c1 = findMinDays(0, arr);
            c[0] = Math.min(c[0], c1);
            return;
        }
        int curr = arr[i];
        if (curr == 3) {
            int[] arr1 = Arrays.copyOf(arr, arr.length);
            arr1[i] = 1;
            int[] arr2 = Arrays.copyOf(arr, arr.length);
            arr2[i] = 2;
            recursion(arr1, i + 1, c);
            recursion(arr2, i + 1, c);
        } else {
            recursion(arr, i + 1, c);
        }
    }

    public static int findMinDays(int prev, int[] arr) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            if (i > 0) {
                prev = arr[i - 1];
            }
            if (curr == 0 || prev == curr) {
                c++;
                arr[i] = 0;
            }
        }
        System.out.println("c : " + c);
        return c;
    }
}