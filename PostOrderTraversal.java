/*
https://leetcode.com/problems/binary-tree-postorder-traversal/
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        TreeNode curr;
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while(st.isEmpty() == false)
        {
            curr = st.pop();
            res.add(0, curr.val);
            if(curr.left != null)
                st.push(curr.left);
            if(curr.right != null)
                st.push(curr.right);
        }
        return res;
    }
}