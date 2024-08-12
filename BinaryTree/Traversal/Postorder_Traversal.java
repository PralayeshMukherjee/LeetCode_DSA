// https://leetcode.com/problems/binary-tree-postorder-traversal/submissions/1352736534/

// 145. Binary Tree Postorder Traversal
package BinaryTree.Traversal;

import java.util.ArrayList;
import java.util.List;
class TreeNode {
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
public class Postorder_Traversal {
    public void postorderTraversalHelper(TreeNode root,List<Integer> list){
        if(root==null) return;
        postorderTraversalHelper(root.left,list);
        postorderTraversalHelper(root.right,list);
        list.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        postorderTraversalHelper(root,list);
        return list;
    }
}
