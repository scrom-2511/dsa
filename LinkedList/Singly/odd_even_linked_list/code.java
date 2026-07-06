// https://leetcode.com/problems/odd-even-linked-list/
// https://takeuforward.org/data-structure/segregate-even-and-odd-nodes-in-linkedlist

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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode odd = head;
        ListNode even = head.next;
        ListNode atEven = even;
        ListNode temp = even.next;

        int cnt = 3;

        while(temp != null) {
            if(cnt % 2 != 0) {
                odd.next = temp;
                odd = odd.next;
            } else {
                even.next = temp;
                even = even.next;
            }

            temp = temp.next;
            cnt++;
        }

        even.next = null;
        odd.next = atEven;

        return head;
    }
}
