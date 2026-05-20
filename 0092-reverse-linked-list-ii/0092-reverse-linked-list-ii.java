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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head == null || left==right)
         return head;

        ListNode curr = head;
        ListNode prev = null;

        int i =1; 

        while(i<left){
            prev = curr;
            curr = curr.next;
            i++;
        }

        ListNode leftPart = prev;
        ListNode reversedTail = curr;

        while(i<=right){
            ListNode forw = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forw;
            i++;
        }

        if(leftPart!=null)
         leftPart.next = prev;

        else 
         head = prev;

        reversedTail.next = curr;

        return head;  
        
    }
}