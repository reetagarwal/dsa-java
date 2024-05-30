package Heap;
import java.util.*;

public class PQ {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());//now it will print in decreasing order
        //5 3 1
        pq.add(1);//o(logn)
        pq.add(5);
        pq.add(3);
        while (!pq.isEmpty()){
            System.out.println(pq.peek());//o(1)
            pq.remove();//o(logn)
        }

    }
}
