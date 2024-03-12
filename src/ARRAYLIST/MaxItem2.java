package ARRAYLIST;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxItem2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(20);
        list.add(30);
        int max=Integer.MIN_VALUE;
        for(int i=0;i< list.size();i++){
            if(max< list.get(i)){
                max= list.get(i);
            }
            //max=Math.max(max, list.get(i));
        }
        System.out.println(max);
    }
}
