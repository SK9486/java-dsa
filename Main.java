import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main{
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            if(input.isEmpty()){
               break;
            }else{
               System.out.println(translator(input));
            }
            System.out.println("Processed: " + input);
        }
   }
   public static String translator(String encrypted){
      String[] arrs = encrypted.split(" ");
      String out = "";
      for(String st : arrs){
         System.out.println(st);
         int len = st.length();
         char ch = (char) (96 + len);
         out += ch;
      }
      return out;
   }
}