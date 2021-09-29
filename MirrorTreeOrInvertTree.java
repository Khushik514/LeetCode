/*
https://leetcode.com/problems/invert-binary-tree/
*/
class Solution {
    public TreeNode invertTree(TreeNode root) {
        /*
        Recursive Solution
        if(root == null)
            return null;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        
        root.left = right;
        root.right = left;
        return root;
        */
        if(root == null)
            return null;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode curr;
        TreeNode temp;
        while(q.isEmpty() == false)
        {
            curr = q.remove();
            temp = curr.left;
            curr.left = curr.right;
            curr.right = temp;
            if(curr.left != null)
                q.add(curr.left);
            if(curr.right !=null)
                q.add(curr.right);
        }
        return root;
    }
}