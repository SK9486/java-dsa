import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int n = 0;
        String binOfN = intToBin(n);
        int res = countConsecutiveOnes(binOfN);
        System.out.println("res : "+res);
    }
    public static String intToBin(int n){
        int rem = -1;
        int curr = n;
        String str = "";
        while(curr != 0){
            rem = curr % 2;
            curr = curr / 2;
            str+= String.valueOf(rem);
            System.out.println("rem : "+rem);
        }
        System.out.println("str : "+str);
        return str;
    }
    public static int countConsecutiveOnes(String str){
        int p2;
        int max = 0;
        for(int p1 =0;p1<str.length();p1++){
            if(str.charAt(p1) == '1'){
                p2 = p1;
                while(p2<str.length() && str.charAt(p2) == '1'){
                    p2++;
                }
                System.out.println("len : "+(p2-p1));
                max = Integer.max(max, p2-p1);
                p1 = p2;
            }
        }
        return max;
    }
}