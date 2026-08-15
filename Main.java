import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class Main{
   public static void main(String[] args) {
      long sum =0;
      long n = 9999999;
      for(long i=1;i<=n;i++){
         if(i == 1 && n>=9){
            i+=9 * 1;
            sum+=9;
            System.out.println(sum);
         }
         if(i == 10 && n>=99){
            i+=90;
            sum += 90 * 2;
            System.out.println(90 * 2);
            System.out.println("i : "+i);
            System.out.println(sum);
         }
         if( i == 100 && n >= 999){
            i+=900;
            sum += 900 * 3;
            System.out.println(900 * 3);
             System.out.println("i : "+i);
            System.out.println(sum);
         }
         if(i == 1000 && n >= 9999){
            i+=9000;
            sum += 9000 * 4;
            System.out.println(9000 * 4);
            System.out.println("i : "+i);
            System.out.println(sum);
         }
         if(i == 10000 && n >= 99999){
            i+=90000;
            sum += 90000 * 5;
            System.out.println(90000 * 5);
             System.out.println("i : "+i);
            System.out.println(sum);
         }
         if(i == 100000 && n >= 999999){
            i+=900000;
            sum += 900000 * 6;
            System.out.println(900000 * 6);
             System.out.println("i : "+i);
            System.out.println(sum);
         }
         if(i == 1000000 && n >= 9999999){
            i+=9000000;
            sum += 9000000 * 7;
            System.out.println(9000000 * 7);
            System.out.println("i : "+i);
            System.out.println(sum);
         }
         System.out.println(" i "+i);
         if(i <= n){
            String st_i = String.valueOf(i);
            System.out.println("st_i : "+st_i);
            sum += st_i.length();
         }
      }
      System.out.println(sum);
   }
}