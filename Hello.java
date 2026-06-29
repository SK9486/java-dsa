import java.util.ArrayList;
import java.util.List;

class Hello {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        generator("", 2,0,0,arr);
    }

        public static void generator(String str,int n,int open,int close,List<String> arr){
            if(str.length() == 2 * n){
                // if(checker(str, n)){
                //     System.out.println("valid : "+str);
                // }
                // System.out.println("valid : "+str);
                // System.out.println("open : "+open);
                // System.out.println("close : "+close);
                arr.add(str);
                return;
            }
            if(open < n){
                generator(str+"(", n,open+1,close,arr);
            }
            if(close < open){
                generator(str+")", n,open,close+1,arr);
            }
        }
}