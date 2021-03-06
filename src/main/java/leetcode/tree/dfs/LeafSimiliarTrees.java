package leetcode.tree.dfs;

import baseObj.TreeNode;
import leetcode.tag.company.Google;
import leetcode.tag.level.Easy;
import leetcode.tag.type.DFS;

import java.util.ArrayList;
import java.util.List;

/**
 * 872. Leaf-Similar Trees
 Easy

 295

 15

 Favorite

 Share
 Consider all the leaves of a binary tree.  From left to right order, the values of those leaves form a leaf value sequence.



 For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).

 Two binary trees are considered leaf-similar if their leaf value sequence is the same.

 Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.
           3
         /   \
        5     1
      / |     |  \
     6  2     9   8
       / \
      7  4

 Note:

 Both of the given trees will have between 1 and 100 nodes.

 */

@Google

@DFS
@Easy
public class LeafSimiliarTrees {


	public static boolean leafSimilar(TreeNode root, TreeNode root2) {
		List<Integer> l1 = new ArrayList<>();
		List<Integer> l2 = new ArrayList<>();

		build(root, l1);
		build(root2, l2);

		if (l1.size() != l2.size()) return false;
		for (int i = 0; i<l1.size(); i++) {
			if (l1.get(i) != l2.get(i)) return false;
		}
		return true;
	}

	public static void build(TreeNode root, List<Integer> list) {
		if (root == null) return;
		if (root.left == null && root.right == null) {
			list.add(root.value);
			return;
		}

		build(root.left, list);
		build(root.right, list);
	}

	public static void main(String[] args) {
		leafSimilar(new TreeNode(1), new TreeNode(2));
	}

}
