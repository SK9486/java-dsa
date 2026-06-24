import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,2,1,2,2,1};
        Arrays.sort(arr);
        printArr(arr);
        int mid = arr.length / 2;
        if(arr.length % 2 != 0){
            mid++;
        }
        System.out.println("mid : "+mid);
        reverseArr(arr, 0, mid-1);
        reverseArr(arr, mid, arr.length-1);
        printArr(arr);
        rearranging(arr, mid);
        printArr(arr);

    }
    public static void printArr(int[] arr){
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }
    public static void reverseArr(int[] arr,int i,int j){
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void rearranging(int[] arr,int mid){
        int p2= 0;
        for(int p1 =0;p1<arr.length;p1++){
            System.out.println("p1 : "+p1+" p2 : "+p2);
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            if(p1 < mid){
                p2 = 2 * p1;
            }else{
                p2 = 2 * (p1-mid) +1;
            }
        }
    }
}