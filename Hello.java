import java.util.Arrays;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String base = sc.nextLine();
        int[] base_counter = counter(base);
        // System.out.println("base_counter : ");
        // System.out.println(Arrays.toString(base_counter));
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            int[] char_count = counter(str);
            // System.out.println("charc counter : ");
            // System.out.println(Arrays.toString(char_count));
            if (!compareCounters(base_counter, char_count)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");

    }

    public static int[] counter(String str) {
        int[] chars_count = new int[27];
        for (char ch : str.toCharArray()) {
            int ascii = (ch - 'a') + 1;
            chars_count[ascii]++;
            // System.out.println("ascii : " + ascii);
        }
        return chars_count;
    }

    public static boolean compareCounters(int[] base, int[] count) {
        for (int i = 1; i < 27; i++) {
            if (count[i] != 0) {
                if (count[i] <= base[i] && base[i] != 0) {
                    // System.out.println("VALID");
                } else {
                    // System.out.println("INVALID at : " + i);
                    // System.out.println("left : " + count[i] + " right: " + base);
                    return false;
                }
            }
        }
        return true;
    }
}

// telephonegrammary
// 3
// telegram
// "memory"
// elegant