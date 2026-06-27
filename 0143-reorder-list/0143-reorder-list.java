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
    public void reorderList(ListNode head) {

        if(head == null || head.next == null)
         return;

         ListNode slow = head;
         ListNode fast = head;

         while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
         } 

         ListNode h2 = slow.next;
         slow.next = null;

         ListNode curr = h2;
         ListNode prev = null;

         while(curr!=null){
            ListNode forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
         }

         h2 = prev;
         ListNode h1 = head;

         while(h2!=null){

            ListNode forw1 = h1.next;
            ListNode forw2 = h2.next;

            h1.next = h2;
            h2.next = forw1;

            h1 = forw1;
            h2 = forw2;
         }
        
    }
}