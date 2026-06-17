import java.util.*;

class Hello {
   public static void main(String[] args) {
    String str = "987.45 larger than 2635.67";
    boolean isBeg = false;
    boolean isNum;
    int st = -1;
    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        isNum = Character.isDigit(ch) || ch == '.';
        System.out.println("ch1 : "+ch);
        if(isNum&& !isBeg){
            isBeg = true;
            st = i;
            System.out.println("isBeg asigned : "+st);
        }
        if(isBeg && !isNum){
            System.out.println("st :"+st+" "+str.charAt(st));
            System.out.println("substring : "+str.substring(st, i));
            isBeg = false;
        }
    }
    if(isBeg){
        System.out.println("last : ");
        System.out.println("st :"+st+" "+str.charAt(st));
        System.out.println("substring : "+str.substring(st, str.length()));
        isBeg = false;
    }
}
}