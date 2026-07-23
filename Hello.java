import java.util.Arrays;
import java.util.Scanner;

class Hello{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // System.out.println("Enter value of N and M :");

    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] walls = new int[N+2];
    // System.out.println(" N : "+N);
    // for(int wal : walls){
    //   System.out.print(wal+" ");
    // }

    for(int i=0;i<M;i++){
        int st = sc.nextInt();
        int ed = sc.nextInt();
        // System.out.println(st+" "+ed);
        for(int k=st;k<ed;k++){
            walls[k] = walls[k] +1;
        }
    }
    for(int wal : walls){
      System.out.print(wal+" ");
    }

    int sum = 0;
    int min = Integer.MAX_VALUE;
    for(int i=0;i<walls.length;i++){
        sum += walls[i];
        walls[i] = sum;
        if(walls[i] < min && i > 0 && i <= N){
            min = walls[i];
        }
    }
    // System.out.println();
    // for(int wal : walls){
    //   System.out.print(wal+" ");
    // }
    // System.out.println("min : "+min);


    }
}