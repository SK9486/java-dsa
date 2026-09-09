import java.util.Arrays;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      String inp = "q^z^zthere^z^y^yyou";
      StringBuilder sb = new StringBuilder();
      StringBuilder rem = new StringBuilder();
      for (int i = 0; i < inp.length(); i++) {
         char ch = inp.charAt(i);
         if (ch == '^') {
            i++;
            char nxt = inp.charAt(i);
            if (nxt == 'z' && sb.toString().length() > 0) {
               System.out.println("undo");
               int n = sb.toString().length();
               char last = sb.toString().charAt(n - 1);
               rem.append(last);
               sb.deleteCharAt(n - 1);

            }
            if (nxt == 'y' && rem.toString().length() > 0) {
               System.out.println("redo");
               int n = rem.toString().length();
               char last = rem.toString().charAt(n - 1);
               sb.append(last);
               rem.deleteCharAt(n - 1);

            }
         } else {
            System.out.println(ch);
            sb.append(ch);
         }
         System.out.println("sb : " + sb.toString());
      }
      System.out.println(sb.toString());
   }
}