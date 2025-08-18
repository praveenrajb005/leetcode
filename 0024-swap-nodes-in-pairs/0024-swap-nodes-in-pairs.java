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
    public ListNode swapPairs(ListNode head) {
        ListNode dum=new ListNode(0,head);
        ListNode pre=dum;
        while(pre.next!=null&&pre.next.next!=null){
            ListNode f=pre.next;
            ListNode s=pre.next.next;
            f.next=s.next;
            s.next=f;
            pre.next=s;
            pre=f;
        }
        
     return dum.next;   
    }
}