/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        if(head==null)
         return null;

        Node curr = head;

        while(curr!=null){
            Node nn = new Node(curr.val);
            nn.next = curr.next;
            curr.next = nn;
            curr = nn.next;
        }

        curr = head;
        Node temp = curr.next;

        while(curr!=null){

            if(curr.random!=null)
             temp.random = curr.random.next;

            curr = curr.next.next;

            if(temp.next!=null)
              temp = temp.next.next; 
        }

        curr = head;
        temp = curr.next;
        Node ans = temp;

        while(curr!=null){
            curr.next = curr.next.next;

            if(temp.next!=null)
            temp.next = temp.next.next;

            curr = curr.next;
            temp = temp.next;
        }

        return ans;
        
    }
}