import java.util.ArrayList;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        int[] sts = { 1, 2, 3, 5, 8 };
        int[] eds = { 6, 7, 7, 9, 12 };
        int st = findSt(sts, 9);
        int ed = findEd(eds, 9);
        System.out.println("st : " + st);
        System.out.println("ed : " + ed);
        int ans = st - ed;
        System.out.println("ans : " + ans);
    }

    public static int findSt(int[] start, int st) {
        int i = 0;
        int j = start.length;
        while (i < j) {
            int mid = i + ((j - i) / 2);
            if (start[mid] <= st) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        return i;
    }

    public static int findEd(int[] start, int st) {
        int i = 0;
        int j = start.length;
        while (i < j) {
            int mid = i + ((j - i) / 2);
            if (start[mid] < st) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        return i;
    }
}