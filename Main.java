public class Main{
    public static void main(String[] args) {
        int n = 6;
        char ch1 = '@';
        char ch2 = '%';
        int left;
        int rght;
        int mid = (((n-1)*2)+1)/2;
        System.out.println("mid : "+mid);
        for(int i=0;i<n;i++){
            for(int j=0;j<(((n-1)*2)+1);j++){
                left = mid - i;
                rght = mid + i;
                if(j>=left && j<=rght){
                    // System.out.print("* ");
                    if(j % 2 != 0){
                        System.out.print(ch1+" ");
                    }else{
                        System.out.print(ch2+" ");
                    }
                }else{
                    System.out.print("+ ");
                }
            }
            System.out.println();
        }
    }
}