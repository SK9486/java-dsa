import java.util.List;

public class Main {
    static class Tree{
        int val;
        Tree left;
        Tree right;
        Tree(int n){
            this.val = n;
            left = null;
            right = null;
        }
    }
    public static void main(String[] args) {
        Tree parent = new Tree(1);
        Tree left = new Tree(2);
        Tree right = new Tree(3);
        Tree left1 = new Tree(4);
        Tree right1= new Tree(5);
        parent.left = left;
        parent.right = right;
        left.left = left1;
        left.right = right1;
        System.out.println("preOrder : ");
        preOrder(parent);
        System.out.println();
        System.out.println("postOrder : ");
        postOrder(parent);
        System.out.println();
        System.out.println("inOrder : ");
        inOrder(parent);
        System.out.println();
    }
    // preorder => Root Left Right
    public static void preOrder(Tree node){
        if(node == null){
            return;
        }
        System.out.print(node.val+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    // postorder => left right root
    public static void postOrder(Tree node){
        if(node == null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val+" ");

    }
    // inorder => left root right
        public static void inOrder(Tree node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.val+" ");
        inOrder(node.right);

    }
}