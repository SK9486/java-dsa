import java.util.*;

public class Hello {
    public static void main(String[] args) {
        String str = "happyne";
        int n = str.length();
        System.out.println(str.charAt(0));
        int st = 1;
        int i = 1;
        int ed = st + i;
        while (st < n) {
            // System.out.println(st + " " + ed);
            String sub = "";
            for (int j = ed; j >= st; j--) {
                if (j >= n) {
                    sub += "*";
                } else {
                    sub += str.charAt(j);
                }
            }
            System.out.println(sub);
            st = ed + 1;
            i++;
            ed = st + i;
        }
    }
}