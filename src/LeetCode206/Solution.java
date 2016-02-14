package LeetCode206;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

// Assume that we have linked list 1 鈫� 2 鈫� 3 鈫� 脴, we would like to change it to 脴 鈫� 1 鈫� 2 鈫� 3.
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