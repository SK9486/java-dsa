import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        int[] arr = { 3, 0, 0, 1 };
        int[] dp = new int[arr.length + 1];
        ArrayList<ArrayList<Integer>> possibe_paths = new ArrayList<>();
        for (ArrayList<Integer> ar : possibe_paths) {
            System.out.println(ar);
        }
        for (int i = 0; i <= arr.length; i++) {
            ArrayList<Integer> path = new ArrayList<>();
            possibe_paths.add(path);
        }
        printArr(possibe_paths);
        // ADDING THE POSSIBLE PATHSW
        for (int i = 0; i < possibe_paths.size(); i++) {
            if (i < arr.length) {
                int curr = arr[i];
                System.out.println("curr : " + curr);
                for (int j = 1; j <= curr; j++) {
                    int idx = i + j;
                    if (idx < possibe_paths.size()) {
                        ArrayList<Integer> path = possibe_paths.get(idx);
                        path.add(i);
                    }
                    System.out.println("idx : " + idx);
                }
            }
        }
        // printArr(possibe_paths);
        // System.out.println("dp : ");
        // System.out.println(Arrays.toString(dp));

        for (int i = 1; i < dp.length; i++) {
            ArrayList<Integer> path = possibe_paths.get(i);
            // System.out.println("i : " + i);
            if (!path.isEmpty()) {
                int min_idx = path.get(0);
                int min_val = dp[min_idx];
                // System.out.println("min idx : " + min_idx);
                // System.out.println("min val : " + min_val);
                for (int j = 1; j < path.size(); j++) {
                    int curr_idx = path.get(j);
                    int curr_val = dp[curr_idx];
                    if (curr_val < min_val) {
                        min_val = curr_val;
                        min_idx = curr_idx;
                    }
                }
                dp[i] = 1 + min_val;
                // System.out.println("min val : " + min_val);
            }

        }
        // System.out.println("dp : ");
        // System.out.println(Arrays.toString(dp));

        System.out.println(dp[dp.length - 1]);
    }

    public static void printArr(ArrayList<ArrayList<Integer>> arr) {
        for (ArrayList<Integer> ar : arr) {
            System.out.println(ar);
        }
    }
}