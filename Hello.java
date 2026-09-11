
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n != 0) {
            int m = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            int ans = prefixSum(str);
            System.out.println(ans);
            n--;
        }
    }

    public static int prefixSum(String str) {
        if (str.charAt(0) == '0' || str.contains("00")) {
            return -1;
        }
        if (str.contains("+-") || str.contains("-+")) {
            if (str.contains("+--+") || str.contains("-++-")) {
                return 3;
            } else {
                return 2;
            }
        } else {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (i % 2 == 0 && ch == '0') {
                    return 2;
                }
            }
            return 1;
        }
    }

}