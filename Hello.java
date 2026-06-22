import java.util.Collection;
import java.util.HashMap;

class Hello{
    public static void main(String[] args) {
        boolean ans = true;
        int r = 4;
        int c = 3;
        int[][] mats = {{4,4,4},{5,5,7},{7,7,5},{4,7,7}};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int[] mat : mats){
            for(int a : mat){
                map.put(a,map.getOrDefault(a, 0)+1);
            }
        }
        Collection<Integer> keys = map.values();
        for(int key : keys){
            if(key>c){
                ans = false;
                break;
            }
        }
        if(ans){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }}