import java.util.Deque;
import java.util.LinkedList;

public class SegemntTree {
    static Node root;
    void SegmentTree(){
        this.root = null;
    }
    public static  Node constructTree(int[] arr,int st,int ed){
            if(st == ed){
                return new Node(arr[st],null,null,st,ed);
            }
            int mid = (st+ed)/2;
            Node leftChild = constructTree(arr, st,mid);
            Node rightChild = constructTree(arr, mid+1, ed);
            Node parent = new Node(Math.min(leftChild.data,rightChild.data), leftChild, rightChild, leftChild.startInterval, rightChild.endInterval);
            return parent;
    }
    public static void BST(Node parent){
        Deque<Node> dq = new LinkedList<>();
        dq.addLast(parent);
        while(!dq.isEmpty()){
            int size = dq.size();
            for(int i=0;i<size;i++){
                Node node = dq.removeFirst();
                System.out.print(node.data+" ");
                if(node.leftNode != null){
                    dq.addLast(node.leftNode);
                }
                if(node.rightNode != null){
                    dq.addLast(node.rightNode);
                }
            }
            System.out.println();
        }

    }

    public static int queryHandler(Node parent,int qst,int qed){
        int nst = parent.startInterval;
        int ned = parent.endInterval;
        if(qed < nst || qst  > ned){
            return Integer.MAX_VALUE;
        }else if(nst >=qst && ned <= qed){
            return parent.data;
        }else{
            Node left = parent.leftNode;
            Node right = parent.rightNode;
            return Math.min(queryHandler(left, left.startInterval, left.endInterval),
            queryHandler(right, right.startInterval, right.endInterval));
        }
    }
    static class Node {
        int data;
        Node leftNode;
        Node rightNode;
        int startInterval;
        int endInterval;
        Node(int data,Node left,Node right,int st,int ed){
            this.data = data;
            this.leftNode = left;
            this.rightNode = right;
            this.startInterval = st;
            this.endInterval = ed;
        }

    }
    public static void main(String[] args) {
        int[] arr= {3,2,4,5,1,1,5,3};
        SegemntTree seg = new SegemntTree();
        Node parent = constructTree(arr, 0, arr.length-1);
        System.out.println("parent : "+parent.data+" left : "+parent.leftNode.data+" right : "+parent.rightNode.data);
        BST(parent);

    }
}
