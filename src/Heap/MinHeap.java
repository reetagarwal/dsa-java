package Heap;
import java.util.*;
public class MinHeap {
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();

        public void add(int data){
            arr.add(data);

            int x=arr.size()-1;//x is my child index
            int par= (x-1)/2;

            while (arr.get(x)<arr.get(par)){
                int temp= arr.get(x);
                arr.set(x,arr.get(par));
                arr.set(par,temp);

                x=par;
                par=(x-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }

        private void heapify(int idx){
            int left=2*idx+1;
            int right=2*idx+2;
            int min=idx;

            //for leaf node:
            if(left<arr.size() && arr.get(min)> arr.get(left)){
                min=left;
            }
            if(right<arr.size() && arr.get(min)> arr.get(right)){
                min=right;
            }

            if(min!=idx){
                int temp=arr.get(idx);
                arr.set(idx,arr.get(min));
                arr.set(min,temp);

                heapify(min);
            }
        }

        public boolean isEmpty(){
            return arr.size()==0;
        }

        public int remove(){
            int data=arr.get(0);

            //swapping first and last node
            int temp=arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            //removing last index
            arr.remove(arr.size()-1);

            //heapify
            heapify(0);

            return data;
        }
    }
    public static void main(String[] args) {
        Heap h=new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
}
