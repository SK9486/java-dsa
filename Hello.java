import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

    class Hello {
        public static void main(String[] args) {
            int[] arr = {1,2,3,1,1,2,1};
            int slot = 0;
            int count = 0;
            for(int a : arr){
                if(slot == 0 || count < 0){
                    slot = a;
                    count++;
                }else if(slot == a){
                    count++;
                }else{
                    count--;
                }
                System.out.println("a : "+a+" slot : "+slot+" c : "+count);
            }
    }
    }