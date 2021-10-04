/*
https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
*/
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null)
            return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level;
        TreeNode curr;
        boolean rev = false;
        while(q.isEmpty() == false)
        {
            level = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i < level; i++)
            {
                curr = q.poll();
                if(rev)
                    temp.add(0, curr.val);
                else
                    temp.add(curr.val);
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
            rev = !rev;
            res.add(temp);
        }
        return res;
    }
}