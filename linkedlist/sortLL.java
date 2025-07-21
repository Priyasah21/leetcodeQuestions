class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode sortList(ListNode head) {
        // Base case: if list is empty or has only one element, it's already sorted
        if (head == null || head.next == null) {
            return head;
        }

        // Step 1. Cut the list into two halves
        ListNode mid = getMiddle(head);
        ListNode rightHead = mid.next;
        mid.next = null; // Split the list into two halves

        // Step 2. Sort both halves recursively
        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);

        // Step 3. Merge the sorted halves
        return merge(left, right);
    }

    // Helper function to find the middle of the list using slow and fast pointers
    private ListNode getMiddle(ListNode head) {
        ListNode slow = head, fast = head.next; // start fast at next to get left middle for even length

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Helper function to merge two sorted lists
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        // Append the remaining nodes
        curr.next = (l1 != null) ? l1 : l2;

        return dummy.next;
    }
}
