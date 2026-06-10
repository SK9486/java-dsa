import java.util.*;

class Hello {
   public static void main(String[] args) {
    // String[][] grid = {
    // {"1","1","1","1","0"},
    // {"1","1","0","1","0"},
    // {"1","1","0","0","0"},
    // {"0","0","0","0","0"}
    // };
    String[][] grid = {
         {"1","1","0","0","0"},
        {"1","1","0","0","0"},
        {"0","0","1","0","0"},
        {"0","0","0","1","1"}
    };
    boolean[][] visited = new boolean[grid.length][grid[0].length];
    for(boolean[] vis : visited){
        for(boolean v : vis){
            System.out.print(v+" ");
        }
        System.out.println();
    }
    // TOP BOTTOM LEFT RIGHT
    int c =0;
    int[] ones = findOnes(grid, visited);
    while(ones[0] != -1 || ones[1] != -1){
        dfs(ones[0],ones[1], grid, visited);
        ones = findOnes(grid, visited);
        c++;
    }
    System.out.println("c : "+c);

   }
   public static void dfs(int i,int j,String[][] grid,boolean[][] visited){
    if(grid[i][j].equals("1" && visited[i][j] == false){
        System.out.println("dfs :["+i+" , "+j+"]");
        visited[i][j] = true;
        int[][] dirs = {{i-1,j},{i+1,j},{i,j-1},{i,j+1}};
            for(int[] dir : dirs){
                int a = dir[0];
                int b = dir[1];
                if(a>=0 && a<grid.length && b>=0 && b<grid.length){
                    dfs(a,b,grid, visited);
                }
            }
    }
   }
   public static int[] findOnes(String[][] grid,boolean[][] visited){
    for(int i =0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j] == "1" && visited[i][j] == false){
                System.out.println("findOnes : "+"["+i+" , "+j+"]");
                return new int[] {i,j};
            }
        }
    }
    return new int[] {-1,-1};
   }

}