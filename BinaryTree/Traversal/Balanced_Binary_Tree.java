// https://leetcode.com/problems/balanced-binary-tree/description/

// 110. Balanced Binary Tree
package BinaryTree.Traversal;

public class Balanced_Binary_Tree {
    public int maxDepth(TreeNode root){
        if(root==null) return 0;
        int left = maxDepth(root.left);
        if(left==-1) return -1;
        int right = maxDepth(root.right);
        if(right==-1) return -1;
        if(Math.abs(left-right)>1) return -1;
        return Math.max(left,right)+1;
    }
    public boolean isBalanced(TreeNode root) {
        return maxDepth(root) !=-1;
    }
}
