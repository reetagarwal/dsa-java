package LinkedList;

import java.util.LinkedList;

public class Framework {
    public static void main(String[] args) {
        //create-objects int,float,boolean->Integer,Float,Character
        LinkedList<Integer> ll=new LinkedList<>();

        ll.addLast(1);
        ll.addLast(1);
        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
