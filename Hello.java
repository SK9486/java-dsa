import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

    class Hello {
        public static void main(String[] args) {
            int[] arr = {100,1,1,100};
            if(arr.length == 0){
                // return arr;
            }
            else if(arr.length == 1){
                // return arr[0]
            }
            else if(arr.length == 2){
                // return Math.max(arr[0], arr[1]);
            }else{
                int[] dp = new int[arr.length];
                for(int i=0;i<arr.length;i++){
                    if(i == 0){
                        dp[i] = arr[i];
                        System.out.println("dp of "+i+" : "+arr[i]);
                    }else if(i == 1){
                        dp[i] = Math.max(dp[i-1],arr[i]);
                         System.out.println("dp of "+i+" : "+dp[i]);
                    }else{
                        dp[i] = Math.max((arr[i]+dp[i-2]), dp[i-1]);
                        System.out.println("dp of "+i+" : "+dp[i]);
                    }
                }
                // return dp[arr.length -1];

            }

    }
    }