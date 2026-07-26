class Hello{
    public static void main(String[] args) {
        String st = "omega";
        int mid = st.length()/2;
        // String st = "killer";
        // int mid = st.length()/2;
        System.out.println("mid : "+mid);
        int p2 = -1;
        int p1 = st.length();
        System.out.println("p1 : "+p1);
        System.out.println("p2 : "+p2);
        for(int i=0;i<st.length();i++){
            p2++;
            p1--;
            for(int j=0;j<st.length();j++){
                if(i == mid){
                    System.out.print(st.charAt(j)+" ");
                }else{
                    if( j == mid){
                            System.out.print(st.charAt(p2)+" ");
                    }else if(i == j || i+j == st.length() -1){
                            System.out.print(st.charAt(p1)+" ");
                    }else{
                            System.out.print("* ");
                    }
                }
        }
            System.out.println();
        }
    }
}