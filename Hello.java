import java.util.ArrayList;

class Hello{
    public static void main(String[] args) {
        String inp = "PROGRAM";
        int n = inp.length();
        int mid = n/2;
        // System.out.println(n+" "+mid);
        String str = "";
        for(int i=0;i<n;i++){
            String temp = "";
            for(int j=0;j<n;j++){
                int cnd = (n-1)-i;
                if(j<cnd){
                    temp+="*";
                }
            }
            // System.out.println(temp);
            if(i<=mid){
                str+=inp.charAt((i+mid));
            }else{
                str+=inp.charAt(((i-1)-mid));
            }
            temp+=str;
            // System.out.println(str);
            System.out.println(temp);
        }
    }
}