package LinkedList;

import java.util.LinkedList;

public class SingleLinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void add_beg(int data){//O(n)-constant time operation
        Node newNode=new Node(data);//step1-creation of new node
        size++;
        if(head==null){
           head=tail=newNode;
           return;
        }
        newNode.next=head;//step2;linking
        head=newNode;//step3
    }

    public void add_end(int data){//O(n)-constant time operation
        Node newNode=new Node(data);//step1-creation of new node
        size++;
        if(head ==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void add_pos(int index,int data){//O(n)-since we need to find the index so that takes time
        if(index==0){
            add_beg(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp=head;
        int i=0;//to track temp is at which index
        while(i<index-1){
            temp=temp.next;
            i++;
        }
        //i=index-1;temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }

    public void delete_beg(){//this just deletes the head node
        if(head==null){
            System.out.println("Nothing to delete");
            return;
        }
        if(head.next==null){
            head=tail=null;
            size=0;
        }
        else{
            head=head.next;
            size--;
        }
    }

    public int delete_first(){//this deletes the node and as well as return the value that you are deleting
        if(head==null){
            System.out.println("linked list is empty");
            return Integer.MIN_VALUE;
        }
        if(head.next==null){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }

//    public void delete_end(){//this deletes the last node simply
//        if(head==null){
//            System.out.println("Linked list is empty");
//            return;
//        }
//        if(head.next==null){
//            head=tail=null;
//            size=0;
//            return;
//        }
//        else{
//            Node t=head;
//            while(t.next.next==null){
//                t=t.next;
//            }
//            t.next=null;
//            t=t.next;
//        }
//    }

    public int delete_last(){//this deletes the node and as well as returns the value that you are deleting
        if(head==null){//if(size==0)
            System.out.println("List is empty");
            return Integer.MIN_VALUE;
        }
        if(head.next==null){//case where there's only a single node
            int val=head.data;
            head=tail=null;
            //size=0;
            return val;
        }
        //prev:i=size-2
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val=prev.next.data;//tail.data
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    //find and remove nth node from end-very imp for interviews
    public void deleteNthFromEnd(int n){
        //calculate size:since in competitions we need to calculate the size ourself
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;//traversing
            size++;
        }
        if(n==size){//this is the corner case for deleting head
            head=head.next;//remove first(removing head)
            return;
        }
        int i=1;
        Node prev=head;
        while(i < (size - n)){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    public void search(int ele){
        Node temp=head;
        while(temp.data!=ele && temp.next!=null){
            temp=temp.next;
        }
        if(temp.data==ele){
            System.out.println("element is present");
        }
        if(temp.data!=ele){
            System.out.println("element is not present");
        }
    }

    public int itrSearch(int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){//key found
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;//key not found
    }

    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int index=helper(head.next,key);
        if(index==-1){
            return -1;
        }
        return index+1;
    }
    public int recSearch(int key){//searching using recursion
        return helper(head,key);
    }

    public void reverse(){
        Node t1=head;
        Node t2=t1.next;
        Node t3=t2.next;
        t1.next=null;
        t2.next=t1;
        while(t3!=null){
            t1=t2;
            t2=t3;
            t3=t3.next;
            t2.next=t1;
        }
        head=t2;
    }

    public void reversee2(){
        Node prev=null;
        Node curr=tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public Node findMid(Node head){//slow-fast approach or turtle-hare approach
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){//even and odd condition
            slow=slow.next;//+1
            fast=fast.next.next;//+2
        }
        return slow;//slow is my middle node
    }

    public boolean palindrome(){//will return true or false
        if(head==null || head.next==null){//corner case or base case
            return true;
        }
        Node midNode=findMid(head);
        Node prev=null;
        Node current=midNode;//node current = slow
        Node next;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        Node right=prev;//right half ka head
        Node left=head;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public static boolean Cycledetect(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){
        Node slow=head;
        Node fast=head;
        boolean flag=false;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                flag=true;
                break;
            }
        }

        if(flag==false){
            return;
        }

        //meeting point
        slow=head;
        Node prev=null;//last node
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }

        prev.next=null;
    }

    private Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node mid=getMid(head);

        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);

        return merge(newLeft,newRight);
    }
    private Node merge(Node head1,Node head2){
        Node mergedLl=new Node(-1);
        Node temp=mergedLl;

        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        return mergedLl.next;
    }

    public void zigZag(){
        //s1-finding mid
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid=slow;

        //s2-reversing the second half
        Node curr=mid.next;
        mid.next=null;//to break it into parts so that both are pointing towards null
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        Node nextL,nextR;

        //s3-alternate merging
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;
            left=nextL;//updating
            right=nextR;//updating
        }
    }

    public void display(){
        Node temp=head;
        if(head==null){
            System.out.println("Empty,there's nothing to display");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
//       SingleLinkedList ll=new SingleLinkedList();
//       ll.add_beg(2);
//       ll.add_beg(1);
////       ll.add_end(3);
////       ll.add_end(4);
////       ll.add_pos(2,7);
//        System.out.println(ll.palindrome());
//       ll.display();
//       ll.delete_beg();
////     ll.delete_end();
//       ll.delete_last();
//       ll.search(2);
//       System.out.println(ll.itrSearch(10));
//        System.out.println(ll.recSearch(10));
//        ll.display();
//        ll.reverse();
//       ll.display();
//       ll.deleteNthFromEnd(3);
//       ll.display();
//     System.out.println(ll.size);

        //for cycle wala
//        head=new Node(1);
//        Node temp=new Node(3);
//        head.next=temp;
//        head.next.next=new Node(3);
//        head.next.next.next=temp;
//        System.out.println(Cycledetect());
//        removeCycle();
//        System.out.println(Cycledetect());



        SingleLinkedList ll=new SingleLinkedList();
        ll.add_beg(1);
        ll.add_beg(2);
        ll.add_beg(3);
        ll.add_beg(4);
        ll.add_beg(5);
        ll.display();
        ll.head=ll.mergeSort(ll.head);
        ll.display();



    }
}


/*Palindrome steps:
first find mid-node(turtle-hare technique/slow-fast technique)
then 2nd half reverse
and then check if first half = second half
 */