import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        sc.nextLine();
        while (m != 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            // System.out.println(n + " " + k + " " + str);
            System.out.println(ifOwns(str, n, k));
            m--;
        }

    }

    public static int ifOwns(String str, int n, int k) {
        int c = 0;
        for (int i = 0; i < n; i++) {
            // System.out.println("st : " + i + " ed : " + (i + k));
            String sub = str.substring(i, i + k);
            // System.out.println("sub : " + sub);
            if (!sub.contains("0")) {
                // System.out.println("noting own");
                c++;
            }
            i += k - 1;
        }
        return c;
    }
}