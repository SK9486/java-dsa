import java.util.*;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      str.trim();
      int c = 0;
      for (char ch : str.toCharArray()) {
         if (ch == 'o') {
            c++;
         }
      }
      if (c % 2 == 0) {
         System.out.println("even");
      } else {
         System.out.println("odd");
      }
   }
}