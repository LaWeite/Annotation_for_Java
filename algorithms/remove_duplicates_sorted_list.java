/*
Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
*/

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
       if (head != null && head.next != null) {
            if (head.val != head.next.val) {
                head.next = deleteDuplicates(head.next);
            }
            else {
                head = deleteDuplicates(head.next);
            }
        }

        return head; 
    }
}
