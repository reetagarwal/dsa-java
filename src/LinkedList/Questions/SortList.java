package LinkedList.Questions;

public class SortList {
    public class ListNode{
        ListNode next;
        int val;
        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val,ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode sortList(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=middleNode(head);
        ListNode left=sortList(head);
        ListNode right=sortList(mid);
        return mergeTwoLists(left,right);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        temp.next=(list1!=null)?list1:list2;
        return dummy.next;
    }

    public ListNode middleNode(ListNode head) {
        ListNode midPrev=null;
        while(head!=null && head.next!=null){
            midPrev=(midPrev==null)?head:midPrev
                    .next;
            head=head.next;
        }
        ListNode mid=midPrev.next;
        midPrev.next=null;
        return mid;
    }
}
