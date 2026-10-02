
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      int[] arr = { 9, 4, 7, 8, 2 };
      Heap heap = new Heap();
      for (int a : arr) {
         heap.addElement(a);
      }
      heap.display();
   }
}

class Heap {
   ArrayList<Integer> heap;

   public Heap() {
      heap = new ArrayList<>();
   }

   public void addElement(int a) {
      heap.add(a);
      if (heap.size() > 1) {
         heapifyUp();
      }
   }

   public void delElement() {
      int poped = heap.removeLast();
      heap.removeFirst();
      heap.addFirst(poped);
      heapifyDown();
   }

   public void heapifyUp() {
      int child_idx = heap.size() - 1;
      int parent_idx = (child_idx - 1) / 2;
      int parent = heap.get(parent_idx);
      int child = heap.get(child_idx);
      System.out.println("parent : " + parent);
      System.out.println("child : " + child);
      while (parent_idx >= 0 && child < parent) {
         swap(child_idx, parent_idx);
         child_idx = parent_idx;
         child = heap.get(child_idx);
         parent_idx = (child_idx - 1) / 2;
         parent = heap.get(parent_idx);
         System.out.println("parent : " + parent);
         System.out.println("child : " + child);
      }
   }

   public void swap(int i, int j) {
      int par = heap.get(i);
      int chl = heap.get(j);
      heap.set(i, chl);
      heap.set(j, par);
   }

   public void heapifyDown() {

   }

   public void display() {
      System.out.println(heap);
   }
}
