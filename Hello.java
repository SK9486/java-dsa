import java.util.Arrays;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean isDetected = false;
        int[] arr = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            arr[i] = sc.nextInt();
        }
        // System.out.println("arr : ");
        // System.out.println(Arrays.toString(arr));
        int possible_range = n - k + 2;
        for (int i = 1; i <= possible_range && i + k < n + 1; i++) {
            // System.out.println("i : " + i);
            boolean beforePartSorted = checkIfSorted(arr, 1, i - 1);
            // int[] beforePArt = Arrays.copyOfRange(arr, 1, i);
            // System.out.println("BeforePArt : ");
            // System.out.println(Arrays.toString(beforePArt));
            if (!beforePartSorted) {
                // System.out.println("No");
                isDetected = true;
                break;
            }
            // int[] afterPart = Arrays.copyOfRange(arr, i + k, arr.length);
            // System.out.println("AfterPart : ");
            // System.out.println(Arrays.toString(afterPart));
            boolean afterPartSorted = checkIfSorted(arr, i + k, arr.length - 1);
            if (!afterPartSorted) {
                // System.out.println("No");
                isDetected = true;
                break;
            }
            int[] ans = findMinAndMax(arr, i, i + k - 1);
            int max = ans[0];
            int min = ans[1];
            int beforePartLast = arr[i - 1];
            int afterPartFirst = arr[i + k];
            if (beforePartLast > min || afterPartFirst < max) {
                isDetected = true;
                break;
            }
        }
        if (isDetected) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }

    }

    public static int[] findMinAndMax(int[] arr, int i, int j) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int k = i; k <= j; k++) {
            int ele = arr[k];
            max = Math.max(ele, max);
            min = Math.min(ele, min);
        }
        return new int[] { max, min };
    }

    public static boolean checkIfSorted(int[] arr, int st, int ed) {
        int i = st;
        int j = i + 1;
        while (j <= ed && j < arr.length) {
            int ele1 = arr[i];
            int ele2 = arr[j];
            if (ele2 < ele1) {
                return false;
            }
            i++;
            j++;
        }
        return true;
    }
}