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
    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode curr = head;
        ListNode prev = null;
        ListNode forw = null;

        int i =0;

        ListNode temp = head;

        while(temp!=null){
            temp = temp.next;
            i++;
        }

        if(i<k)
         return head;

         i=0;

        while(curr!=null && i<k){
            forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
            i++;
        }

        if(forw!=null)
         head.next = reverseKGroup(forw,k);

         return prev;
        
    }
}