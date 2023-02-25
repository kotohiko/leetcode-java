/**
 * <h2>100. 相同的树</h2>
 * <p>
 * <a href="https://leetcode.cn/problems/same-tree/">LeetCode link</a>
 *
 * @author Jacob Suen
 */
class SameTree_Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(q.right, p.right);
    }
}
