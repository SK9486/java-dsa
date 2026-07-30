import java.util.*;

class Main {
    public static void main(String[] args) {
        int n_no_nodes =4 ;
        int m_no_edge = 2;
        int start_node = 1;

        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1,3));
        ArrayList<ArrayList<Integer>> nodes = new ArrayList<>(Arrays.asList(arr1,arr2));
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();

        // Intializing the map with nodes
        for(int i=1;i<=n_no_nodes;i++){
            map.put(i,new ArrayList<>());
        }

        // Bulding the map with edges

        for(ArrayList<Integer> node : nodes){
            ArrayList<Integer> val = map.get(node.get(0));
            val.add(node.get(1));
            map.put(node.get(0),val);

        }

        printMap(map);
        ArrayList<ArrayList<Integer>> res = bfs(map, start_node);
        HashMap<Integer,Integer> ansMap = new HashMap<>();
        for(int i=1;i<=n_no_nodes;i++){
            ansMap.put(i,0);
        }
        ans_weights(ansMap,res,6);
        for(Map.Entry<Integer,Integer> enty : ansMap.entrySet()){
            System.out.println(enty.getKey()+" "+enty.getValue());
        }


        // 4 2
        // 1 2
        // 1 3
        // 1
    }

    public static void printMap(HashMap<Integer,ArrayList<Integer>> map){
        for(Map.Entry<Integer,ArrayList<Integer>> enty : map.entrySet()){
            System.out.println(enty.getKey()+" "+enty.getValue());
        }
    }
    public static ArrayList<ArrayList<Integer>>  bfs(HashMap<Integer,ArrayList<Integer>> map ,int start_node){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> arr;
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(start_node);
        int size = dq.size();
        while(!dq.isEmpty()){
            arr = new ArrayList<>();
            for(int i=0;i<size;i++){
                int poped = dq.removeFirst();
                arr.add(poped);
                for(int a : map.get(poped)){
                    dq.add(a);
                }
            }
            size = dq.size();
            res.add(arr);
        }
        return res;
    }

    public static ArrayList<Integer> ans_weights(HashMap<Integer,Integer> map,ArrayList<ArrayList<Integer>> res,int weight){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<res.size();i++){
            for(int j=0;j<res.get(i).size();j++){
                System.out.println("i : "+i+" j : "+j+" = "+res.get(i).get(j));
                int key = res.get(i).get(j);
                int val = weight * i;
                map.put(key, val);
            }
        }
        return ans;
    }
}