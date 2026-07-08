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
class logic implements Comparator<ListNode>{

    public int compare(ListNode a, ListNode b){

        if(a.val<b.val)
         return -1;

        else if(b.val<a.val)
         return 1;

        else
         return 0;  
    }
}


class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        int N = lists.length;

        PriorityQueue<ListNode> pq = new PriorityQueue<>(new logic());

        for(int i=0;i<N;i++){
         if(lists[i]!=null)
            pq.offer(lists[i]);
        }

         ListNode dummy = new ListNode(-1);
         ListNode temp = dummy;

         while(!pq.isEmpty()){

            ListNode rem = pq.poll();

            temp.next = rem;
            temp = temp.next;

            if(rem.next!=null)
             pq.offer(rem.next);
         }

         return dummy.next;
        
    }
}