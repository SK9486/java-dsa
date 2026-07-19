public class Main{
    public static void main(String[] args) {
        int[] arr = {1,3,2,4,5,6};
        selectionSortMin(arr, 0, arr.length/2);
        selectionSortMax(arr, arr.length/2, arr.length);
        for(int a : arr){
            System.out.print(a+" ");
        }

    }
    public static void selectionSortMin(int[] arr,int st,int ed){
        for(int i =st;i<ed;i++){
            int temp_idx = i;
            int min = arr[i];
            int min_idx = i;
            for(int j = i;j<ed;j++){
                if(arr[j] < min){
                    min = arr[j];
                    min_idx = j;
                }
            }
            swap(min_idx,temp_idx,arr);
        }
    }
    public static void selectionSortMax(int[] arr,int st,int ed){
        for(int i =st;i<ed;i++){
            int temp_idx = i;
            int max = arr[i];
            int max_idx = i;
            for(int j = i;j<ed;j++){
                if(arr[j] > max){
                    max = arr[j];
                    max_idx = j;
                }
            }
            swap(max_idx,temp_idx,arr);
        }
    }

    public static void swap(int p1,int p2,int[] arr){
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
}