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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1 = list1;
        ListNode head2 = list2;

        ListNode current1 = head1;
        ListNode current2 = head2;

        ListNode twoLists = new ListNode(-1);
        ListNode current = twoLists;

        while(current1 != null){

            if( current2 == null || current1.val < current2.val ){
                current.next  = current1;
                current = current.next;
                current1 = current1.next;
            }else{
                current.next  = current2;
                current = current.next;
                current2 = current2.next;
            }
        } 
   

        while(current2 != null){
            current.next  = current2;
            current = current.next;
            current2 = current2.next;
        }

        return twoLists.next;
    }
}