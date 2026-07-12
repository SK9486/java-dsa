import java.util.Arrays;

class Hello{
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int p1 = 0;
        int p2 = 0;
        while(p1<arr.length && p2<arr.length){
            if(arr[p1] != arr[p2]){
                System.out.println("mimatch occures");
                p1++;
                arr[p1] = arr[p2];
            }
            System.out.println("p1 : "+arr[p1]);
            System.out.println("p2 : "+arr[p2]);
            p2++;
        }
        System.out.println("p1 : "+p1);
        System.out.println("p2 : "+p2);
        for(int a : arr){
            System.out.print(a+" ");
        }
        System.out.println();
    }
}