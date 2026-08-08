class Hello{
    public static void main(String[] args) {
        int n = 15;
        int mid = (n+1)/2;
        System.out.println("mid : "+mid);

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if( i == 0){
                    System.out.print("*");
                }else if ( i == n-1){
                    System.out.print("*");
                }else{
                    if(j == 0 || j == n-1){
                        System.out.print("*");
                    }
                    else if(j == i || n-i == j+1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print("-");
                    }
                }
            }
            System.out.println();
        }
    }
}