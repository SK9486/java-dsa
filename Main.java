
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int M = sc.nextInt();
      int[] arr = new int[N + 2];
      // System.out.println(Arrays.toString(arr));
      for (int i = 0; i < M; i++) {
         int st = sc.nextInt();
         int ed = sc.nextInt();
         arr[st]++;
         arr[ed + 1]--;
      }
      // System.out.println(Arrays.toString(arr));
      int[] prefix = new int[N + 2];
      int sum = 0;
      int min = Integer.MAX_VALUE;
      for (int i = 1; i < arr.length; i++) {
         sum += arr[i];
         prefix[i] = sum;
         if (i >= 1 && i < prefix.length - 1) {
            if (prefix[i] < min) {
               min = prefix[i];
            }
         }
      }
      // System.out.println(Arrays.toString(prefix));
      System.out.println(min);
   }
}