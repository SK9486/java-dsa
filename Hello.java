import java.util.*;

class Hello{
    public static void main(String[] args) {
    int[] nums ={-1,0,3,5,9,12};
    int tar = 3;
    int left_idx = 0;
    int right_idx = nums.length -1;
    int left;
    int right;
    while(left_idx + 1 <right_idx){
        int mid_idx = (left_idx + right_idx)/2;
        int mid = nums[mid_idx];
        left = nums[left_idx];
        right = nums[right_idx];
        if(tar > mid){
            left_idx = mid_idx;
        }else{
            right_idx = mid_idx;
        }
    }
    return tar == left ? left_idx : tar == right ? right_idx : -1;
    }
}