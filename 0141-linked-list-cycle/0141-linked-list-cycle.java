/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
   
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        ListNode ft=head;
        ListNode sl=head;
        while(ft.next!=null && ft.next.next!=null){
            sl=sl.next;
            ft=ft.next.next;
            if(sl==ft)
            return true;
        }
        return false;

    }
}