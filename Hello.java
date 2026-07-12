import java.util.Arrays;

class Hello{
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        int n =  arr.length + 1;
        System.out.println(" n  : "+n);
        int exp_sum = (n * (n-1))/2;
        int sum = 0;
        for(int a : arr){
            sum+=a;
        }
        int missing_no = exp_sum - sum;
        System.out.println("exp : "+exp_sum);
        System.out.println("sum : "+sum);
        System.out.println("missing no : "+missing_no);
    }
}