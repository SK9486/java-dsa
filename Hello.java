import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        int[] sts = { 1, 2, 5, 3, 8 };
        int[] eds = { 6, 7, 7, 9, 12 };
        int[] find = { 7, 8, 9 };
        int max = 12;
        int n = 5;
        int[] interval = new int[max + 2];
        for (int i = 0; i < n; i++) {
            int st = sts[i];
            int ed = eds[i];
            interval[st]++;
            interval[++ed]--;
        }
        int sum = 0;
        int[] prefix = new int[interval.length];
        for (int i = 1; i < interval.length; i++) {
            int curr = interval[i];
            sum += curr;
            prefix[i] = sum;
        }
        System.out.println(Arrays.toString(interval));
        System.out.println(Arrays.toString(prefix));
        for (int fd : find) {
            System.out.println(prefix[fd]);
        }
    }

}