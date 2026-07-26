// import java.util.*;

// public class Main{
//     class Node {
//         int data;
//         Node leftNode;
//         Node rightNode;
//         int startInterval;
//         int endInterval;
//         Node(int data,Node left,Node right,int st,int ed){
//             this.data = data;
//             this.leftNode = left;
//             this.rightNode = right;
//             this.startInterval = st;
//             this.endInterval = ed;
//         }
//     }

//     class SegmentTree{
//         Node root;
//         public void printNode(){

//         }
//     }
//     public static void main(String[] args) {
//         int n = 8;
//         int[] arr = {3,2,4,5,1,1,5,3};
//         Node leftNode = new Node(3, null, null, 0, 0);
//         Node rightNode = new Node(2, null, null, 1, 1);
//         Node parent = new Node(Math.min(leftNode.data,rightNode.data), leftNode,rightNode,leftNode.startInterval, rightNode.endInterval);

//     }

//     public static int[] buildTree(int[] arr,int n){
//         int N = getNtermsOfTwoPow(n);
//         System.out.println("N : "+N);
//         int[] tree = new int[n * 2];
//         Arrays.fill(tree,Integer.MAX_VALUE);
//         System.out.println("Building ...");
//         System.out.println("before : "+Arrays.toString(tree));
//         int j =0;
//         for(int i=N/2;i<N;i++){
//             tree[i] = arr[j];
//             System.out.println("tree : "+tree[i]+" i : "+i);
//             j++;
//         }
//         for(int i=(N/2)-1;i>0;i--){
//             int rightChild = tree[2 * i +1];
//             int leftChild = tree[2*i];
//             System.out.println("parent : "+i+" right : "+rightChild +" left : "+leftChild);
//             tree[i] = Math.min(rightChild, leftChild);
//         }
//         System.out.println("after : "+Arrays.toString(tree));
//         return tree;
//     }
//     public static int getNtermsOfTwoPow(int n){
//         return n * 2;
//     }
// }