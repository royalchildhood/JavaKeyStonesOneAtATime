package leetcode.tree;

import baseObj.TreeNode;
import leetcode.tag.company.Facebook;
import leetcode.tag.level.Easy;
import leetcode.tag.type.BinarySearch;
import leetcode.tag.type.Tree;

/**
 * Given a non-empty binary search tree and a target value, find the value in the BST that is closest to the target.
 *
 * Note:
 *
 * Given target value is a floating point.
 * You are guaranteed to have only one unique value in the BST that is closest to the target.
 * Example:
 *
 * Input: root = [4,2,5,1,3], target = 3.714286
 *
 *     4
 *    / \
 *   2   5
 *  / \
 * 1   3
 *
 * Output: 4
 */

@Facebook

@Easy
@BinarySearch
@Tree
public class ClosestBinarySearchTreeValue {

    /**
     * Not hard as a tree problem, key is to handle the last visited node
     *
     * Difference is really between > 0.5 or < 0.5 to select the close
     */
    public int closestValue(TreeNode root, double target) {

        int lastCache = root.value;

        while (root != null) {
            if (Math.abs(target - root.value) < Math.abs(target - lastCache)) {
                // update cache
                lastCache = root.value;

                // optimized with condition check, check if the diff is under 0.5
                if (Math.abs(target - root.value) <= 0.5)
                    break;
            }

            if (root.value > target) {
                root = root.left;
            } else {
                root = root.right;
            }
        }

        return lastCache;
    }
}
