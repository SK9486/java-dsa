import java.util.ArrayList;

class Hello{
    public static void main(String[] args) {
       int[][] matx = {
    {49, 50, 45, 12, 33, 19},
    {11, 27, 44, 17, 14, 47},
    {38, 12, 12, 50, 13, 19},
    {46, 21, 10, 46, 39, 48},
    {28, 43, 43, 20, 43, 20},
    {29, 45, 39, 36, 10, 38}
};
       int[][] trans = new int[matx[0].length][matx.length];
       for(int i=0;i<matx[0].length;i++){
        for(int j=0;j<matx.length;j++){
            trans[i][j] = matx[j][i];
        }
       }
       printArr(matx);
       System.out.println();
       printArr(trans);

       int c1 = findEvenConsicitive(matx);
       System.out.println();
       int c2 = findOddConsicitive(matx);
       System.out.println();
       int c3 = findEvenConsicitive(trans);
       System.out.println();
       int c4 = findOddConsicitive(trans);
       System.out.println();
       System.out.println("c1 : "+c1);
       System.out.println("c2 : "+c2);
       System.out.println("c3 : "+c3);
       System.out.println("c4 : "+c4);
       int c = Math.max(Math.max(c1,c2),Math.max(c3,c4));
       System.out.println("c : "+c);
    }
    public static void printArr(int[][] mat){
        for(int[] rows : mat){
            for(int a : rows){
                System.out.print(a+" ");
            }
            System.out.println();
        }
    }

    public static int findEvenConsicitive(int[][] mat){
        int maxC = 0;
        for(int[] row : mat){
            int c = 0;
            for(int a : row){
                if(a % 2 == 0){
                    c++;
                    System.out.println("even : "+a+" c : "+c);
                }else{
                    System.out.println("not even" +a+" founded c : "+c);
                    maxC = Math.max(c, maxC);
                    c=0;
                }
            }
            if(c != 0){
                maxC = Math.max(c, maxC);
                c = 0;
            }
        }
        return maxC;
    }

    public static int findOddConsicitive(int[][] mat){
        int maxC = -1;
        for(int[] row : mat){
            int c  =0;
            for(int a : row){
                System.out.println("a : "+a);
                if(a % 2 != 0){
                    c++;
                   System.out.println("odd : "+a+" c : "+c);
                }else{
                    System.out.println("not odd "+a+" founded c : "+c);
                    maxC = Math.max(c, maxC);
                    c=0;
                }
            }
            if(c != 0){
                maxC = Math.max(c, maxC);
                c = 0;
            }
        }
        System.out.println("maxC : "+maxC);
        return maxC;
    }
}