// https://leetcode.com/problems/binary-tree-inorder-traversal/

// 94. Binary Tree Inorder Traversal
package BinaryTree.Traversal;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Inorder_Traversal {
    public void inorderTraversalHelper(TreeNode root,List<Integer> list){
        if(root==null) return;
        inorderTraversalHelper(root.left,list);
        list.add(root.val);
        inorderTraversalHelper(root.right,list);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        inorderTraversalHelper(root,list);
        return list;
    }
}
