import java.util.*;

public class Hello {

    public static void main(String[] args) {
        int[][] islands = {
            {1,1,0,1,0,1,1},
            {1,1,0,1,0,1,1},
            {1,0,1,0,1,0,0},
            {1,0,1,1,1,0,1},
            {1,0,1,1,1,0,1},
            {1,0,1,1,1,0,1}
        };
        boolean[][] visited = new boolean[islands.length][islands[0].length];
        int count = 0;
        for(int i=0;i<islands.length;i++){
            for(int j=0;j<islands[i].length;j++){
                if(islands[i][j] == 1 && visited[i][j] == false){
                    count++;
                    System.out.println("counter : "+count+" i : "+i+" j : "+j);
                    dfs(islands,visited,count,i,j);
                }
            }
        }
        int[] len = new int[count];
        storeTheLenOfIsland(islands, len,count);
        printTracer(visited);
        printIsland(islands);
    }
    public static void dfs(int[][] island,boolean[][] visited,int c,int i,int j){
        int[][] dirs = {
            {i,j},{i-1,j},{i,j+1},{i,j-1},{i+1,j}
        };
        for(int[] dir:dirs){
            int a = dir[0];
            int b = dir[1];
            if(a>= 0 && a <island.length && b >=0 && b<island[a].length &&island[a][b] != 0 && visited[a][b] == false){
                visited[a][b] = true;
                island[a][b] = c;
                dfs(island,visited,c,a,b);
            }
        }
        
    }
    public static void storeTheLenOfIsland(int[][] islands,int[] len,int count){
        for(int c=1;c<count;c++){
            int s =0;
            for(int i=0;i<islands.length;i++){
                for(int j=0;j<islands[i].length;j++){
                    if(islands[i][j] == c){
                        s++;
                    }  
                }
            }
            
        }
    }
    public static void printTracer(boolean[][] visited){
        for(boolean[] bo:visited){
            for(boolean b : bo){
                System.out.print(b+" ");
            }
            System.out.println();
        }
    }
    public static void printIsland(int[][] islands){
        for(int[] island : islands){
            for(int a : island){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
    
}
