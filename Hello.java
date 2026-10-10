import java.util.ArrayList;

public class Hello {
    public static void main(String[] args) {
        // String input = "|**||***|***|****|";
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        // int st = sc.nextInt();
        // int ed = sc.nextInt();
        // query(st, ed, input);
        // }
        String pattern = "**|**|***|";
        ArrayList<Integer> walls = new ArrayList<>();
        ArrayList<Integer> stares = new ArrayList<>();
        ArrayList<Integer> prefixSum = new ArrayList<>();

        for (int i = 0; i < pattern.length(); i++) {
            char curr = pattern.charAt(i);
            if (curr == '|') {
                walls.add(i);
            }
        }
        for (int i = 0; i < walls.size() - 1; i++) {
            int curr = walls.get(i);
            int nxt = walls.get(i + 1);
            stares.add((nxt - curr) - 1);
        }
        int sum = 0;
        prefixSum.add(sum);
        for (int i = 0; i < stares.size(); i++) {
            int curr = stares.get(i);
            sum += curr;
            prefixSum.add(sum);
        }
        System.out.println("walls : ");
        System.out.println(walls);
        System.out.println("stars : ");
        System.out.println(stares);
        System.out.println("prefixSUm : ");
        System.out.println(prefixSum);

        int left = findLeftMostWall(walls, 0);
        int right = findRightMostWall(walls, 4);
        if (left < right) {
            System.out.println(prefixSum.get(right) - prefixSum.get(left));
        } else {
            System.out.println(0);
        }
    }

    public static int findLeftMostWall(ArrayList<Integer> walls, int ele) {
        int i = 0;
        int j = walls.size();

        while (i < j) {
            int mid_idx = i + (j - i) / 2;
            int mid = walls.get(mid_idx);

            if (mid >= ele) {
                j = mid_idx;
            } else {
                i = mid_idx + 1;
            }
        }
        System.out.println("i : " + i);
        return i;
    }

    public static int findRightMostWall(ArrayList<Integer> walls, int ele) {
        int i = 0;
        int j = walls.size();

        while (i < j) {
            int mid_idx = i + (j - i) / 2;
            int mid = walls.get(mid_idx);

            if (mid > ele) {
                j = mid_idx;
            } else {
                i = mid_idx + 1;
            }
        }
        System.out.println("i : " + (i - 1));
        return i - 1;
    }

    // public static void query(int st, int ed, String str) {
    // st--;
    // ed--;
    // ArrayList<Integer> wall_indexs = new ArrayList<>();
    // for (int i = st; i <= ed; i++) {
    // System.out.print(str.charAt(i));
    // if (str.charAt(i) == '|') {walls
    // wall_indexs.add(i);
    // }
    // }
    // int sum = 0;
    // if (wall_indexs.size() <= 1) {
    // System.out.println(0);
    // } else {
    // for (int i = 0; i < wall_indexs.size() - 1; i++) {
    // int curr = wall_indexs.get(i);
    // int nxt = wall_indexs.get(i + 1);
    // sum += ((nxt - curr) - 1);
    // }
    // System.out.println(sum);
    // }
    // System.out.println();
    // }
}