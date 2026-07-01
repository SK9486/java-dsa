import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // int arr[] = {30,40,50,20,25};
        int[] arr = {20,10,11,12,13,14,14,15};
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = arr[i-1];
            if(prev > curr){
                System.out.println("i : "+i);
                int ans = arr.length - (arr.length - i);
                System.out.println("ans : "+ans);
                break;
            }
        }
    }
}