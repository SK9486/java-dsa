import java.util.*;
class Hello{
    public static void main(String[] args) {
       int[] arr = {38,22,52,40,64,46,5,29,60,90};
       int n = 10;
       int mul = 4;
       boolean[] tracker = new boolean[arr.length];
       System.out.println(Arrays.toString(tracker));
       for(int i=0;i<arr.length;i++){
        int ele = arr[i];
        if(ele % mul == 0){
            tracker[i] = true;
        }
       }
       System.out.println(Arrays.toString(tracker));
       int st = -1;
       int ed = -1;
       for(int i=0;i<tracker.length;i++){
        if(tracker[i]){
            if(st == -1){
                st = i;
            }else{
                ed = i;
                System.out.println("range : "+st+" "+ed);
                sortedAndReplace(st, ed, tracker, arr);
                st=ed;
            }
        }
       }
       System.out.println(Arrays.toString(arr));
       System.out.println(Arrays.toString(tracker));
    }
    public static void sortedAndReplace(int i,int j,boolean[] track,int[] arr){
        int m = (j-i)-1;
        int[] splt = new int[m];
        int x =  i+1;
        for(int a=0;a<splt.length;a++){
            splt[a] = arr[x];
            x++;
        }
        Arrays.sort(splt);
        x=0;
        for(int a=i+1;a<j;a++){
            arr[a] = splt[x];
            x++;
        }
        System.out.println(Arrays.toString(splt));
        System.out.println(Arrays.toString(arr));
    }
}