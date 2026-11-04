import java.util.*;

public class Main {
   public static void main(String[] args) {
      String str = "PROGRAM";
      int len = str.length();
      int n = (len / 2) + 1;
      char[][] matx = new char[n][n];
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            if (j == 0) {
               matx[i][j] = str.charAt(i);
            } else if (i + j == n - 1) {
               matx[i][j] = str.charAt((len - 1) - i);
            } else if (i + j >= n) {
               matx[i][j] = ' ';
            } else {
               matx[i][j] = '*';
            }
         }
      }
      for (int i = 0; i < n; i++) {
         for (int j = 0; j < n; j++) {
            System.out.print(matx[i][j] + " ");
         }
         System.out.println();
      }
      for (int i = n - 2; i >= 0; i--) {
         for (int j = 0; j < n; j++) {
            System.out.print(matx[i][j] + " ");
         }
         System.out.println();
      }
   }
}