import java.util.Deque;
import java.util.LinkedList;

class Node {
   int value;
   Node left;
   Node right;

   Node(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
   }
}

public class Main {
   public static void main(String[] args) {

      Node root = new Node(10);

      root.left = new Node(5);
      root.right = new Node(15);

      root.left.left = new Node(2);
      root.left.right = new Node(7);

      root.right.left = new Node(12);
      root.right.right = new Node(20);

      inOrder(root);
      System.out.println();
      preOrder(root);
      System.out.println();
      postOrder(root);
      System.out.println();
      bfs(root);

   }

   public static void inOrder(Node root) {
      if (root == null)
         return;
      inOrder(root.left);
      System.out.print(root.value + " ");
      inOrder(root.right);
   }

   public static void preOrder(Node root) {
      if (root == null)
         return;
      System.out.print(root.value + " ");
      preOrder(root.left);
      preOrder(root.right);
   }

   public static void postOrder(Node root) {
      if (root == null)
         return;
      postOrder(root.left);
      postOrder(root.right);
      System.out.print(root.value + " ");
   }

   public static void bfs(Node root) {
      Deque<Node> dq = new LinkedList<>();
      dq.add(root);
      while (!dq.isEmpty()) {
         Node poped = dq.removeFirst();
         if (poped.left != null) {
            dq.addLast(poped.left);
         }
         if (poped.right != null) {
            dq.addLast(poped.right);
         }
         System.out.print(poped.value + " ");
      }
   }
}