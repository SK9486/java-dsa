import java.util.Arrays;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      // int[] arr = { 48, 541, 23, 68, 13, 41, 6 };
      // int n = 7;
      // int m = 3;
      int[] arr = { 1, -3, -44, 2, 77 };
      int n = 5;
      int m = 2;
      int st = 0;
      int ed = st + (m - 1);
      while (ed < n) {
         selectionSort(st, ed + 1, arr);
         System.out.println("st : " + st + " ed : " + ed);
         System.out.println(Arrays.toString(arr));
         st = ed;
         st++;
         ed += (m);
      }

   }

   public static void selectionSort(int s, int e, int[] arr) {
      for (int i = s; i < e; i++) {
         int temp = arr[i];
         int maxIdx = -1;
         int max = Integer.MIN_VALUE;
         for (int j = i; j < e; j++) {
            if (arr[j] > max) {
               max = arr[j];
               maxIdx = j;
            }
         }
         arr[i] = max;
         arr[maxIdx] = temp;
         System.out.println("i : " + i + " min : " + max);
      }
   }

}