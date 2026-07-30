import java.util.*;

class Main {
    public static void main(String[] args) {
//         char[][] maze = {
//     {'+', '+', '.', '+'},
//     {'.', '.', '.', '+'},
//     {'+', '+', '+', '.'}
// };
char[][] maze = {
    {'+', '+', '+'},
    {'.', '.', '.'},
    {'+', '+', '+'}
};
// char[][] maze = {
//     {'.','+'}
// };
        int[] standing_point = {1,0};
         System.out.println(bfs(standing_point[0], standing_point[1], maze));
    }


    public static int bfs(int x,int y,char[][] maze){
        int c= 0;
        System.out.println(maze.length);
        System.out.println(maze[0].length);
        Deque<int[]> dq = new LinkedList<>();
        dq.addLast(new int[] {x,y});
        int size = 0;
        while(!dq.isEmpty()){
            for(int k=0;k<size;k++){
                int[] pos = dq.removeFirst();
                int i = pos[0];
                int j = pos[1];
                System.out.println(i+" "+j);
                maze[i][j] = '+';
                int[][] dirs = {
                    { i - 1, j },
                    { i + 1, j },
                    { i, j - 1 },
                    { i, j + 1 }
                };
            for(int[] dir : dirs){
                int a = dir[0];
                int b = dir[1];
                if(a>=0 && a < maze.length && b>=0 && b<maze[0].length && maze[a][b] == '.'){
                    c++;
                    if((a == 0 || a ==  maze.length - 1) || (b == 0 || b == maze[0].length -1) ){
                         System.out.println("Breaked "+c);
                         return c;
                    }
                    dq.add(new int[] {a,b});
                }
            }
            }
            size = dq.size();
        }
        return -1;

    }
}