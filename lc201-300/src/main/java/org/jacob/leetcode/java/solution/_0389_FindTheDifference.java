package org.jacob.leetcode.java.solution;

/**
 * <h1><a href="https://leetcode.cn/problems/find-the-difference">389. Find the Difference</a></h1>
 *
 * @author Kotohiko
 * @since 13:10 Jun 29, 2024
 */
class FindTheDifference_Solution {
    public char findTheDifference(String s, String t) {
        for (var i = 0; i < s.length(); ++i) {
            char sCh = s.charAt(i);
            char tCh = t.charAt(i);
            int retVal = sCh ^ tCh;
            if (retVal != 0) {
                return s.charAt(i);
            }
        }
        return t.charAt(t.length() - 1);
    }
}