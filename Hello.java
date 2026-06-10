import java.util.*;

class Hello {
    public static void main(String[] args) {
       ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        arr.add(new ArrayList<>(Arrays.asList(2,3,1)));
        arr.add(new ArrayList<>(Arrays.asList(0)));
        arr.add(new ArrayList<>(Arrays.asList(0,4)));
        arr.add(new ArrayList<>(Arrays.asList(0)));
        arr.add(new ArrayList<>(Arrays.asList(2)));
        boolean[] visited = new boolean[arr.size()];
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(ArrayList<Integer> ar : arr){
            for(int a : ar){
                set.add(a);
            }
        }
        ArrayList<Integer> nodes = new ArrayList<>(set);
        Collections.sort(nodes);
        dfs(0,arr,visited,res,nodes);
        for(int a : res){
            System.out.println(a+" ");
        }
    }
    public static void dfs(int curr,ArrayList<ArrayList<Integer>> adj,boolean[] visited,ArrayList<Integer> res,ArrayList<Integer> nodes){
        int indexOfCurr = nodes.indexOf(curr);
        ArrayList<Integer> curr_adj = adj.get(indexOfCurr);
        if(!visited[indexOfCurr]){
            res.add(curr);
            visited[indexOfCurr] = true;
            for(int a:curr_adj){
                dfs(a, adj, visited, res, nodes);
            }
        }
    }


}