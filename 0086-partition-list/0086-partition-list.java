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
    public ListNode partition(ListNode head, int x) {

        ListNode small = new ListNode(-1);
        ListNode great = new ListNode(-1);

        ListNode sh = small;
        ListNode gh = great;

        while(head!=null){

            if(head.val<x){
             small.next = head;
             small = small.next;
            }

            else{ 
             great.next = head;
             great = great.next;
            }

            head = head.next;
        }

        great.next = null;
        small.next = gh.next;
        return sh.next;
      
    }
}