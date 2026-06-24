class Hello{
    public static void main(String[] args) {
        String str = "aaaabbcccbb";
        int n = 3;
        int p1 = 0;
        int p2 = 0;
        while(p1<str.length()){
            char ch1 = str.charAt(p1);
            // System.out.println("p1 : "+p1);
            while(p2<str.length() && str.charAt(p2) == ch1){
                p2++;
            }
            // System.out.println("p2 : "+p2);
            int len = p2 - p1;
            // System.out.println("len : "+len);
            if(len >= n){
                System.out.print(ch1);
            }
            p1 = p2;
        }
    }
}
