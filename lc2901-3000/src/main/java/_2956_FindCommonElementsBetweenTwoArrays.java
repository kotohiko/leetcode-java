import java.util.HashSet;

/**
 * <a href="https://leetcode.cn/problems/find-common-elements-between-two-arrays">
 * <h1>2956. Find Common Elements Between Two Arrays</h1></a>
 *
 * @author Kotohiko
 * @since 16:09 Jul 16, 2024
 */
class FindCommonElementsBetweenTwoArrays_Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        var set1 = new HashSet<Integer>();
        for (var x : nums1) {
            set1.add(x);
        }
        var set2 = new HashSet<Integer>();
        for (var x : nums2) {
            set2.add(x);
        }
        var ans = new int[2];
        for (var x : nums1) {
            if (set2.contains(x)) {
                ans[0]++;
            }
        }
        for (var x : nums2) {
            if (set1.contains(x)) {
                ans[1]++;
            }
        }
        return ans;
    }
}