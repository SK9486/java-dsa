import java.util.Arrays;

class Hello{
    public static void main(String[] args) {
        // int[][] mat = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        // int tar = 60;
        int[][] mat = {
            {1, 4, 7, 11, 15},
            {2, 5, 8, 12, 19},
            {3, 6, 9, 16, 22},
            {10, 13, 14, 17, 24},
            {18, 21, 23, 26, 30}
        };
        int n = mat.length;
        int m = mat[0].length;
        int i = 0;
        int j = m -1;
        while(j>=0 && i < m){
            int curr = mat[i][j];
            System.out.println("curr : "+curr);
            if(curr > tar){
                j--;
            }else if(curr < tar){
                i++;
            }else{
                System.out.println("founded");
                break;
            }
        }
    };

    public static boolean binarySearch(int[] arrs,int i,int j,int tar){
        while (i <= j) {
            int mid_idx = (i + j) / 2;
            int mid = arrs[mid_idx];
            // System.out.println();
            if (mid > tar) {
                j = mid_idx - 1;
                // System.out.println("j : " + j);
            } else if (mid < tar) {
                i = mid_idx + 1;
                // System.out.println("i : " + i);
            } else {
                // System.out.println("found : " + mid);
                return true;
            }
        }
        return false;
    }
}