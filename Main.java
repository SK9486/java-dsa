import java.util.ArrayList;
import java.util.Arrays;

public class Main {
   public static void main(String[] args) {
      ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 4, 2, 3));
      int cost = recursion(1, arr, 0);
      System.out.println(cost);
   }

   public static int recursion(int branchCost, ArrayList<Integer> bottles, int cost) {
      if (bottles.size() <= 1) {
         int poped = bottles.removeLast();
         int finalCost = cost + (poped * branchCost);
         System.out.println("final Cost : " + finalCost);
         return finalCost;
      }
      ArrayList<Integer> arr1 = new ArrayList<>(bottles);
      ArrayList<Integer> arr2 = new ArrayList<>(bottles);
      int popped1 = arr1.removeFirst();
      int cost1 = branchCost * popped1;
      int final1 = recursion(branchCost + 1, arr1, cost + cost1);
      int popped2 = arr2.removeLast();
      int cost2 = branchCost * popped2;
      int final2 = recursion(branchCost + 1, arr2, cost + cost2);
      return Math.max(final1, final2);
   }
}