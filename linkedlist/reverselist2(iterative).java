class Solution {
    public ListNode reverseList(ListNode head) {
      //recursive method
        if(head==null|| head.next==null){
            return head;
        }
       ListNode newHead=reverseList(head.next);
       ListNode front=head.next;
       front.next=head;
       head.next=null;
       return newHead;
    }
}
