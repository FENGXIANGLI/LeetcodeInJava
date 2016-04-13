package LeetCode206;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// iterative
//Assume that we have linked list 1 → 2 → 3 → Ø, we would like to change it to Ø ← 1 ← 2 ← 3.
public class Solution {
    public ListNode reverseList(ListNode head) {
    	ListNode prev = null;
    	ListNode cur = head;
    	while (cur != null) {
			ListNode next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
    	return prev;
    }
}

// recursive
//public class Solution {
//    public ListNode reverseList(ListNode head) {
//       if (head == null || head.next == null) {
//       		return head;
//       }
//       ListNode pNext = reverseList(head.next);
//       head.next.next = head;
//       head.next = null;
//       return pNext;
//    }
//}