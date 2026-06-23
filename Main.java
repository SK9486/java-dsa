import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int n) {
        this.val = n;
        left = null;
        right = null;
    }
}

public static void main(String[] args) {
    // int[][] grid = {
    //     {0,0,0},
    //     {1,1,0},
    //     {1,1,0}
    // };
    // int[][] grid = {
    // {0,1},{1,0}};
    int[][] grid = {
    {0, 0, 1, 0},
    {1, 0, 1, 0},
    {1, 0, 0, 0},
    {0, 0, 1, 0}
};
    boolean[][] visited = new boolean[grid.length][grid[0].length];
    System.out.println("BFS : "+BFS(grid, visited));


}
public static int BFS( int[][] grid,boolean[][] visited){
    int[] c ={0};
    Deque<ArrayList<Integer>> dq = new LinkedList<>();
    dq.add(new ArrayList<>(Arrays.asList(0,0)));
    visited[0][0] = true;
    System.out.println("c++");
    c[0]++;
    int size = dq.size();
    while (!dq.isEmpty()) {
        for(int z=0;z<size;z++){
            ArrayList<Integer> pop = dq.removeFirst();
            int i = pop.get(0);
            int j = pop.get(1);
if (Checker(i-1, j-1, grid, visited, dq,c)){
                    return c[0];
                }
if (Checker(i-1, j,   grid, visited, dq,c)){
    return c[0];
}
if (Checker(i-1, j+1, grid, visited, dq,c)){
    return c[0];
}
if (Checker(i,   j-1, grid, visited, dq,c)){
    return c[0];
}
if (Checker(i,   j+1, grid, visited, dq,c)){
    return c[0];
}
if (Checker(i+1, j-1, grid, visited, dq,c)){
    return c[0];
}
if (Checker(i+1, j,   grid, visited, dq,c)){
    return c[0];
}
if (Checker(i+1, j+1, grid, visited, dq,c)){
    return c[0];
}
        }
        System.out.println("************");
        size = dq.size();
        c[0]++;
    }

    return -1;
}
public static boolean Checker(int a,int b,int[][] grid , boolean[][] visited,Deque<ArrayList<Integer>> dq,int[] c){
    if(a>=0 && b>=0 && a < grid.length && b<grid[0].length){
                    System.out.print("valid : ");
                    if(grid[a][b] == 0 && visited[a][b] == false){
                        System.out.print( " best ");
                        dq.add(new ArrayList<>(Arrays.asList(a,b)));
                        visited[a][b] = true;
                        if(a == grid.length-1 && b == grid[0].length -1){
                            c[0]++;
                            System.out.println("FOUNDED ....");
                            return true;
                        }
                    }
                }
                return false;
}
}

// null 2 null 1 null
// null 1 null 2 null 
/*
public static int BFS( List<List<Integer>>  grid,boolean[][] visited){
    Deque<Integer> dq = new LinkedList<>();
    HashSet<Integer> set = new HashSet<>();
    dq.add(0);
    set.add(0);
    int level = 0;
    int size = dq.size();
    while(!dq.isEmpty()){
        for(int i=0;i<size;i++){
            int poped = dq.removeFirst();
            System.out.println(level+" : "+poped);
            System.out.println();
            for(int a : grid.get(poped)){
                if(!set.contains(a)){
                    set.add(a);
                    dq.add(a);
                }
            }
        }
        size = dq.size();
        level++;
    }
    return -1;
}
 */


