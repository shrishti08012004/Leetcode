/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 //BRUTE FORCE
// class Solution {
//     public ListNode swapPairs(ListNode head) {

//         ListNode temp = head;

//         while(temp != null && temp.next != null){

//             int t = temp.val;
//             temp.val = temp.next.val;
//             temp.next.val = t;

//             temp = temp.next.next;
//         }

//         return head;
//     }
// }

//OPTIMAL
class Solution {
    public ListNode swapPairs(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while(prev.next != null && prev.next.next != null){

            ListNode first = prev.next;
            ListNode second = prev.next.next;

            first.next = second.next;
            second.next = first;
            prev.next = second;

            prev = first;
        }

        return dummy.next;
    }
}