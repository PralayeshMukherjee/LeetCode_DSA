// https://leetcode.com/problems/diameter-of-binary-tree/description/

// 543. Diameter of Binary Tree

class Solution {
public:
    int maxDepth(TreeNode* root,int& diameter){
        if(!root) return 0;
        int l = maxDepth(root->left,diameter);
        int r = maxDepth(root->right,diameter);
        diameter = max(diameter,l+r);
        return max(l,r)+1;
    }
public:
    int diameterOfBinaryTree(TreeNode* root) {
        int diameter = 0;
        maxDepth(root,diameter);
        return diameter;
    }
};
// time complexity is :- O(n)
// space complexity is :- O(n)