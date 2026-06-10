import java.util.List;

public class Main {
    // Node class
    public static void main(String[] args) {
        int n = 5;
        int cols_rows = (2 * n) -1;
        int k = 0;
        System.out.println("cols and rows : "+cols_rows);
        for(int i=0;i<cols_rows;i++){
            k = i < n ? ++k : --k;
            for(int j=0;j<cols_rows;j++){
                if(j == i || (cols_rows-1)-j == i){
                   System.out.print(k+" ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}