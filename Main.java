import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int[][] matx = new int[5][5];
      for (int i = 0; i < 5; i++) {
         String row = sc.nextLine();
         row.trim();
         for (int j = 0; j < 5; j++) {
            matx[i][j] = row.charAt(j) == 'o' ? 1 : 0;
         }
      }
      int col_min = Integer.MAX_VALUE;
      int row_min = Integer.MAX_VALUE;
      int d1C = 0;
      int d2C = 0;
      for (int i = 0; i < 5; i++) {
         int rC = 0;
         int cC = 0;
         for (int j = 0; j < 5; j++) {
            int row = matx[i][j];
            int col = matx[j][i];
            if (row == 0)
               rC++;
            if (col == 0)
               cC++;
            if (i == j && matx[i][j] == 0)
               d1C++;
            if (i + j == 4 && matx[i][j] == 0)
               d2C++;
         }
         col_min = Math.min(cC, col_min);
         row_min = Math.min(rC, row_min);
      }

      // printArr(matx);
      // System.out.println("col : " + col_min);
      // System.out.println("row : " + row_min);
      // System.out.println("dig1 : " + d1C);
      // System.out.println("dig2 : " + d2C);
      System.out.println(Math.min(Math.min(d1C, d2C), Math.min(col_min, row_min)));
   }

   public static void printArr(int[][] matx) {
      for (int[] ma : matx) {
         System.out.println(Arrays.toString(ma));
      }
   }
}