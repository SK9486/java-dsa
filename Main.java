
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int S = sc.nextInt();
      int[] arr = new int[N];
      int curr;
      int prev;
      for (int i = 0; i < N; i++) {
         arr[i] = sc.nextInt();
         if (i == 0) {
            prev = 0;
         } else {
            prev = arr[i - 1];
         }
         curr = arr[i];
         if ((curr - prev) >= (S + 0.5)) {
            System.out.println("No");
            return;
         }
      }
      System.out.println("Yes");
   }
}