import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int n = 4;
        int m = 6;
        String[] board = {
    "e-y-rk",
    "xi----",
    "--atq",
    "-m--pa"
};
// String[] board = {
//     "uwwr-kb--",
//     "mq-hocqi-",
//     "--g------",
//     "-v-v-b---",
//     "h-xr--s-o",
//     "p-jbugt-s",
//     "ec-cs----"
// };
char opr = 'L';
String out = "";
for(String str : board){
    if(opr == 'L'){
        out += getFirstAlpha(str);
        System.out.println("out : "+out);
    }else{
        out += getLastAlpha(str);
        System.out.println("out : "+out);
    }
}
    }

    public static char getFirstAlpha(String str){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != '-' && str.charAt(i) != ' '){
                return str.charAt(i);
            }
        }
        return ' ';
    }
    public static char getLastAlpha(String str){
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i) != '-' && str.charAt(i) != ' '){
                return str.charAt(i);
            }
        }
        return ' ';
    }

}