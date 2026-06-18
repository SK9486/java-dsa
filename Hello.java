import java.util.*;

class Hello {
   public static void main(String[] args) {
    // int[][] mat = new int[][]{
    //     {1,2,3,4},
    //     {5,6,7,8},
    //     {9,10,11,12},
    //     {13,14,15,16}
    // };
int[][] mat = {
    {54, 86, 35, 71},
    {78, 32, 85, 62},
    {69, 84, 66, 45},
    {37, 79, 73, 30}
};
    int n = 4;
    int l = 0;
    int r = n -1;
    int mid = n / 2;
    System.out.println("before : ");
    printArr(mat);
    for(int i=0;i<mat.length;i++){
           int[] arr1 = {-1,-1};
            int[] arr2 = {-1,-1};
        for(int j=0;j<mat[0].length;j++){
            if(j==l || j == r){
                System.out.print("["+i+","+j+"]"+" ");
                if(arr1[0] == -1){
                    arr1[0] = i;
                    arr1[1] = j;
                }else{
                    arr2[0] = i;
                    arr2[1] = j;
                }
            }
        }
        if(arr1[0] != -1 && arr2[0] != -1){
            swap(arr1,arr2,mat);
        }
        if(i <= mid){
            l++;
            r--;
        }else{
            l--;
            r++;
        }
        System.out.println();
    }
    System.out.println("after : ");
    printArr(mat);
}
public static void swap(int[] arr1,int[] arr2,int[][] res){
    System.out.println("swapping : ");
    System.out.println("arr1 : "+arr1[0]+" "+arr1[1]);
    System.out.println("arr2 : "+arr2[0]+" "+arr2[1]);

    int temp = res[arr1[0]][arr1[1]];
    res[arr1[0]][arr1[1]] = res[arr2[0]][arr2[1]];
    res[arr2[0]][arr2[1]] = temp;
}
public static void printArr(int[][] arr) {
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}
}