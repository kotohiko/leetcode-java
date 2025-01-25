package org.jacob.leetcode.java.solution;

/**
 * <a href="https://leetcode.cn/problems/minimum-levels-to-gain-more-points">
 * <h1>3096. Minimum Levels to Gain More Points</h1></a>
 *
 * @author Kotohiko
 * @since 13:46 Jul 19, 2024
 */
public class _3096_MinimumLevelsToGainMorePoints_Solution {
    public int minimumLevels(int[] possible) {
        var n = possible.length;
        var tot = 0;
        for (var x : possible) {
            tot += x == 1 ? 1 : -1;
        }
        var pre = 0;
        for (var i = 0; i < n - 1; i++) {
            pre += possible[i] == 1 ? 1 : -1;
            if (2 * pre > tot) {
                return i + 1;
            }
        }
        return -1;
    }
}