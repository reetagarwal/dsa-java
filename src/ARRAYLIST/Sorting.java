package ARRAYLIST;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(24);
        list.add(5);
        list.add(9);
        list.add(10);
        list.add(32);

        System.out.println(list);

        Collections.sort(list);//ascending order sorting
        System.out.println("After Sorting:"+list);

        //descending order
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("After sorting:"+list);
    }
}
