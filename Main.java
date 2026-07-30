import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        int[] arrs = {2,3,6,7};
        Arrays.sort(arrs);
    }
    public static void backTracking(int tar,int[] arr,int sum){
        if(sum > tar){
            return;
        }
        if(sum == tar){
            System.out.println("FOUNDED : ");
            return;
        }
    }
}