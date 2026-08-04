import java.util.*;
public class Hello {
    public static void main(String[] args) {
        int[] arr = {2,3,6,7};
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        int tar = 7;
        int sum = 0;
        backtracker(arr, sum, res,tar,list);
        System.out.println("res :");
        for(ArrayList<Integer> ar : res){
            System.out.println(ar);
        }
    }
    public static void backtracker(int[] arr,int sum,ArrayList<ArrayList<Integer>> res,int tar,ArrayList<Integer> list){
        if(sum == tar){
            // System.out.println("sum == tar");
            res.add(new ArrayList<>(list));
            // System.out.println(list);
            // sum-=dq.removeLast();
            // backtracker(arr, sum, dq, tar);
            return;
        }
        if(sum > tar){
            // System.out.println("sum > tar");
            // sum-=dq.removeLast();
            //  System.out.println("sum : "+sum);
            // backtracker(arr, sum, dq, tar);
            return;

        }
        // System.out.println(list);
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            // System.out.println("sum : "+sum);
            list.addLast(i);
            backtracker(arr, sum, res, tar,list);
            sum-=arr[list.removeLast()];
        }
    }
}   