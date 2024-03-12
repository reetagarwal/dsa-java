package LINKEDLISTTTTT;

import java.util.LinkedList;

public class Blah {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(34);
    }
}


/*SINGLE LINKED LIST
not continuously allocated
every single item knows about the next item-single linked list
head and tail is used here(reference variables)
head points to the very first node and tail points to the last node
every single box(i.e.node) has a single value and address to the next variable
by default the tail points to the null
Time complexity:O(n)
whenever you want to add a new node at the end then just find the node which points to null and then add the node
 */
