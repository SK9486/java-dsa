import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      String s1 = "abdc";
      String s2 = "acd";
      int n = s1.length();
      int m = s2.length();
      int[][] mat = new int[n + 1][m + 1];
      for (int i = 0; i < n + 1; i++) {
         mat[i][m] = n - i;
         System.out.println(mat[i][m]);
      }
      for (int j = 0; j < m + 1; j++) {
         mat[n][j] = m - j;
         System.out.println(mat[n][j]);
      }
      for (int i = n - 1; i >= 0; i--) {
         for (int j = m - 1; j >= 0; j--) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(j);
            if (ch1 == ch2) {
               mat[i][j] = mat[i + 1][j + 1];
            } else {
               int ifReplace = mat[i + 1][j + 1];
               int ifDeleted = mat[i + 1][j];
               int ifInserted = mat[i][j + 1];
               mat[i][j] = 1 + Math.min(Math.min(ifReplace, ifDeleted), ifInserted);
            }
         }
         System.out.println();
      }
      for (int[] ar : mat) {
         System.out.println(Arrays.toString(ar));
      }

   }
}