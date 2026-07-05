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
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int count = 1;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                ListNode temp = slow.next;

                while (temp != slow) {
                    count++;
                    temp = temp.next;
                }

                ListNode first = head;
                ListNode second = head;

                while (count > 0) {
                    first = first.next;
                    count--;
                }

                while (first != second) {
                    first = first.next;
                    second = second.next;
                }

                return first;
            }
        }

        return null;
    }
}
