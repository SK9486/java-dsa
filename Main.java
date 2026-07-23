import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        inputHandler(n,sc);
    }
    public static void inputHandler(int n,Scanner sc){
        for(int i=0;i<n;i++){
            int m = sc.nextInt();
            int[] shelfs = new int[m];
            for(int j=0;j<m;j++){
                shelfs[j] = sc.nextInt();
            }
            System.out.println(checkShelf(shelfs) ? "Yes" : "No");
        }
    }
    public static boolean checkShelf(int[] shelfs){
        long bal = 0;
        for(int i=0;i<shelfs.length;i++){
            long req = i + 1;
            long curr = shelfs[i];
            // System.out.println("req : "+req+" curr : "+curr);
            if(curr > req){
                bal += curr - req;
            }else if(req > curr){
                long rem = req - curr;
                if(bal >= rem){
                    bal-=rem;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}
