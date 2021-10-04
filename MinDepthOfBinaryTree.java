/*
https://leetcode.com/problems/minimum-depth-of-binary-tree/
*/
//Recursive Solution
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(left == 0 || right == 0)
            return 1 + left + right;
        else
            return 1 + Math.min(left, right);
        
    }
}
//Iterative Solution
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        int depth = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level;
        TreeNode curr;
        while(q.isEmpty() == false)
        {
            level = q.size();
            for(int i = 0; i < level; i++)
            {
                curr = q.poll();
                if(curr.left == null && curr.right == null)
                    return depth;
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
            depth++;
        }
        return depth;
    }
}