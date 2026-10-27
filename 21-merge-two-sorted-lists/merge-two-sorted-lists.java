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

        if(list1 == null)
            return list2;

        if(list2 == null)
            return list1;

        ListNode trav1 = list1;

        while(trav1.next != null) {
            trav1 = trav1.next;
        }

        trav1.next = list2;

        // Sort the merged list using bubble sort
        boolean swapped;

        do {
            swapped = false;
            ListNode trav2 = list1;

            while(trav2 != null && trav2.next != null) {
                if(trav2.val > trav2.next.val) {
                    int temp = trav2.val;
                    trav2.val = trav2.next.val;
                    trav2.next.val = temp;

                    swapped = true;
                }

                trav2 = trav2.next;
            }
        } while(swapped);

        return list1;
    }
}