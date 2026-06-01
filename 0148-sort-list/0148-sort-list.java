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

    public ListNode findMid(ListNode head){

          ListNode slow = head;
          ListNode fast = head.next;

          while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
          }

          return slow;  

    }    

    public ListNode merge(ListNode A, ListNode B){


         ListNode dummy = new ListNode(-1);
         ListNode temp = dummy;

         while(A!=null && B!=null){

            if(A.val<=B.val){
                temp.next = A;
                temp = temp.next;
                A=A.next;
            }

            else{
                temp.next = B;
                temp = temp.next;
                B=B.next;
            }
         }

         if(A!=null)
          temp.next = A;

         if(B!=null)
          temp.next = B;

          return dummy.next;    

    }


    public ListNode sortList(ListNode head) {

        if(head == null || head.next==null)
         return head;

         ListNode mid = findMid(head);

         ListNode leftH = head;
         ListNode rightH = mid.next;

         mid.next = null;

         leftH = sortList(leftH);
         rightH= sortList(rightH);

         return merge(leftH,rightH);   

    }
}