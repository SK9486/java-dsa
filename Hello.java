import java.util.Arrays;

class Hello{
    public static void main(String[] args) {
        int[] arr = {2,2,2};
        // int[] arr = {7,8,9,11,12};
        printArr(arr);
        int i =0;
        while(i<arr.length){
            int a_val = arr[i];
            int a_idx = i;
            if(a_val>0 && a_val<=arr.length){
                System.out.println("valid : "+a_val);
                int a_expected_idx = a_val -1;
                if(a_expected_idx != a_idx){
                    System.out.println("a mismatched postions :"+a_val);
                    int b_val = arr[a_expected_idx];
                    int b_indx = a_expected_idx;
                    int b_expected_idx = b_val -1;
                    if(b_expected_idx != b_indx){
                        // swapping
                        System.out.println("b also mismatched position "+b_val);
                        System.out.println("swapping");
                        System.out.println("before : a "+arr[a_idx]+" b : "+arr[b_indx]);
                        arr[a_idx] = b_val;
                        arr[b_indx] = a_val;
                        System.out.println("after : a "+arr[a_idx]+" b : "+arr[b_indx]);
                    }else{
                        System.out.println("b is right");
                        i++;
                    }
                }else{
                    System.out.println("a is right");
                    i++;
                }
            }else{
                System.out.println("out of range");
                i++;
            }
        }
        int res = -1;
        for(int j =0;j<arr.length;j++){
            if(arr[j]-1 != j){
                res = j+1;
                System.out.println("founded : "+(j+1));
                break;
            }else{
                System.out.println("valid : "+j+" "+arr[j]);
            }
        }
        if(res == -1){
            res = arr.length + 1;
        }
        return res;
        System.out.println("final sol : "+res);
        printArr(arr);

}
    public static void printArr(int[] arr){
        for(int a : arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }
}