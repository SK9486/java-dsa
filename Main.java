import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int n) {
        this.val = n;
        left = null;
        right = null;
    }
}

public static void main(String[] args) {

TreeNode root = new TreeNode(1);

root.left = new TreeNode(2);
root.right = new TreeNode(3);

root.left.left = new TreeNode(4);

root.right.right = new TreeNode(5);
    // TreeNode root = new TreeNode(1);

    // root.left = new TreeNode(2);
    // root.right = new TreeNode(3);

    // root.right.left = new TreeNode(4);
    // root.right.right = new TreeNode(5);
    BFS(root);
}
    public static void BFS(TreeNode root){
        Deque<TreeNode> dq = new LinkedList<>();
        List<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> ele = new ArrayList<>();
        dq.add(root);
        int size = dq.size();
        System.out.println("size : "+size);
        int level = 0;
        while(!dq.isEmpty()){
            System.out.println("level : "+level);
            for(int i=0;i<size;i++){
                TreeNode curr = dq.removeFirst();
                ele.add(curr.val);
                System.out.println(curr.val);
                if(curr.left != null){
                    dq.add(curr.left);
                }
                if(curr.right != null){
                    dq.add(curr.right);
                }
            }
            res.add(ele);
            level++;
            System.out.println();
            size = dq.size();
        }
    }
}

// null 2 null 1 null
// null 1 null 2 null 