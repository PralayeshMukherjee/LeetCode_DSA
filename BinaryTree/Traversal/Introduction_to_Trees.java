// https://www.geeksforgeeks.org/problems/introduction-to-trees/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=introduction-to-trees
package BinaryTree.Traversal;
class Solution {
    static int countNodes(int i) {
        // code here
        return (int)Math.pow(2,i-1);
    }
}