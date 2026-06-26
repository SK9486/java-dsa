import java.util.Arrays;

class Hello{
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int threshold = 5;
        int lowerBound = 1;
        int upperBound = findMax(nums);
        // for(int i= lowerBound;i<=upperBound;i++){
        //     int sum = roundSum(nums, i);
        //     if(sum <= threshold){
        //         System.out.println();
        //         System.out.println("output : "+i);
        //         break;
        //     }
        //     System.out.println("for d : "+i+" sum is : "+sum);
        // }
        System.out.println("ans : "+binarySearch(nums, lowerBound, upperBound, threshold));
    }
    public static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int a : arr){
            if(a>max){
                max =a;
            }
        }
        return max;
    }
    public static int roundSum(int[] arr,int d){
        int sum =0;
        for(int a : arr){
            sum += (a+(d-1))/d;
        }
        return sum;
    }

    public static int binarySearch(int[] arr,int lower,int higher, int threshold){
        int i = lower;
        int j = higher;
        int mid  =-1;
        int ans = -1;
        while(i<=j){
            mid= ((i+j)/2);
            System.out.println("i : "+i+" j : "+j+" mid : "+mid);
            int round = roundSum(arr, mid);
            System.out.println("round : "+round);
            if(round <= threshold){
                System.out.println("founded : "+mid);
                ans = mid;
                j = mid - 1;
            }else{
                i = mid +1;
            }
        }
        return ans;
    }
}