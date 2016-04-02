/*
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values.
 * (ie, from left to right, level by level from leaf to root).
 */

import java.util.ArrayList;
import java.util.List;

public class Solution107 {
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> levelOrder = new ArrayList<List<Integer>>();

		if (root != null) {
			List<TreeNode> bfsQueue = new ArrayList<>();
			bfsQueue.add(root);

			List<Integer> currLevelValues = new ArrayList<>();
			int currLevelNodeCount = 1;
			int nextLevelNodeCount = 0;

			while (!bfsQueue.isEmpty()) {
				TreeNode curNode = bfsQueue.remove(0);
				currLevelNodeCount -= 1;

				if (curNode != null) {
					currLevelValues.add(curNode.val);
					if (curNode.left != null) {
						bfsQueue.add(curNode.left);
						nextLevelNodeCount += 1;
					}
					if (curNode.right != null) {
						bfsQueue.add(curNode.right);
						nextLevelNodeCount += 1;
					}
				}
				if (currLevelNodeCount == 0) {
					if (!currLevelValues.isEmpty()) {
						levelOrder.add(currLevelValues);
					}
					currLevelValues = new ArrayList<>();
					currLevelNodeCount = nextLevelNodeCount;
					nextLevelNodeCount = 0;
				}
			}
		}

		List<List<Integer>> reverseLevelOrder = new ArrayList<List<Integer>>();
		for (int i = levelOrder.size() - 1; i >= 0; i--) {
			reverseLevelOrder.add(levelOrder.get(i));
		}

		return reverseLevelOrder;
	}
}
