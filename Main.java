import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        int[] nums = {4,3,2,6};
        int max_sum = Integer.MIN_VALUE;
        System.out.println(Arrays.toString(nums));
        for(int i=1;i<=nums.length;i++){
            rotateArr(nums);
            int sum = sumOfArr(nums);
            System.out.println("Sum : "+sum);
            if(sum > max_sum){
                max_sum = sum;
            }
            System.out.println(Arrays.toString(nums));
        }
        System.out.println(max_sum);
    }
    public static void rotateArr(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr[arr.length -1];
            int frst = arr[i];
            arr[arr.length - 1] = frst;
            arr[i] = last;
        }
    }
    public static int sumOfArr(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += (i * arr[i]);
        }
        return sum;
    }
}