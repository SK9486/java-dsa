
package rhp;

import java.util.*;

public class RHP {

    public static void main(String[] args) {
        int N = 10;
        int[][] pairs = {
            {1,7},
            {2,6},
            {6,7},
            {7,9},
            {9,10},
            {4,8},
            {8,5}
        };
        int[] leadersFolowers = new int[N+1];
//        making the leaders as they followers intially \
        for(int i=0;i<leadersFolowers.length;i++){
            leadersFolowers[i] = i;
        }
        
        
//        using the pairs in leaaderFlowers
        for(int[] ar : pairs){
            leadersFolowers[ar[0]] = ar[1];
        }
        
        for(int i=1;i<leadersFolowers.length;i++){
            int trueLeader = find(i,leadersFolowers);
            update(i, leadersFolowers, trueLeader);
        }
        printArrs(leadersFolowers);
        Set<Integer> set = new HashSet<>();
        for(int i=1;i<leadersFolowers.length;i++){
            set.add(leadersFolowers[i]);
        }
        System.out.println("set : ");
        for(int a : set){
            System.out.print(a+" ");
        }
        System.out.println();
       
        
    }
    public static void printArrs(int[] leaders){
        for(int i=0;i<leaders.length;i++){
            System.out.println("key : "+i+" value : "+leaders[i]);
        }
    }
    
    public static int find(int key,int[] leadersFolowers){
        if(leadersFolowers[key] == key){
            System.out.println("final key : "+key);
            return key;
        }
        return find(leadersFolowers[key], leadersFolowers);
    }
    
    public static void update(int key,int[] leadersFolowers,int ultimateLeader){
        if(leadersFolowers[key] == ultimateLeader){
            return;
        }
        int value = leadersFolowers[key];
        leadersFolowers[key] = ultimateLeader;
        update(value, leadersFolowers, ultimateLeader);
    }
    
}
