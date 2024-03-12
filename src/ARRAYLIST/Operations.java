package ARRAYLIST;

import java.util.ArrayList;

public class Operations {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(2);


        //size doesn't matter , more than the capacity added
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.add(1,50);
        System.out.println(list);

        int ele=list.get(2);
        System.out.println(ele);

        list.remove(1);//to remove a particular index
        System.out.println(list);

        list.set(0,99);//to replace a particular value
        System.out.println(list);

        System.out.println(list.contains(20));//to check if any specific entry is there or not




    }
}
