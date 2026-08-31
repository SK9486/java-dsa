import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      String text1 = "bl";
      String text2 = "yby";
      // String text1 = "abcde";
      // String text2 = "ace";
      text1 = "abc";
      text2 = "abc";
      int n = text2.length() + 1;
      int m = text1.length() + 1;
      int[] row = new int[m];
      for (int i = 0; i < n; i++) {
         int[] old = row.clone();
         for (int j = 0; j < m; j++) {
            if (i != 0 && j != 0) {
               char ch1 = text2.charAt(i - 1);
               char ch2 = text1.charAt(j - 1);
               // System.out.println("j : "+ch2+" i : "+ch1);
               if (ch1 == ch2) {
                  // System.out.println("MATCHES : "+ch1+" "+ch2);
                  // System.out.println("matches old prev value + 1");
                  row[j] = old[j - 1] + 1;
                  // System.out.println(Arrays.toString(old));
                  // System.out.println(Arrays.toString(row));
               } else {
                  // System.out.println("max of prev and old value");
                  System.out.println("before");
                  System.out.println(Arrays.toString(old));
                  System.out.println(Arrays.toString(row));
                  System.out.println("procced");
                  row[j] = Math.max(row[j - 1], old[j]);
                  // System.out.println("j : " + j);
                  // System.out.println("row[j-1] : " + row[j - 1]);
                  // System.out.println("old[j] : " + old[j]);
                  System.out.println("after");
                  System.out.println(Arrays.toString(old));
                  System.out.println(Arrays.toString(row));
                  System.out.println();

               }
            }
         }
         System.out.println(Arrays.toString(row));
      }
   }
}