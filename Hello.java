import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

class Hello{
    public static void main(String[] args) {
        String str = "dsuccxulnl";
        StringBuilder sb = new StringBuilder(str);
        Scanner sc = new Scanner(System.in);
        int n = 8;
        while(n>0){
            int q = sc.nextInt();
            int x = sc.nextInt();
            sb = quryExecutor(sb,q,x);
            n--;
        }
    }
    public static StringBuilder quryExecutor(StringBuilder sb,int q,int x){
        if(q == 2){
            System.out.println(sb.toString().charAt(x-1));
        }else{
            for(int i=x-1;i>=0;i--){
               int lastindex = sb.length() -1;
               char lastChar = sb.toString().charAt(lastindex);
               sb.deleteCharAt(lastindex);
               sb.insert(0, lastChar);
               System.out.println("string : "+sb.toString());
            }
        }
        return sb;
        
    }
}