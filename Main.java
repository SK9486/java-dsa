import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class Main{
   public static void main(String[] args) {
      int[] arr = {1,1,0,2,1,0};
      ArrayList<String> res = new ArrayList<>();
      res.add(String.valueOf(arr[0]));
      ArrayList<String> result = new ArrayList<>();
      System.out.println(Integer.parseInt(str));
      // recursion(1, res, arr,result);
      // System.out.println(result);
      // System.out.println(result.size());
   }

   public static void recursion(int a,ArrayList<String> res,int[] arr,ArrayList<String> result){
      ArrayList<String> arr1 = new ArrayList<>(res);
      ArrayList<String> arr2 = new ArrayList<>(res);
      if(a == arr.length){
         // System.out.println("A == arr len");
         System.out.println(res);
         convertToString(res,result);
         // System.out.println(Arrays.toString(c));
         return;
      }
      int curr = arr[a];
      // single
      arr1.add(String.valueOf(curr));
      // System.out.println(arr1);
      recursion(a+1, arr1, arr,result);
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
      recursion(a+1, arr2, arr,result);
   }

   public static void convertToString(ArrayList<String> arr,ArrayList<String> res){
      String out = "";
      for(String st : arr){
         int i = Integer.parseInt(st);
         char ch = (char) (64+i);
         if(!Character.isAlphabetic(ch)){
            return;
         }
         out += ch;
      }
      if(!res.contains(out)){
         res.add(out);
      }
      System.out.println(out);
      System.out.println();
   }
}