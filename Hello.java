class Hello{
    public static void main(String[] args) {
        int r = 3;
        int c = 4;
        int[][] mat =  {
            {10,12,13,15},
            {23,88,12,42},
            {99,89,79,11}
        };
        for(int[] row:mat){
            int last = row[row.length-1];
            int unit = last % 10;
            for(int a : row){
                System.out.print((a+unit)+" ");
            }
            System.out.println();
        }
    }
}