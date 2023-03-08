/**
 * <h2>11. 盛最多水的容器</h2>
 * <p>
 * <a href="https://leetcode.cn/problems/container-with-most-water/">LeetCode link</a>
 *
 * @author Jacob Suen
 */
class ContainerWithMostWater_Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int i = 0;
        int j = height.length - 1;
        while (i < j) {
            int b = j - i;
            ans = height[i] < height[j] ? Math.max(ans, b * height[i++]) : Math.max(ans, b * height[j--]);
        }
        return ans;
    }
}
