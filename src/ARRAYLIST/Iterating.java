package ARRAYLIST;

import java.util.ArrayList;
import java.util.Scanner;

public class Iterating {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(2);

        //iterating
        //input
        for(int i=0;i<5;i++){
            list.add(in.nextInt());
        }

        //get item at any index
        for(int i=0;i<5;i++){
            System.out.print(list.get(i)+" ");//pass index here , list[index] syntax won't work here
        }
        System.out.println();
        System.out.println(list.size());

    }
}
