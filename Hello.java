import java.util.Arrays;

class Hello{
    public static void main(String[] args) {
        int[][] mat = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        boolean[] col_tr = new boolean[mat[0].length];
        boolean[] row_tr = new boolean[mat.length];
        for(int i=0;i<mat.length;i++){
            for(int j =0;j<mat[i].length;j++){
                if(mat[i][j] == 0){
                    col_tr[j] = true;
                    row_tr[i] = true;
                }
            }
        }
        replace_with_zero(mat, col_tr, row_tr);
        printArr(mat);

    }
    public static void replace_with_zero(int[][] mat,boolean[] col,boolean[] row){
        for(int i=0;i<mat.length;i++){
            for(int j =0;j<mat[i].length;j++){
                if(col[j] == true || row[i] == true ){
                    mat[i][j] = 0;
                }
            }
        }
    }
    public static void printArr(int[][] mat){
        for(int[] ar: mat){
            for(int a : ar){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }
}