/*
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
 * According to the definition of LCA on Wikipedia: 
 * “The lowest common ancestor is defined between two nodes v and w as the lowest node 
 * in T that has both v and w as descendants (where we allow a node to be a descendant of itself).” 
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution235 {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		TreeNode cursor = root;
		TreeNode lowestCommonAncestor = null;

		while (lowestCommonAncestor == null) {
			if (cursor.val < p.val && cursor.val < q.val) {
				cursor = cursor.right;
			} else if (cursor.val > p.val && cursor.val > q.val) {
				cursor = cursor.left;
			} else {
				lowestCommonAncestor = cursor;
			}
		}

		return lowestCommonAncestor;
	}
}