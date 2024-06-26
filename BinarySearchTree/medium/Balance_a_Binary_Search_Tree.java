//https://leetcode.com/problems/balance-a-binary-search-tree/description/?envType=daily-question&envId=2024-06-26

//1382. Balance a Binary Search Tree
import java.util.*;

class Solution {
    List<Integer> list = new ArrayList<>();

    private void dfs(TreeNode node) {
        if (node == null)
            return;

        dfs(node.left);
        list.add(node.val);
        dfs(node.right);
    }

    private TreeNode constructTree(int l, int r) {
        if (l > r)
            return null;

        var m = l + (r - l) / 2;

        return new TreeNode(list.get(m), constructTree(l, m - 1), constructTree(m + 1, r));
    }

    public TreeNode balanceBST(TreeNode root) {
        dfs(root);
        return constructTree(0, list.size() - 1);
    }
}