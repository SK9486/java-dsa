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
    char[][] grid = {
        {'1','1','1','1','0'},
  {'1','1','0','1','0'},
  {'1','1','0','0','0'},
  {'0','0','0','0','0'}
    };
//     char[][] grid = {
//     {'1','1','0','0','0'},
//     {'1','1','0','0','0'},
//     {'0','0','1','0','0'},
//     {'0','0','0','1','1'}
// };
System.out.println("grid : "+grid.length);
System.out.println("grid[0] : "+grid[0].length);
    System.out.println("no fo island : "+numIsLand(grid));
}
public static int numIsLand(char[][] grid){
    boolean[][] visited = new boolean[grid.length][grid[0].length];
    int c =0;
    System.out.println("before : ");
    printGrid(grid);
    printVis(visited);
    int[] ones = fintOne(grid, visited);
    while(ones[0] != -1){
    BFS(grid, visited,ones);
    ones = fintOne(grid, visited);
    c++;
    }
    System.out.println("After : ");
    printGrid(grid);
    printVis(visited);
    return c;

}
public static void BFS(char[][] grid,boolean[][] visited,int[] ones){
    Deque<List<Integer>> dq = new LinkedList<>();
    System.out.println("ones : "+ones[0]+" "+ones[1]);
    dq.addLast(new ArrayList<>(Arrays.asList(ones[0],ones[1])));
    visited[ones[0]][ones[1]] = true;
    while(!dq.isEmpty()){
        List<Integer> curr = dq.removeFirst();
        int i = curr.get(0);
        int j = curr.get(1);
        visited[i][j] = true;
        int[][] dirs = {
            {i-1,j},
            {i+1,j},
            {i,j-1},
            {i,j+1}
        };
        for(int[] dir:dirs){
            int a = dir[0];
            int b = dir[1];
            System.out.println("a : "+a+" b : "+b);
            if(a >= 0  && a<grid.length && b >=0 && b<grid[0].length && visited[a][b] == false && grid[a][b] == '1'){
                visited[a][b] =true;
                dq.add(new ArrayList<>(Arrays.asList(a,b)));
            }
        }
        System.out.println();
    }
}
public static int[] fintOne(char[][] grid,boolean[][] visited){
    System.out.println("find one : ");
    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j] == '1' && visited[i][j] == false){
                System.out.println("fond at : "+i+" "+j);
                return new int[] {i,j};
            }
        }
    }
    System.out.println("not found");
    return new int[] {-1,-1};
}
public static void printGrid(char[][] grid){
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