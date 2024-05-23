package LinkedList.Questions;

public class RemoveDuplicates {
    public class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public void deleteDuplicates(ListNode head){

        while(head.next!=null){
            if(head.val==head.next.val){
                head.next=head.next.next;
            }
            else {
                head=head.next;
            }
        }

    }



}
