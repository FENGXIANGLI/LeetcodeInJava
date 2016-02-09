/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// Assume that we have linked list 1 → 2 → 3 → Ø, we would like to change it to Ø ← 1 ← 2 ← 3.
// iterative
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode begin = head;
        while (begin != null) {
        	
        	ListNode nextNode = begin.next;
        	begin.next = prev;
        	prev = begin;
        	begin = nextNode;
        }
        return prev;
    }
}

// recursive
public class Solution {
    public ListNode reverseList(ListNode head) {
       if (head == null || head.next == null) {
       		return head;
       }
       ListNode pNext = reverseList(head.next);
       head.next.next = head;
       head.next = null;
       return pNext;
    }
}