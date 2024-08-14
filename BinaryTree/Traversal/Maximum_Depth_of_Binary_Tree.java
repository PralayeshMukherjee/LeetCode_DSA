// https://leetcode.com/problems/maximum-depth-of-binary-tree/

// 104. Maximum Depth of Binary Tree
package BinaryTree.Traversal;

public class Maximum_Depth_of_Binary_Tree {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        int a = maxDepth(root.left);
        int b = maxDepth(root.right);
        return Math.max(a,b)+1;
    }
}
// time complexity is :- O(n)
// space complexity is :- O(1)