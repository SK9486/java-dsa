class Hello{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k =3;
        if(k>=arr.length){
            k = arr.length % k;
        }
        printArr(arr);
        reverseArr(arr, 0, arr.length-1);
        // entire arr reverse
        System.out.println("entire elements rev :");
        printArr(arr);
        // k elements revere
        System.out.println("k ele reverse");
        reverseArr(arr, 0, k-1);
        printArr(arr);
        // remaining n- k elements
        System.out.println("k-n elements reverse");
        reverseArr(arr, k, arr.length-1);
        printArr(arr);
    }
    public static void reverseArr(int[] arr,int i,int j ){
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
    }
    public static void printArr(int[] arr){
        for(int a : arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }
}
// rotating k times an array