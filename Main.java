import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class Main{
    public static void main(String[] args) {
        String nums = "9223372036854775808";
        ArrayList<String> base_arr = new ArrayList<>();
        for(int i=0;i<nums.length();i++){
            if( i == 0){
                base_arr = build_base_arr(Character.getNumericValue(nums.charAt(i)),nums.length());
            }else{
                updateing_arry(Character.getNumericValue(nums.charAt(i)), i, base_arr);
            }
        }
        System.out.println(base_arr);
    }
    public static ArrayList<String> build_base_arr(int n,int len){
        ArrayList<String> baseArr = new ArrayList<>();
        for(int i=0;i<n;i++){
            long ele = (long)Math.pow(10L,len-1);
            baseArr.add(String.valueOf(ele));
        }
        return baseArr;
    }
    public static ArrayList<String> updateing_arry(int n,int pos,ArrayList<String> base_arr){
        for(int i=0;i<n;i++){
            if(i > base_arr.size() - 1){
                System.out.println("i : "+i+" n : "+n);
                addOnes(n-i, base_arr);
                break;
            }
            String curr = base_arr.get(i);
            String updated = update(curr,pos);
            base_arr.set(i,updated);
            System.out.println("curr : "+curr);
        }
        return base_arr;
    }

    public static String update(String str,int pos){
        char[] chrs = str.toCharArray();
        chrs[pos] = '1';
        System.out.println(chrs);
        return new String(chrs);
    }

    public static void addOnes(int n,ArrayList<String> baseArr){
        for(int i=0;i<n;i++){
            baseArr.add("1");
        }
    }
}