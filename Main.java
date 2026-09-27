
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      int[] arr = { 10, 8, 3, 4, 7, 6, 5, 2, 1, 9 };
      mergeSort(arr);
   }

   public static void mergeSort(int[] arr) {
      System.out.println("Before sorting : ");
      System.out.println(Arrays.toString(arr));
      System.out.println("After sorting : ");
      int[] out = spliter(arr);
      System.out.println(Arrays.toString(out));
   }

   public static int[] spliter(int[] arr) {
      if (arr.length < 2) {
         return arr;
      }
      int mid = arr.length / 2;
      int[] left = new int[mid];
      int[] rght = new int[arr.length - mid];
      int l = 0;
      int r = 0;
      for (int i = 0; i < arr.length; i++) {
         if (i < mid) {
            left[l] = arr[i];
            l++;
         } else {
            rght[r] = arr[i];
            r++;
         }
      }
      int[] lft = spliter(left);
      int[] rgh = spliter(rght);
      return merger(lft, rgh, arr, mid, arr.length - mid);
      // System.out.println(Arrays.toString(left));
      // System.out.println(Arrays.toString(rght));
   }

   public static int[] merger(int[] left, int[] right, int[] arr, int sz1, int sz2) {
      int l = 0;
      int r = 0;
      int i = 0;
      while (l < sz1 && r < sz2) {
         int curr1 = left[l];
         int curr2 = right[r];
         if (curr1 > curr2) {
            arr[i] = curr1;
            l++;
         } else {
            arr[i] = curr2;
            r++;
         }
         i++;
      }

      while (l < sz1) {
         int curr = left[i];
         arr[i] = left[l];
         l++;
         i++;
      }
      while (r < sz2) {
         int curr = right[r];
         arr[i] = right[r];
         i++;
         r++;
      }
      return arr;
   }
}