import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // int n = 5;
        // int[][] arr = {
        //     {1,2,3,4,2},
        //     {6,7,8,9,0},
        //     {1,2,3,4,5},
        //     {6,7,8,9,0},
        //     {9,2,3,4,5}
        // };
        // int n = 4;
        // int[][] arr = {
        //    {12,23,34,45},
        //    {23,34,12,56},
        //    {34,45,56,67},
        //    {12,23,34,45}
        // };
        int n  =3;
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        if(n % 2 == 0){
            int[] top_right = new int[(n/2) * (n/2)];
            int[] bott_left = new int[(n/2) * (n/2)];
            handleEvenMatx(arr,n,top_right,bott_left);
        }else{
            int[] top_right = new int[((n+1)/2) * ((n+1)/2)];
            int[] bott_left = new int[((n+1)/2) * ((n+1)/2)];
            handleOddMatx(arr, n, top_right, bott_left);
        }
    }
    public static void handleEvenMatx(int[][] mat, int n,int[] top_right,int[] bott_left){
        int tr = 0;
        int bl = 0;
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<(n/2) && (j>=n/2)){
                    // System.out.print("r,r ");
                    top_right[tr++] = mat[i][j];
                }
                if(j<(n/2) && i>=(n/2)){
                    // System.out.print("l,l ");
                    bott_left[bl++] = mat[i][j];
                }
                // else{
                //     System.out.print(i+","+j+" ");
                // }
            }
            System.out.println();
        }
        commonElements(top_right, bott_left);
    }
    public static void handleOddMatx(int[][] mat, int n,int[] top_right,int[] bott_left){
        int tr = 0;
        int bl = 0;
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i<=(n/2) && (j>=n/2)){
                    // System.out.print("r,r ");
                    top_right[tr++] = mat[i][j];
                }
                if(j<=(n/2) && i>=(n/2)){
                    // System.out.print("l,l ");
                    bott_left[bl++] = mat[i][j];
                }
                // else{
                //     System.out.print(i+","+j+" ");
                // }
            }
            System.out.println();
        }
        commonElements(top_right, bott_left);
    }
    public static void commonElements(int[] top_right,int[] bott_left){
        int c = 0;
        Arrays.sort(top_right);
        Arrays.sort(bott_left);
        int i =0;
        int j = 0;
        while(i < top_right.length && j < bott_left.length){
            if(top_right[i] == bott_left[j]){
                // System.out.println(top_right[i]+" == "+bott_left[j]);
                c++;
                i++;
                j++;
            }else if(top_right[i] < bott_left[j]){
                i++;
            }else{
                j++;
            }
        }
        System.out.println(c);
    }
}