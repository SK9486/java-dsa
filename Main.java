import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      int[][] matx = {
            { 11, 12, 13 },
            { 21, 22, 23 },
            { 31, 32, 33 }
      };
      int n = matx.length;
      for (int a = 0; a < n; a++) {
         int i = a;
         int j = a;
         while (i >= 0 || i < n) {
            System.out.println(i + " " + j + " : " + matx[i][j]);
            i--;
         }
         i = a;
         while (j >= 0 || j < n) {
            System.out.println(i + " " + j + " : " + matx[i][j]);
            j--;
         }
      }

   }
}