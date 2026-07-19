import java.util.Arrays;

class Hello{
    public static void main(String[] args) {
        int[][] mat = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        boolean[][] trace = new boolean[mat.length][mat[0].length];
        for(boolean[] arr : trace){
            for(boolean ar : arr){
                System.out.print(ar+" ");
            }
            System.out.println();
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j] == 0){
                    System.out.println("i : "+i+"j : "+j+" mat[i][j] : "+mat[i][j]);
                    trace[i][j] = true;
                    make_it_zero(i,j,trace);
                }
            }
        }
         for(boolean[] arr : trace){
            for(boolean ar : arr){
                System.out.print(ar+" ");
            }
            System.out.println();
        }
        replace_with_zero(mat,trace);

        for(int[] ar :mat){
            for(int a : ar){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
    public static void make_it_zero(int a,int b,boolean[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if((a == i || b == j) && mat[i][j] != true){
                    System.out.println("i : "+i+"j : "+j+" = "+"-1");
                    mat[i][j] = true;
                }
            }
        }
    }
    public static void replace_with_zero(int[][] mat,boolean[][] trace){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(trace[i][j] == true && mat[i][j] != 0){
                    mat[i][j] = 0;
                }
            }
        }
    }
}