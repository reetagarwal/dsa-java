package LinkedList.Questions;

import java.util.List;

public class LLCycle2 {
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
        public ListNode detectCycle(ListNode head){
            int length=0;
            ListNode fast=head;
            ListNode slow=head;
            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
                if(slow==fast){
                   length=lengthCycle(slow);
                   break;
                }
            }
            if(length==0){
                return null;
            }
            //find start node
            ListNode f=head;
            ListNode s=head;
            while(length>0){
                s=s.next;
                length--;
            }
            //keep moving both forward and they will meet at start
            while(f!=s){
                f=f.next;
                s=s.next;
            }
            return s;
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
