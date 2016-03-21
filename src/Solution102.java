import java.util.ArrayList;
import java.util.List;

/*
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
 * 
 * Solution: BFS and toss stuff in order into a List of Queues.
 */

public class Solution102 {
	public List<List<Integer>> levelOrder(TreeNode root) {
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

					// these additions can be shrunk to add
					// null values, but it's less efficient
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

		return levelOrder;
	}
}
