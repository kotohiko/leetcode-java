package org.jacob.leetcode.java.solution;

/**
 * <a href="https://leetcode.cn/problems/latest-time-you-can-obtain-after-replacing-characters">
 * <h1>3114. Latest Time You Can Obtain After Replacing Characters</h1></a>
 *
 * @author Kotohiko
 * @since 16:52 Jun 30, 2024
 */
public class _3114_LatestTimeYouCanObtainAfterReplacingCharacters_Solution {
    public String findLatestTime(String s) {
        var t = s.toCharArray();
        if (t[0] == '?') {
            t[0] = t[1] == '?' || t[1] <= '1' ? '1' : '0';
        }
        if (t[1] == '?') {
            t[1] = t[0] == '1' ? '1' : '9';
        }
        if (t[3] == '?') {
            t[3] = '5';
        }
        if (t[4] == '?') {
            t[4] = '9';
        }
        return new String(t);
    }
}