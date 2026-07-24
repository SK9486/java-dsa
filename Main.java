import java.util.*;

public class Main{
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int right_idx = nums.length -1;
        for(int i =0;i<nums.length-3;i++){
            int left_idx = i+1;
            int curr = nums[i];
            if(curr > 0){
                break;
            }
            while(left_idx < right_idx){
                int left = nums[left_idx];
                int right = nums[right_idx];
                int sum = left + curr + right;
                if(sum == 0){
                    System.out.println("founded : ");
                    res.add(new ArrayList<>(Arrays.asList(curr,left,right)));
                    System.out.println("Triplet : "+curr+" "+left+" "+right+" = "+sum);
                    break;
                }else if( sum < 0){
                    left_idx++;
                }else{
                    right_idx--;
                }
                System.out.println("Triplet : "+curr+" "+left+" "+right+" = "+sum);
            }
        }
    }
}