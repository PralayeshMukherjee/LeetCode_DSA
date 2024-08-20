// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/description/

// 103. Binary Tree Zigzag Level Order Traversal
package BinaryTree.Traversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Binary_Tree_Zigzag_Level_Order_Traversal {
    public int flag = 1;
    public void zig(TreeNode root,List<List<Integer>> list,Queue<TreeNode> queue){
        if(root==null) return;
        queue.add(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> ll = new ArrayList<>();
            for(int i=0;i<levelNum;i++){
                TreeNode node = queue.poll();
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
                ll.add(node.val);
            }
            if(flag==-1){
                Collections.reverse(ll);
            }
            flag *= -1;
            list.add(new ArrayList<>(ll));
        }
    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        zig(root,list,queue);
        return list;
    }
}
// time complexity is :- O(N)
// space complexity is :- O(H) for the worst case but in general it take O(log H) space complexity