/*
https://leetcode.com/problems/binary-tree-maximum-path-sum/
*/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max;
    public int maxPathSum(TreeNode root) {
        if(root == null)
            return 0;
        max = root.val;
        maxPath(root);
        return max;
    }
    int maxPath(TreeNode root)
    {
        if(root == null)
            return 0;
        int left = Math.max(0, maxPath(root.left));
        int right = Math.max(0, maxPath(root.right));
        max = Math.max(max, left + right + root.val);
        return root.val + Math.max(left, right);
    }
}