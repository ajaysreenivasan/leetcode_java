/*
 * Given two binary trees, write a function to check if they are equal or not.
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 */
public class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        else if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        else {
            if (p.val != q.val) {
                return false;
            }

            if ((p.left == null && q.left != null) && (p.left != null && q.left == null))
                return false;
            if ((p.right == null && q.right != null) && (p.right != null && q.right == null))
                return false;

            if ((p.left != null && q.left != null) && (p.right == null && q.right == null))
                return isSameTree(p.left, q.left);
            else if ((p.left == null && q.left == null) && (p.right != null && q.right != null))
                return isSameTree(p.right, q.right);
            else
                return (isSameTree(p.left, q.left) && isSameTree(p.right, q.right));
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
