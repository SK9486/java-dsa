import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String str1 = "neuro";
        String str2 = "lemon";
        // String str1 = "orange";
        // String str2 = "energy";
        String res = strMerger(str1, str2);
        if(res.length() == 0){
            System.out.println("-1");
            return;
        }
        int mid = res.length() / 2;
        System.out.println("res  : "+res);
        System.out.println("mid : "+mid);
        for(int i=0;i<=mid;i++){
            int lft = mid - i;
            int rgh = mid + i;
            for(int j =0;j<res.length();j++){
                if(j <= rgh){
                    if(j == lft || j == rgh){
                        System.out.print(res.charAt(j));
                    }else{
                        System.out.print("-");
                    }
                }
                // else{
                //     System.out.print(" ");
                // }
            }
            System.out.println();
        }
    }

    public static String strMerger(String str1,String str2){
        if(str1.length() != str2.length()){
            return "";
        }
        String res = "";
        if((str1.charAt(0) == str2.charAt(str2.length() -1)) || str1.charAt(str1.length() -1 ) == str2.charAt(0)){
            if(str1.charAt(0) == str2.charAt(str2.length() -1)){
            String temp = str1;
            str1 = str2;
            str2 = temp;
            System.out.println("str1 : "+str1);
            System.out.println("str2 : "+str2);
            }
            for(int i=0;i<str1.length();i++){
                res+=str1.charAt(i);
            }
            for(int j =1;j<str2.length();j++){
                res += str2.charAt(j);
            }
        }
    return res;
    }
}