import java.util.*;

public class Main {
   public static void main(String[] args) {
      int N = 4;
      int M = 1;
      for (int i = 1; i <= N; i++) {
         if (i % 2 != 0) {
            // even forward
            for (int j = 1; j <= i; j++) {
               System.out.print(M + " ");
               M++;
            }
            System.out.println();
         } else {
            // odd backward
            int X = M + i;
            for (int j = 1; j <= i; j++) {
               X--;
               System.out.print(X + " ");
               M++;
            }
            System.out.println();
         }
      }
   }
}