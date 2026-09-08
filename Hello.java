
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.nextLine();
        while (x != 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            // System.out.println("n : " + n + " " + str);
            processInputs(str);
            x--;
        }
    }

    public static void processInputs(String str) {
        String[] inps = str.split(" ");
        // System.out.println(Arrays.toString(inps));
        int n = inps.length;
        int first = -1;
        for (int i = 0; i < n; i++) {
            String ch = inps[i];
            if (ch.equals("-1") || ch.equals("1")) {
                first = i;
                break;
            }
        }
        int last = -1;
        for (int i = n - 1; i >= 0; i--) {
            String ch = inps[i];
            if (ch.equals("-1") || ch.equals("1")) {
                last = i;
                break;
            }
        }
        // System.out.println("first : " + first);
        // System.out.println("last : " + last);
        if (first != -1 && last != -1) {
            for (int i = 0; i < n; i++) {
                String st = inps[i];
                if (i >= first && i <= last) {
                    if (i == first || i == last) {
                        if (st.equals("-1")) {
                            inps[i] = "1";
                        }
                    } else {
                        if (st.equals("-1")) {
                            inps[i] = "0";
                        }
                    }
                }
            }
        }
        String res = "";
        for (String st : inps) {
            res += (st + " ");
        }
        System.out.println(res);
    }

}