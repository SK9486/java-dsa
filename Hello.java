import java.util.*;

class Hello{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextLong();
        }
        inputHandler(m, sc, arr);
    }
    public static void inputHandler(int m,Scanner sc,long[] arr){
        for(int i=0;i<m;i++){
            int st = sc.nextInt();
            int ed = sc.nextInt();
            System.out.println(prefixSum(arr, st, ed));
        }
    }
    public static long prefixSum(long[] arr,int st,int ed){
        long sum =0;
        for(int i=st-1;i<ed;i++){
            sum += arr[i];
        }
        return sum;
    }
}