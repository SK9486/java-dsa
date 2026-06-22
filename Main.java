import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
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
int[][] grid = {
    {0,0,0},
    {1,1,0},
    {1,1,0}};
boolean[][] visited = new  boolean[grid.length][grid[0].length];
printGrid(grid);
printVis(visited);
System.out.println("BFS : "+BFS(new int[]{0,0},grid,visited));
printGrid(grid);
printVis(visited);
}
public static int BFS(int[] curr,int[][] grid,boolean[][] visited){
    Deque<ArrayList<Integer>> dq = new LinkedList<>();
    visited[curr[0]][curr[1]] = true;
    int c =0;
    dq.addLast(new ArrayList<>(Arrays.asList(curr[0],curr[1])));
    int size = dq.size();
    System.out.println("size : "+size);
    while(!dq.isEmpty()){
        for(int z=0;z<size;z++){
            ArrayList<Integer> poped = dq.removeFirst();
        int i = poped.get(0);
        int j = poped.get(1);
        //  System.out.println("i : "+i+" j :"+j);
        int[][] dirs = {{i,j},{i-1,j-1},{i-1,j},{i-1,j+1},{i+1,j+1},{i+1,j},{i+1,j-1},{i,j-1},{i,j+1}};
            for(int[] dir : dirs){
                int a = dir[0];
                int b = dir[1];
                if(a>=0 && b >= 0 && a<grid.length && b < grid[0].length){
                    if(a == grid[0].length -1 && b == grid.length -1){
                        System.out.println("founded ");
                        return c;
                    }else if(grid[a][b] == 0 && visited[a][b] == false){
                         System.out.println("[ "+a+" , "+b+" ] => ");
                        visited[a][b] = true;
                        dq.add(new ArrayList<>(Arrays.asList(a,b)));
                        c++;
                    }
                }

            }
        }
        size = dq.size();
        // System.out.println();
        // System.out.println("size : "+size);
    }
    return -1;
}

public static void printGrid(int[][] grid){
    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void printVis(boolean[][] grid){
    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}

// null 2 null 1 null
// null 1 null 2 null 