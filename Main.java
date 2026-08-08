import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        ArrayList<Integer> arr = new ArrayList<>();
        for(int a : nums){
            arr.add(a);
            arr.add(-a);
        }
        ArrayList<Integer> list = new ArrayList<>();
        backtrack(arr, list, 1, 0,nums.length);
        System.out.println(arr);
    }
    public static void backtrack(ArrayList<Integer>  arr,ArrayList<Integer> list,int tar,int sum,int len){
        if(list.size() == len){
            // System.out.println(list);
            if(sum == tar){
                System.out.println(list);
            }
            return;
        }
        for(int a : arr){
            list.addLast(a);
            sum+=a;
            backtrack(arr, list, tar, sum,len);
            sum-=list.removeLast();
        }
    }
}