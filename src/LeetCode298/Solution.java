package LeetCode298;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
	private int maxLength = 0;
	public int longestConsecutive(TreeNode root) {
		dfs(root, null, 0);
		return maxLength;
	}

	public void dfs(TreeNode currentNode, TreeNode parentNode, int length) {
		if (currentNode == null) {
			return;
		}
		length = (parentNode != null && currentNode.val == parentNode.val + 1  ) ? length + 1: 1;
		maxLength = Math.max(length, maxLength);
		dfs(currentNode.left, currentNode, length);
		dfs(currentNode.right, currentNode, length);
	}
}
