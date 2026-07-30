import java.util.*;

class Main {
    public static void main(String[] args) {
        int[][] grid = {
            {2,1,1},
            {0,1,1},
            {1,0,1}
        };
        int c_max = Integer.MIN_VALUE;
        boolean[][] tracker = new boolean[grid.length][grid[0].length];
        ArrayList<ArrayList<Integer>> rootedPositons = findRottenOrange(grid, tracker);
        System.out.println("counter : "+bfs(grid, tracker,rootedPositons,0));


        for(int[] gr : grid){
            for(int g : gr ){
                System.out.print(g+" ");
            }
            System.out.println();
        }

    }
    public static int bfs(int[][] grid, boolean[][] tracker,ArrayList<ArrayList<Integer>> positions,int c) {
        System.out.println("BFS");
        Deque<ArrayList<Integer>> dq = new LinkedList<>();
        for(ArrayList<Integer> arr : positions ){
            dq.addLast(arr);
        }
        int size = dq.size();
        System.out.println("size : "+size);
        while(!dq.isEmpty()){
            // System.out.println("l "+l+" r : "+r);
            for(int k=0;k<size;k++){
                ArrayList<Integer> pos = dq.removeFirst();
                int l=pos.get(0);
                int r=pos.get(1);
               int[][] dirs = {
                    { l - 1, r },
                    { l + 1, r },
                    { l, r - 1 },
                    { l, r + 1 }
            };
            for(int[] dir : dirs){
                int a = dir[0];
                int b = dir[1];
                if(a>=0 && a <grid.length && b >=0 && b <grid[0].length && grid[a][b] == 1 && tracker[a][b] == false){
                    System.out.println("["+a+" "+b+"]");
                    tracker[a][b] = true;
                    grid[a][b] = 2;
                    dq.add(new ArrayList<>(Arrays.asList(a,b)));
                    // bfs(grid, tracker, c+counter, a,b);
                }
            }
            }
            size = dq.size();
            if(size > 0){
                c++;
            }
            System.out.println("size : "+size);
            System.out.println("C : "+c);
        }
        return c;

    }
    public static ArrayList<ArrayList<Integer>> findRottenOrange(int[][] grid,boolean[][] tracker){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] == 2 && tracker[i][j] == false){
                    tracker[i][j] = true;
                    res.add(new ArrayList<>(Arrays.asList(i,j)));
                }
            }
        }
        return res;
    }

    public static boolean checkIfFreshOrangeExists(int[][] grid){
        for(int[] gr: grid){
            for(int g : gr){
                if(g == 1){
                    return true;
                }
            }
        }
        return false;
    }
}