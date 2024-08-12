// https://leetcode.com/problems/binary-tree-preorder-traversal/

// 144. Binary Tree Preorder Traversal

package BinaryTree.Traversal;

import java.util.ArrayList;
import java.util.List;

public class Preorder_Traversal {
    public void preorderTraversalHelper(TreeNode root,List<Integer> list){
        if(root==null) return;
        list.add(root.val);
        preorderTraversalHelper(root.left,list);
        preorderTraversalHelper(root.right,list);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        preorderTraversalHelper(root,list);
        return list;
    }
}
