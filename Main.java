import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class Main{
   public static void main(String[] args) {
      int[] arr = {1,2,3};
      ArrayList<String> res = new ArrayList<>();
      res.add(String.valueOf(arr[0]));
      recursion(1, res, arr);
   }

   public static void recursion(int a,ArrayList<String> res,int[] arr){
      ArrayList<String> arr1 = new ArrayList<>(res);
      ArrayList<String> arr2 = new ArrayList<>(res);
      if(a == arr.length){
         // System.out.println("A == arr len");
         System.out.println(res);
         return;
      }
      int curr = arr[a];
      if(curr < 1 || curr > 26){
         return;
      }
      // single
      arr1.add(String.valueOf(curr));
      // System.out.println(arr1);
      recursion(a+1, arr1, arr);
      // mingle
      String prev = arr2.removeLast();
      // System.out.println("prev : "+prev);
      String merge = prev+curr;
      int val = Integer.valueOf(merge);
      if(val < 1 || val > 26){
         return;
      }
      arr2.add(merge);
      // System.out.println(arr2);
      recursion(a+1, arr2, arr);
   }
}