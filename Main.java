import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        inputHandler(n, sc);
    }
    public static void inputHandler(int n,Scanner sc){
        for(int i=0;i<n;i++){
            String num1 = sc.nextLine();
            String num2 = sc.nextLine();
            int[] prefixNum1 = prefix(num1);
            // System.out.println("pref1 : "+prefixNum1);
            // for(int a : prefixNum1){
            //     System.out.print(a+" ");
            // }
            // System.out.println();
            int[] prefixNum2 = prefix(num2);
            // for(int b : prefixNum2){
            //     System.out.print(b+" ");
            // }
            // System.out.println("pref2 : "+prefixNum2);
            if(prefixNum1[prefixNum1.length -1] == prefixNum2[prefixNum2.length -1]){
                System.out.println(FindCommonNums(prefixNum1, prefixNum2));
            }else{
                System.out.println(-1);
            }

        }
    }
    public static int[] prefix(String num){
        int sum = 0;
        int[] arrs = new int[num.length()];
        for(int i=0;i<num.length();i++){
            int curr = num.charAt(i) - '0';
            sum += curr;
            if(sum >= 10){
                sum = sum % 10;
            }
            arrs[i] = sum;
            // System.out.println("sum : "+sum);
        }
        return arrs;
    }

    public static int FindCommonNums(int[] num1,int[] num2){
        int[][] dp = new int[num2.length +1][num1.length +1];
        // for(int[] d: dp){
        //     for(int a : d){
        //         System.out.print(a+" ");
        //     }
        //     System.out.println();
        // }
        // System.out.println();
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[i].length;j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }else{
                    int n1 = num2[i-1];
                    int n2 = num1[j-1];
                    if(n1 == n2){
                        dp[i][j] = dp[i-1][j-1] + 1;
                    }else{
                        dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            }
        }
        return dp[num2.length][num1.length];

    }
}

// 123450
// 012345