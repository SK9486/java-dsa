import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value : ");
        int n = sc.nextInt();
        oddNoOptimized(n);
    }
    public static void oddNo(int n){
        for(int i=1;i<=n;i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
    public static void oddNoOptimized(int n){
        for(int i=1;i<=n;i+=2){
                System.out.println(i);
        }
    }
}
