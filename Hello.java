import java.util.*;

public class Hello {
    public static void main(String[] args) {
        String str = "happy";
        int n = str.length();
        if (n % 2 != 0) {
            str += "*";
        }
        int curr = 0;
        int inc = 2;
        System.out.println(str.charAt(0));
        while (curr < n - 1) {
            curr += inc;
            inc++;
            int prt = curr;
            for (int i = 0; i < inc - 1; i++) {
                System.out.print(str.charAt(prt));
                prt--;
            }
            System.out.println();
        }

    }
}