/*
 * Given a binary tree, determine if it is height-balanced.
 * For this problem, a height-balanced binary tree is defined 
 * as a binary tree in which the depth of the two subtrees 
 * of every node never differ by more than 1.
 * 
 * Solution: This should be (maxDepth - minDepth <= 1) but FOR THIS PROBELEM ONLY
 * height-balanced is defined differently (ie. depth(left) - depth(right) <= 1)
 */

public class Solution110 {
	public boolean isBalanced(TreeNode root) {
		if (root == null)
			return true;

		if (Math.abs(depth(root.left) - depth(root.right)) > 1)
			return false;

		return (isBalanced(root.left) && isBalanced(root.right));
	}

	private int depth(TreeNode root) {
		if (root == null) {
			return 0;
		}

		if (root.left != null && root.right == null) {
			return 1 + depth(root.left);
		} else if (root.left == null && root.right != null) {
			return 1 + depth(root.right);
		} else {
			return 1 + Math.max(depth(root.left), depth(root.right));
		}
	}
}
