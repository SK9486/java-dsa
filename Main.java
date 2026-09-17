
import java.util.Arrays;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      int[] arrs = { 4, 5, 6, 7, 0, 1, 2 };
      int left = 0;
      int right = arrs.length - 1;
      int mid = -1;
      while (true) {
         mid = left + ((right - left) / 2);
         int mid_ele = arrs[mid];
         int right_ele = arrs[right];
         int left_ele = arrs[left];
         System.out.println(left_ele + " " + mid_ele + " " + right_ele);
         // inc then dec
         if (left_ele < mid_ele && mid_ele > right_ele) {
            System.out.println("Right side");
            left = mid;
         } else {
            System.out.println("Left side");
            right = mid;
         }
         if (right - left == 1) {
            System.out.println("min from two ele: " + right_ele + " " + left_ele);
            break;
         }
         if (right - left == 2) {
            System.out.println("min from three ele: " + right_ele + " " + left_ele + " " + mid_ele);
            break;
         }
      }
   }

   public static void binarySearch(int[] arrs, int tar) {
      int left = 0;
      int right = arrs.length - 1;
      int mid = -1;
      while (left <= right) {
         mid = left + ((right - left) / 2);
         int mid_ele = arrs[mid];
         if (mid_ele == tar) {
            System.out.println("founded : " + mid);
            return;
         } else if (mid_ele > tar) {
            right = mid - 1;
         } else {
            left = mid + 1;
         }
      }

   }

   public static int BSLowerBound(int[] arrs, int tar) {
      int left = 0;
      int right = arrs.length - 1;
      int mid = -1;
      int prev_idx = -1;
      while (left <= right) {
         mid = left + ((right - left) / 2);
         int mid_ele = arrs[mid];
         if (mid_ele >= tar) {
            prev_idx = mid;
            right = mid - 1;
         } else {
            left = mid + 1;
         }
      }
      // System.out.println("prev_idx : " + prev_idx);
      return prev_idx;

   }

   public static int BSUpperBound(int[] arrs, int tar) {
      int left = 0;
      int right = arrs.length - 1;
      int mid = -1;
      int prev_idx = -1;
      while (left <= right) {
         mid = left + ((right - left) / 2);
         int mid_ele = arrs[mid];
         if (mid_ele > tar) {
            prev_idx = mid;
            right = mid - 1;
         } else {
            left = mid + 1;
         }
      }
      // System.out.println("prev_idx : " + prev_idx);
      return prev_idx;

   }
}