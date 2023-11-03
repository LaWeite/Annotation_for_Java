/*
Given a binary tree, find its minimum depth.
The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
*/

//BFS
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null)
            return 0;
        //represents number of levels
        int depth =1;
        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        while(!nodes.isEmpty()){
            int size = nodes.size();
            for(int i =0; i< size; i++){
                TreeNode current = nodes.poll();
                //If it's a leaf node return that depth
                if (current.left == null && current.right == null)
                    return depth;
                if(current.left != null)
                    nodes.add(current.left);
                if(current.right != null)
                    nodes.add(current.right);
            }
            depth++;
        }
        return depth;
    }
}
