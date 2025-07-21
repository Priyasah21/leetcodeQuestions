class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyNode= new ListNode(-1);
        ListNode curr=dummyNode;

        ListNode temp1=l1;
        ListNode temp2=l2;

        int carry =0;
        while(temp1!=null || temp2!=null  || carry!=0){
              int val1 = (temp1 != null) ? temp1.val : 0;
            int val2 = (temp2 != null) ? temp2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;
            int digit = sum % 10;

            curr.next = new ListNode(digit);
            curr = curr.next;

            if (temp1 != null) temp1 = temp1.next;
            if (temp2 != null) temp2 = temp2.next;



        }
      
        return dummyNode.next;
    }
}
