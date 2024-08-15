// https://leetcode.com/problems/same-tree/description/

// 100. Same Tree
package BinaryTree.Traversal;

public class Same_Tree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        return p.val==q.val && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}
// time complexity is :- O(n)
// space complexity is :- O(n) for auxilary space