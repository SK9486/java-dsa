import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

    class Hello {
        public static void main(String[] args) {
            int[] arr = {5,4,-1,7,8};
            int max = Integer.MIN_VALUE;
            int[] dp = new int[arr.length];
            dp[0] = arr[0];
            for(int i=1;i<arr.length;i++){
                dp[i] = Math.max(dp[i-1]+arr[i], arr[i]);
                printDP(dp);
                max = Math.max(dp[i], max);
            }
            System.out.println("max : "+max);
        }

        public static void printDP(int[] arr){
            System.out.print("dp : ");
            for(int a : arr){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }