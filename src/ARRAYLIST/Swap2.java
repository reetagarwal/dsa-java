package ARRAYLIST;

import java.util.ArrayList;

public class Swap2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(24);
        list.add(5);
        list.add(9);
        list.add(10);
        list.add(32);
        System.out.println(list);
        swap(list,1,3);
        System.out.println("After swapping:"+list);
    }
    public static void swap(ArrayList<Integer> list,int index1,int index2){
        int temp=list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2,temp);
    }
}
