/*
 * Maximum depth of BST
 */

public class Solution104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }
        else if (root.left == null && root.right != null) {
            return 1 + maxDepth(root.right);
        }
        else if (root.right == null && root.left != null) {
            return 1 + maxDepth(root.left);
        }
        else {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        }
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
