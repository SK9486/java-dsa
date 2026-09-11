
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        while (n != 0) {
            int curr = sc.nextInt();
            map.put(curr, map.getOrDefault(curr, 0) + 1);
            n--;
        }
        int c = 0;
        for (Integer key : map.keySet()) {
            // System.out.println(key + " " + map.get(key));
            if (map.get(key) % 2 != 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}