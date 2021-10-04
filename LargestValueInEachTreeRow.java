/*
https://leetcode.com/problems/find-largest-value-in-each-tree-row/
*/
//Iterative
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        TreeNode curr;
        int level, max;
        while(q.isEmpty() == false)
        {
            level = q.size();
            max = q.peek().val;
            for(int i = 0; i < level; i++)
            {
                curr = q.poll();
                max = Math.max(max, curr.val);
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
            res.add(max);
        }
        return res;
    }
}
//Recursive Better
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        helper(root, result, 0);
        return result;
    }
    
    private void helper(TreeNode n, List<Integer> result, int lev) {
        if(n == null)
            return;
        if(result.size() == lev)
            result.add(n.val);
        else
            result.set(lev, Math.max(result.get(lev), n.val));
        helper(n.left, result, lev+1);
        helper(n.right, result, lev+1);
    }
}