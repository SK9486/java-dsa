
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
   public static void main(String[] args) {
      int no_of_stations = 4;
      int[] lane1_cost = { 0, 1, 2, 3, 4 };
      int[] lane2_cost = { 0, 2, 3, 2, 1 };
      int[] switching_cost = { 0, 1, 2, 1, 2 };
      int[] dp = new int[no_of_stations + 1];
      int[] prev_path = new int[no_of_stations + 1];
      prev_path[0] = -1;
      printDatas(lane1_cost, lane2_cost, switching_cost, dp, prev_path, no_of_stations);
      int cost_for_path1 = -1;
      int cost_for_path2 = -1;
      for (int i = 1; i <= no_of_stations; i++) {

         int prev_path_of_car = prev_path[i - 1];
         if (prev_path_of_car == -1) {
            System.out.println("intial state of car");
            cost_for_path1 = lane1_cost[i] + switching_cost[i];
            cost_for_path2 = lane2_cost[i] + switching_cost[i];
         } else if (prev_path_of_car == 1) {
            System.out.println("car currently on lan 1");
            cost_for_path1 = lane1_cost[i];
            cost_for_path2 = lane2_cost[i] + switching_cost[i];
         } else if (prev_path_of_car == 2) {
            System.out.println("car currently on lan 2");
            cost_for_path1 = lane1_cost[i] + switching_cost[i];
            cost_for_path2 = lane2_cost[i];
         } else if (prev_path_of_car == 3) {
            System.out.println("you can choose both lanes");
            cost_for_path1 = lane1_cost[i] + switching_cost[i];
            cost_for_path2 = lane2_cost[i] + switching_cost[i];
         } else {
            System.out.println("invalid ");
            break;
         }
         System.out.println("cost1 : " + cost_for_path1);
         System.out.println("cost2 : " + cost_for_path2);
         int min_final_cost = Math.min(cost_for_path1, cost_for_path2);
         System.out.println("min cost : " + min_final_cost);
         // UPDATING THE DP
         int chosen_path = -1;
         dp[i] = dp[i - 1] + min_final_cost;
         if (cost_for_path1 < cost_for_path2) {
            chosen_path = 1;
         } else if (cost_for_path2 < cost_for_path1) {
            chosen_path = 2;
         } else {
            chosen_path = 3;
         }
         // UPDATING THE PATH
         prev_path[i] = chosen_path;
         System.out.println(" i : " + i);
      }
      printDatas(lane1_cost, lane2_cost, switching_cost, dp, prev_path, no_of_stations);
      System.out.println("final min cost : " + dp[no_of_stations]);
   }

   public static void printDatas(int[] lane1, int[] lane2, int[] cost, int[] dp, int[] paths, int n) {
      System.out.println("lane 1 cost");
      System.out.println(Arrays.toString(lane1));
      System.out.println("lane 2 cost");
      System.out.println(Arrays.toString(lane2));
      System.out.println("cost ");
      System.out.println(Arrays.toString(cost));
      System.out.println("dp");
      System.out.println(Arrays.toString(dp));
      System.out.println("paths");
      System.out.println(Arrays.toString(paths));

   }
}