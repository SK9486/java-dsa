import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

    class Hello {
       public static void main(String[] args) {
    
        int tar = 9;
        int[] coins = {2,5,10};
        int[][] dp = new int[coins.length][tar+1];
        
        for(int i =0;i<coins.length;i++){
            for(int j = 0;j<tar+1;j++){
                // System.out.print("("+i+" , "+j+") ");
                if(j == 0){
                    dp[i][j] = 0;
                }else{
                    if(i==0 &&coins[i] == 1){
                        dp[i][j] = j;
                    // System.out.println("dp[i,j] : "+dp[i][j]);
                    }
                    else if(i == 0 && coins[i] != 1){
                        if(j % coins[i] == 0){
                            dp[i][j] = j/coins[i];
                        }else{
                            dp[i][j] = Integer.MAX_VALUE;
                        }
                    }else{
                        if(coins[i] > j){
                            dp[i][j] = dp[i-1][j];
                            // System.out.println(j+" <  "+coins[i]);
                        }else{
                            int excluded =dp[i-1][j];
                            int included;
                            if(dp[i][Math.abs(coins[i] - j)] != Integer.MAX_VALUE){
                                included = 1 + dp[i][coins[i] - j];
                            }else{
                                included = Integer.MAX_VALUE;
                            }
                            dp[i][j] = Math.min(included, excluded);
                        }
                    }
                }
            }
            // System.out.println();
        }
        printDP(dp);
        backtracking(dp,coins);
        // int last = dp[coins.length -1][tar];
        // if(last > coins.length){
            // return -1;
        // }
        // return last;
        // dp[coins.length -1][tar] > coins.length ? return -1 : return dp[coins.length -1][tar];
        // System.out.println("last : "+last);
       }
    public static void printDP(int[][] dp){
        for(int[] a : dp){
            for(int b : a){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
    // backtracking you must do next
    public static void backtracking(int[][] dp,int[] coins){
        int i = dp.length -1;
        int j = dp[0].length -1;
        int last = dp[i][j];
        System.out.println(last);
        System.out.println("i : "+i+" j : "+j);
        while(dp[i-1][j] == dp[i][j]){
            System.out.println(dp[i][j]);
            System.out.println("i : "+i+" j : "+j);
            i = i-1;
        }
        int new_i = j-coins[i];
        i =  new_i;  
        System.out.println("i : "+i+" j : "+j);
        System.out.println(dp[i][j]);
    }
    }