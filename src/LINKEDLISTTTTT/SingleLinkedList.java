package LINKEDLISTTTTT;

public class SingleLinkedList {
    private Node head;
    private Node tail;
    private int size;

    public SingleLinkedList() {
        this.size=0;
    }

    private class Node{

        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        SingleLinkedList list=new SingleLinkedList();
    }

}
