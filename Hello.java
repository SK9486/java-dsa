import java.util.*;

class Hello{
    public static void main(String[] args) {
        int n = 3;
        long sum = 0;
        int[] arr = {15,10,15};
        for(int a : arr){
            System.out.println("for : "+a);
            String str = "";
            for(int i=0;i<a;i++){
                str+="1";
            }
            long rep = Long.parseLong(str);
            sum+=rep;
            System.out.println("rep : "+rep);
            System.out.println("sum : "+sum);
        }
    }
}