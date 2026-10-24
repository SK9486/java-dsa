
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      TreeSet<Integer> tree = new TreeSet<>();
      for (int i = 0; i < N; i++) {
         tree.add(sc.nextInt());
      }
      System.out.println(tree.size());
      for (int a : tree) {
         System.out.print(a + " ");
      }

   }
}