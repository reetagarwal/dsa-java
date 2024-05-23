package LinkedList.Questions;

public class LengthofCycle {
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

        public int lengthCycle(ListNode head){
            ListNode slow=head;
            ListNode fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast){
                    //calculate length
                    ListNode temp=slow;
                    int length=0;
                    do{
                        temp=temp.next;
                        length++;
                    }while (temp!=slow);
                    return length;
                }
            }
            return 0;
        }
    }
}
