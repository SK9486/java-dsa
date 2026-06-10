import java.util.*;

class Hello {
   public static void main(String[] args) {
    // String[][] grid = {
    // {"1","1","1","1","0"},
    // {"1","1","0","1","0"},
    // {"1","1","0","0","0"},
    // {"0","0","0","0","0"}
    // };
    int[][] grid = {
    {0,0,1,0,0,0,0,1,0,0,0,0,0},
    {0,0,0,0,0,0,0,1,1,1,0,0,0},
    {0,1,1,0,1,0,0,0,0,0,0,0,0},
    {0,1,0,0,1,1,0,0,1,0,1,0,0},
    {0,1,0,0,1,1,0,0,1,1,1,0,0},
    {0,0,0,0,0,0,0,0,0,0,1,0,0},
    {0,0,0,0,0,0,0,1,1,1,0,0,0},
    {0,0,0,0,0,0,0,1,1,0,0,0,0}
};
    int max = 0;
    boolean[][] visited = new boolean[grid.length][grid[0].length];
    for(boolean[] vis : visited){
        for(boolean v : vis){
            System.out.print(v+" ");
        }
        System.out.println();
    }
    // TOP BOTTOM LEFT RIGHT
    int[] ones = findOnes(grid, visited);
    while(ones[0] != -1 && ones[1] != -1){
        int[] c= {0};
        dfs(ones[0],ones[1], grid, visited,c);
        for(int a:c){
            System.out.println("c : "+a);
        }
        max = Math.max(max,c[0]);
        ones = findOnes(grid, visited);
        System.out.println("max : "+max);
    }
    for(boolean[] vis : visited){
        for(boolean v : vis){
            if(v){
                System.out.print(1+" ");
            }else{
                System.out.print("  ");
            }
            
        }
        System.out.println();
    }

   }
   public static void dfs(int i,int j,int[][] grid,boolean[][] visited,int[] c){
    if(grid[i][j] == 1 && visited[i][j] == false){
        System.out.println("dfs :["+i+" , "+j+"]");
        c[0]+=1;
        visited[i][j] = true;
        int[][] dirs = {{i-1,j},{i+1,j},{i,j-1},{i,j+1}};
            for(int[] dir : dirs){
                int a = dir[0];
                int b = dir[1];
                if(a>=0 && a<grid.length && b>=0 && b<grid[0].length){
                    dfs(a,b,grid, visited,c);
                }
            }
    }
   }
   public static int[] findOnes(int[][] grid,boolean[][] visited){
    for(int i =0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j] == 1 && visited[i][j] == false){
                System.out.println("findOnes : "+"["+i+" , "+j+"]");
                return new int[] {i,j};
            }
        }
    }
    return new int[] {-1,-1};
   }

}