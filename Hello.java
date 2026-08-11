import java.util.*;
class Hello{
    public static void main(String[] args) {
        int n = 4;
        String[][] mat = {
            {"1","2","3","4"},
            {"5","6","7","8"},
            {"9","10","11","12"},
            {"100","101","102","103"}
        };
        // for(int i =0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         mat[i][j] = ""+i+j;
        //     }
        // }
        int k =1;
        for(int i=0;i<k;i++){
            int a = 0;
            int b = n-1;
             while(a < b){
                travelsingBoundaryAndRotating(mat, a, b);
                a++;
                b--;
        }
        }

    }

    public static void travelsingBoundaryAndRotating(String[][] mat,int a,int b){
        ArrayList<String> arr = new ArrayList<>();
        for(int j=a;j<=b;j++){
            System.out.print(mat[a][j]+" ");
            arr.add(mat[a][j]);
        }
        System.out.println();
        for(int i=a;i<=b;i++){
            System.out.print(mat[i][b]+" ");
            if(i!=a){
                arr.add(mat[i][b]);
            }
        }
        System.out.println();
        for(int j=b;j>=a;j--){
            System.out.print(mat[b][j]+" ");
            if(j!=b){
                arr.add(mat[b][j]);
            }
        }
        System.out.println();
        for(int j=b;j>=a;j--){
            System.out.print(mat[j][a]+" ");
            if(j!=b && j!=a){
                arr.add(mat[j][a]);
            }
        }
        System.out.println();
        System.out.println(arr);
        rotateAndReplace(mat, a, b, arr);
    }
    
    public static void rotateAndReplace(String[][] mat,int a,int b,ArrayList<String> arr){
        String fst = arr.get(0);
        arr.removeFirst();
        arr.addLast(fst);
        System.out.println(arr);
        int idx = 0;
        for(int j=a;j<=b;j++){
            System.out.print(mat[a][j]+" ");
            // arr.add(mat[a][j]);
            mat[a][j] = arr.get(idx);
            idx++;
        }
        System.out.println();
        for(int i=a;i<=b;i++){
            System.out.print(mat[i][b]+" ");
            if(i!=a){
                // arr.add(mat[i][b]);
                mat[i][b] = arr.get(idx);
                idx++;
            }
        }
        System.out.println();
        for(int j=b;j>=a;j--){
            System.out.print(mat[b][j]+" ");
            if(j!=b){
                // arr.add(mat[b][j]);
                mat[b][j] = arr.get(idx);
                idx++;
            }
        }
        System.out.println();
        for(int j=b;j>=a;j--){
            System.out.print(mat[j][a]+" ");
            if(j!=b && j!=a){
                // arr.add(mat[j][a]);
                mat[j][a] = arr.get(idx);
                idx++;
            }
        }
        System.out.println();
        printArr(mat);
    }

    public static void printArr(String[][] str){
        for(String[] strs : str){
            System.out.println(Arrays.toString(strs));
        }
        System.out.println();
    }
}