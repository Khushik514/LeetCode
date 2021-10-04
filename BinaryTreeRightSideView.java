/*
https://leetcode.com/problems/binary-tree-right-side-view/
*/
//Iterative
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        int level;
        TreeNode curr;
        int value = 0;
        while(q.isEmpty() == false)
        {
            level = q.size();
            for(int i = 0; i < level; i++)
            {
                curr = q.poll();
                value = curr.val;
                if(curr.left != null)
                    q.add(curr.left);
                if(curr.right != null)
                    q.add(curr.right);
            }
            res.add(value);
        }
        return res;
    }
}
//Better
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        rightView(root, result, 0);
        return result;
    }
    
    public void rightView(TreeNode curr, List<Integer> result, int currDepth){
        if(curr == null){
            return;
        }
        if(currDepth == result.size()){
            result.add(curr.val);
        }
        
        rightView(curr.right, result, currDepth + 1);
        rightView(curr.left, result, currDepth + 1);
        
    }
}