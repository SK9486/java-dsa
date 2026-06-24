

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
        TreeNode p1 = new TreeNode(1);
        p1.left = new TreeNode(2);
        p1.right = new TreeNode(3);

        TreeNode q1 = new TreeNode(1);
        q1.left = new TreeNode(2);
        q1.right = new TreeNode(3);

        TreeNode p2 = new TreeNode(1);
        p2.left = new TreeNode(2);

        TreeNode q2 = new TreeNode(1);
        q2.right = new TreeNode(2);

        // Example 3: p = [1,2,1], q = [1,1,2] -> false
        TreeNode p3 = new TreeNode(1);
        p3.left = new TreeNode(2);
        p3.right = new TreeNode(1);

        TreeNode q3 = new TreeNode(1);
        q3.left = new TreeNode(1);
        q3.right = new TreeNode(2);
        // System.out.println("checkTree : "+);
        System.out.println(checkSameTree(p1,q1));
        System.out.println(checkSameTree(p2,q2));
        System.out.println(checkSameTree(p3,q3));
        // System.out.println();
        // checkSameTree(p3, q3);
}
    public static boolean checkSameTree(TreeNode p,TreeNode q){
        boolean left = false;
        boolean right = false;
        if(p == null && q ==  null){
            return true;
        }
        if((p == null && q != null) || (q == null && p != null) || (p.val != q.val)){
            return false;
        };
        if(p.val == q.val){
            left = checkSameTree(p.left, q.left);
            right = checkSameTree(p.right, q.right);
        }
        return left && right;
    }
}