class Solution {
    public void deleteNode(ListNode node) {
       node.val=node.next;
       node.next=node.next;
    }
}
