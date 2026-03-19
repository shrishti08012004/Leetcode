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
class Solution {
    public ListNode removeNodes(ListNode head) {

        // Step 1: reverse the list
        head = reverse(head);

        // Step 2: keep max and remove smaller nodes
        int max = head.val;
        ListNode curr = head;

        while(curr != null && curr.next != null){

            if(curr.next.val < max){
                curr.next = curr.next.next; // remove node
            }
            else{
                curr = curr.next;
                max = curr.val;
            }
        }

        // Step 3: reverse again
        return reverse(head);
    }

    // reverse function
    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}


// class Solution {
//     public ListNode removeNodes(ListNode head) {

//         Stack<ListNode> st = new Stack<>();

//         ListNode temp = head;

//         // Step 1: Process nodes using stack
//         while(temp != null){

//             while(!st.isEmpty() && st.peek().val < temp.val){
//                 st.pop();
//             }

//             st.push(temp);
//             temp = temp.next;
//         }

//         // Step 2: Rebuild linked list
//         ListNode newHead = null;

//         while(!st.isEmpty()){
//             ListNode node = st.pop();
//             node.next = newHead;
//             newHead = node;
//         }

//         return newHead;
//     }
// }