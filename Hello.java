import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

class Hello{
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        char[] ch = {'a','b'};
        int N = 2;
        bt_dfs(st, ch, N);
    }

    public static void bt_dfs(Stack<Character> path,char [] arr,int N){
        if(path.size() == N){
            System.out.println("path : ");
            arrPrinter(path);
            return;
        }

        for(char ch : arr){
            path.push(ch);
            System.out.println("ch added : "+ch);
            System.out.println("path : ");
            arrPrinter(path);
            bt_dfs(path, arr, N);
            System.out.println("poped : "+path.pop());
        }

    }
    public static void arrPrinter(Stack<Character> chars){
        for(Character h : chars){
            System.out.print(h+" ");
        }
        System.out.println();
    }
}