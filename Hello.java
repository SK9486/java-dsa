class Solution {
    public int largestIsland(int[][] islands) {
        boolean[][] visited = new boolean[islands.length][islands[0].length];
        int count = 0;
        for (int i = 0; i < islands.length; i++) {
            for (int j = 0; j < islands[i].length; j++) {
                if (islands[i][j] == 1 && visited[i][j] == false) {
                    count++;
                    System.out.println("counter : " + count + " i : " + i + " j : " + j);
                    dfs(islands, visited, count, i, j);
                }
            }
        }
        printTracer(visited);
        printIsland(islands);

        System.out.println("final counter : " + count);

        int[] islandCount = new int[count + 1];
        islandCounter(islands, islandCount);

        int ans = zeroToogler(islands, islandCount);
        System.out.println("ans : " + ans);
        return ans;
    }

    public static int zeroToogler(int[][] islands, int[] islandCount) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < islands.length; i++) {
            for (int j = 0; j < islands[i].length; j++) {
                Set<Integer> set = new HashSet();
                int curr = islands[i][j];
                if (curr == 0) {
                    int[][] dirs = { {i,j},{ i - 1, j }, { i, j + 1 }, { i, j - 1 }, { i + 1, j } };
                    for (int[] dir : dirs) {
                        int a = dir[0];
                        int b = dir[1];
                        if (a >= 0 && a < islands.length && b >= 0 && b < islands[a].length && islands[a][b] != 0) {
                            set.add(islands[a][b]);
                        }
                    }
                    System.out.println("set : " + set.toString());
                    int sum = 0;
                    for (int a : set) {
                        sum += islandCount[a];
                    }
                    System.out.println("sum : " + sum);
                    if (sum > max) {
                        max = sum;
                    }
                }

            }
        }
        return max;
    }

    public static void islandCounter(int[][] islands, int[] islandCounter) {
        for (int i = 0; i < islands.length; i++) {
            for (int j = 0; j < islands[i].length; j++) {
                int curr = islands[i][j];
                System.out.println("curr : " + curr);
                islandCounter[curr] = islandCounter[curr] + 1;
            }
        }
        for (int i = 0; i < islandCounter.length; i++) {
            System.out.println(i + " : " + islandCounter[i]);
        }
    }

    public static void dfs(int[][] island, boolean[][] visited, int counter, int i, int j) {
        int[][] dirs = {
                { i, j }, { i - 1, j }, { i, j + 1 }, { i, j - 1 }, { i + 1, j }
        };
        for (int[] dir : dirs) {
            int a = dir[0];
            int b = dir[1];
            if (a >= 0 && a < island.length && b >= 0 && b < island[a].length && island[a][b] != 0
                    && visited[a][b] == false) {
                visited[a][b] = true;
                island[a][b] = counter;
                dfs(island, visited, counter, a, b);
            }
        }

    }

    public static void printTracer(boolean[][] visited) {
        for (boolean[] bo : visited) {
            for (boolean b : bo) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }

    public static void printIsland(int[][] islands) {
        for (int[] island : islands) {
            for (int a : island) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}