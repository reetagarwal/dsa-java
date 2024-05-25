package LinkedList.Questions;

import java.util.List;

public class ReverseLL2 {
    public class ListNode{
        ListNode next;
        int val;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val=val;
        }

        public ListNode(ListNode next, int val) {
            this.next = next;
            this.val = val;
        }
    }
    public ListNode reverseBetween(ListNode head,int left,int right){
        if(left==right){
            return head;
        }
        //skip th first left-1 nodes
        ListNode curr=head;
        ListNode prev=null;
        for (int i=0;curr!=null && i<left-1;i++){
            prev=curr;
            curr=curr.next;
        }
        ListNode last=prev;
        ListNode newEnd=curr;

        //reverse between left and right
        ListNode next=curr.next;
        for(int i=0;curr!=null && i<right-left+1;i++){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null){
                next=next.next;
            }
        }
        if(last!=null){
            last.next=prev;
        }

        else {
            head=prev;
        }
        newEnd.next=curr;
        return head;
    }

}
