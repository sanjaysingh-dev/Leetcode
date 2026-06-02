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
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next==null || k==0)
          return head;

          int sz = 1;
          ListNode tail = head;

          while(tail.next!=null){
            tail = tail.next;
            sz++;
          }

          if(k%sz==0)
            return head;

          k = k%sz;  

        tail.next = head;

        ListNode temp = head;
        int i = 1;
        int target = sz-k;

        while(i<target && temp.next!=null){
            temp = temp.next;
            i++;
        } 

        head = temp.next;
        temp.next = null;

        return head;

    }
}