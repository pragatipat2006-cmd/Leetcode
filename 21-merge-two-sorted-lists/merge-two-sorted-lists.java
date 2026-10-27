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
// class Solution {
//     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

//         if(list1 == null)
//             return list2;

//         if(list2 == null)
//             return list1;

//         ListNode trav1 = list1;

//         while(trav1.next != null) {
//             trav1 = trav1.next;
//         }

//         trav1.next = list2;

//         // Sort the merged list using bubble sort
//         boolean swapped;

//         do {
//             swapped = false;
//             ListNode trav2 = list1;

//             while(trav2 != null && trav2.next != null) {
//                 if(trav2.val > trav2.next.val) {
//                     int temp = trav2.val;
//                     trav2.val = trav2.next.val;
//                     trav2.next.val = temp;

//                     swapped = true;
//                 }

//                 trav2 = trav2.next;
//             }
//         } while(swapped);

//         return list1;
//     }
// }

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }

            curr = curr.next;
        }

        if(list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }

        return dummy.next;
    }
}