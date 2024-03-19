package LinkedList;

public class DoubleLinkedList {
        public class Node{
            int data;
            Node next;
            Node prev;

            public Node(int data) {
                this.data = data;
                this.next=null;
                this.prev=null;
            }
        }

    public static Node head;
    public static Node tail;
    public static int size;

    public void add_beg(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }

    public void delete_beg(){
        if(head==null){
            System.out.println("empty");
        }
        if(head.next==null){
            head=tail=null;
            size--;
            return;
        }
        head=head.next;
        head.prev=null;
        size--;
    }

    public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoubleLinkedList dll=new DoubleLinkedList();
        dll.add_beg(2);
        dll.add_beg(5);
        dll.add_beg(8);
        dll.display();
        System.out.println(dll.size);
        dll.delete_beg();
        dll.display();
        System.out.println(dll.size);
        dll.reverse();
        dll.display();
    }
}
