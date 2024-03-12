package LinkedList;

import java.util.LinkedList;

public class linkedlist1 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;

    //Methods


    public static void main(String[] args) {
        linkedlist1 ll = new linkedlist1();
//        ll.head = new Node(1);
//        ll.head.next = new Node(1);
    }
}
