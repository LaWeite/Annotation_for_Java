/*
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
*/

class Solution {
    public class TreeNode {
       int val;
       TreeNode left;
       TreeNode right;
       TreeNode() {}
       TreeNode(int val) { this.val = val; }
       TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;            
        }

        return isSame(root.left, root.right);
    }

    public static boolean isSame(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }
        
        return left.val == right.val && isSame(left.left, right.right) && isSame(left.right, right.left);
    }
}
