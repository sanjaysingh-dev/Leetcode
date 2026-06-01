/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode temp = head;
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null){

            slow = slow.next;
            fast = fast.next.next;

            if(fast==slow){
                while(slow!=temp){
                    slow=slow.next;
                    temp=temp.next;
                }
                return temp;
            }
        }

        return null; 
        
    }
}