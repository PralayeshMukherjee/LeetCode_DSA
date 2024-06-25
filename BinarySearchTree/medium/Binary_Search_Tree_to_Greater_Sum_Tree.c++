//https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/description/?envType=daily-question&envId=2024-06-25

//1038. Binary Search Tree to Greater Sum Tree
#include <binary_tree>
class Solution {
public:
    void bstToGstHelper(TreeNode* root,int &sum){
        if(root==NULL) return;
        bstToGstHelper(root->right,sum);
        int temp = root->val;
        root->val += sum;
        sum += temp;
        bstToGstHelper(root->left,sum);
    }
    TreeNode* bstToGst(TreeNode* root) {
        int sum = 0;
        bstToGstHelper(root,sum);
        return root;
    }
};