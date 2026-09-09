
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int q = sc.nextInt();
      int[] arr = new int[n];
      HashMap<Integer, Integer> map1 = new HashMap<>();
      HashMap<Integer, Integer> map2 = new HashMap<>();
      for (int i = 0; i < n; i++) {
         arr[i] = sc.nextInt();
         map1.put(arr[i], i + 1);
      }
      int nxt = arr.length + 1;
      while (q != 0) {
         int ele = sc.nextInt();
         map1.put(ele, nxt);
         nxt++;
         // System.out.println("ele : " + ele);
         q--;
      }
      for (int key : map1.keySet()) {
         int val = map1.get(key);
         map2.put(val, key);
      }
      Set<Integer> keys = new TreeSet<>(map2.keySet());
      for (int a : keys) {
         System.out.print(map2.get(a) + " ");
      }

   }
}