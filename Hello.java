import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        for (int t = 1; t <= testCases; t++) {
            System.out.println("Case " + t + ":");

            int n = sc.nextInt();
            int m = sc.nextInt();

            int[] arr = new int[n];

            for (int k = 0; k < n; k++) {
                arr[k] = sc.nextInt();
            }
            for (int i = 0; i < m; i++) {
                int q = sc.nextInt();

                if (q == 1) {
                    int old = sc.nextInt();
                    int ele = sc.nextInt();

                    for (int j = 0; j < arr.length; j++) {
                        if (arr[j] == old) {
                            arr[j] = ele;
                        }
                    }
                } else {
                    int idx = sc.nextInt();
                    System.out.println(arr[idx - 1]);
                }
            }
        }
    }
}