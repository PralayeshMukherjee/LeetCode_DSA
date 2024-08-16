// https://leetcode.com/problems/binary-tree-maximum-path-sum/description/

// 124. Binary Tree Maximum Path Sum
package BinaryTree.Traversal;

public class Binary_Tree_Maximum_Path_Sum {
    public int max;
    public int maxi(TreeNode node){
        if(node==null) return 0;
        int leftNode = Math.max(0,maxi(node.left));
        int rightNode = Math.max(0,maxi(node.right));
        max = Math.max(max,node.val+leftNode+rightNode);
        return node.val+Math.max(leftNode,rightNode);
    }
    public int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE;
        maxi(root);
        return max;
    }
}
// time complexity is :- O(N) wrost case