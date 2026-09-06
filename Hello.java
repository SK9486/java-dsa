import java.util.ArrayList;
import java.util.Arrays;

class Hello {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 16, 8 };
        Arrays.sort(nums);
        int n = nums.length;
        ArrayList<ArrayList<Integer>> dp = new ArrayList<>();
        for (int a : nums) {
            dp.add(new ArrayList<>(Arrays.asList(a)));
        }
        printDp(dp);
        System.out.println();
        for (int i = 1; i < n; i++) {
            int curr = nums[i];
            ArrayList<Integer> prsereved_prev = dp.get(i);
            ArrayList<ArrayList<Integer>> prev_dp = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                int prev = nums[j];
                if (prev % curr == 0 || curr % prev == 0) {
                    ArrayList<Integer> prev_arr = dp.get(j);
                    ArrayList<Integer> copy = new ArrayList<>(prev_arr);
                    copy.add(curr);
                    prev_dp.add(copy);
                }
            }
            ArrayList<Integer> longest = findLongest(prev_dp);
            System.out.println("longest : ");
            System.out.println(longest);
            if (longest.isEmpty()) {
                dp.set(i, prsereved_prev);
            } else {
                dp.set(i, longest);
            }
            printDp(prev_dp);
        }
        printDp(dp);

        ArrayList<Integer> final_ans = findLongest(dp);
        System.out.println("final ans");
        System.out.println(final_ans);
    }

    public static void printDp(ArrayList<ArrayList<Integer>> dp) {
        System.out.println("DP : ");
        for (ArrayList<Integer> ar : dp) {
            System.out.println(ar);
        }
    }

    public static ArrayList<Integer> findLongest(ArrayList<ArrayList<Integer>> prev_dp) {
        ArrayList<Integer> longest = new ArrayList<>();
        for (ArrayList<Integer> ar : prev_dp) {
            int len1 = longest.size();
            int len2 = ar.size();
            if (len2 > len1) {
                longest = ar;
            }
        }
        return longest;
    }
}
