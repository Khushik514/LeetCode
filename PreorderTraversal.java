/*
https://leetcode.com/problems/binary-tree-preorder-traversal/
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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        while(curr != null || st.isEmpty() == false)
        {
            if(curr == null)
                curr = st.pop();
            res.add(curr.val);
            if(curr.right != null)
                st.push(curr.right);
            curr = curr.left;
        }
        return res;
    }
}