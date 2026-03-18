
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode dummy = new ListNode(0); // Dummy node to simplify list building
        ListNode current = dummy;         // Pointer to build result list
        int carry = 0;                    // To store carry during addition

        // Loop until both lists are done and no carry is left
        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;  // Take l1's digit or 0
            int val2 = (l2 != null) ? l2.val : 0;  // Take l2's digit or 0

            int sum = val1 + val2 + carry;         // Sum current digits and carry
            carry = sum / 10;                      // Update carry
            int digit = sum % 10;                  // Get current digit to store

            current.next = new ListNode(digit);    // Add digit node to result list
            current = current.next;                // Move current forward

            if (l1 != null) l1 = l1.next;          // Move l1 to next node
            if (l2 != null) l2 = l2.next;          // Move l2 to next node
        }

        return dummy.next; // dummy head's next is the actual result list
    }
}