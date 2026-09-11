
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        // int n = 3;
        // String str2 = "aabc";
        // String str1 = "daacc";
        // String str3 = "acacac";

        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        while (n != 0) {
            String str = sc.nextLine();
            // System.out.println(str);
            arr.add(str);
            n--;
        }
        inputProccer(arr);

    }

    public static void inputProccer(ArrayList<String> arr) {
        // ArrayList<String> arr = new ArrayList<>(Arrays.asList(str1, str2, str3));
        // FINDING THE MIN LEN STR
        String minStr = findMinStr(arr);
        System.out.println("min Str : " + minStr);
        // REMENBER TO REMIVE THE MIN STR FROM ARR

        int[] base_frq_arr = frequencyFinder(minStr);

        for (String str : arr) {
            if (!str.equals(minStr)) {
                frequncencyChecker(base_frq_arr, str);
                // break;
            }
        }
        System.out.println("base_freq : ");
        System.out.println(Arrays.toString(base_frq_arr));
        String common_seq = convertArrToAlpha(base_frq_arr);
        System.out.println(common_seq);
    }

    public static String findMinStr(ArrayList<String> arr) {
        int min_len = arr.get(0).length();
        String min_str = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            String curr = arr.get(i);
            int curr_len = curr.length();
            if (curr_len < min_len) {
                min_len = curr_len;
                min_str = curr;
            }
        }
        return min_str;
    }

    public static int[] frequencyFinder(String str) {
        int[] freq = new int[27];
        for (char ch : str.toCharArray()) {
            int ascii = (int) ch;
            // System.out.println("ascii : " + ascii);
            int idx = ascii - 96;
            // System.out.println("idx : " + idx);
            freq[idx]++;
        }
        System.out.println(Arrays.toString(freq));
        return freq;
    }

    public static void frequncencyChecker(int[] base, String str) {
        // System.out.println("str : " + str);
        int[] freq = new int[27];
        for (char ch : str.toCharArray()) {
            int ascii = (int) ch;
            // System.out.println("ascii : " + ascii);
            int idx = ascii - 96;
            // System.out.println("idx : " + idx);
            if (base[idx] != 0) {
                freq[idx]++;
            }
        }
        System.out.println("base : ");
        System.out.println(Arrays.toString(base));
        System.out.println("freq : ");
        System.out.println(Arrays.toString(freq));
        compareFrequncy(base, freq);
    }

    public static void compareFrequncy(int[] base, int[] frq) {
        for (int i = 0; i < frq.length; i++) {
            int base_curr = base[i];
            int frq_curr = frq[i];
            if (base_curr != 0) {
                // System.out.println("frq_curr : " + frq_curr);
                if (frq_curr < base_curr) {
                    // System.out.println(frq_curr + " < " + base_curr);
                    base[i] = frq_curr;
                }
            }

        }
    }

    public static String convertArrToAlpha(int[] base) {
        String str = "";
        for (int i = 0; i < base.length; i++) {
            int curr = base[i];
            if (curr != 0) {
                char ch = (char) (i + 96);
                // System.out.println("ch : " + ch);
                for (int j = curr; j > 0; j--) {
                    str += ch;
                }
            }
        }
        return str;
    }

}