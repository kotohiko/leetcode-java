/**
 * <h2>1038. Binary Search Tree to Greater Sum Tree</h2>
 * <a href="https://leetcode.cn/problems/binary-search-tree-to-greater-sum-tree/">LeetCode link</a>
 *
 * @author Jacob Suen
 * @since 09:03 Dec 04, 2023
 */
class BinarySearchTreeToGreaterSumTree_Solution {
    int tot = 0;

    public TreeNode bstToGst(TreeNode root) {
        dfs(root);
        return root;
    }

    private void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.right);
        tot += root.val;
        root.val = tot;
        dfs(root.left);
    }
}