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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode tptr=head;

        
        while(tptr!=null&& tptr.next!=null){
            if( tptr.val==tptr.next.val)
                tptr.next=tptr.next.next;
            else
                tptr=tptr.next;

        }
        return head;
    }
}