
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1 };
        int tar = 1;
        boolean[] dp = new boolean[tar + 1];
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            if (curr <= tar) {
                if (i == 0) {
                    dp[0] = true;
                    int sum = curr + 0;
                    if (sum <= tar) {
                        dp[sum] = true;
                    }
                } else {
                    ArrayList<Integer> idexs = new ArrayList<>();
                    for (int j = 0; j < dp.length; j++) {
                        if (dp[j]) {
                            int sum = j + curr;
                            if (sum <= tar) {
                                idexs.add(sum);
                            }
                        }
                    }
                    for (int a : idexs) {
                        dp[a] = true;
                    }
                    idexs.clear();
                }
                dp[curr] = true;
            }
        }
        System.out.println(Arrays.toString(dp));
    }
}