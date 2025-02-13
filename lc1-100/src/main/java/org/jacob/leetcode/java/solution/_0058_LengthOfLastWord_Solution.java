package org.jacob.leetcode.java.solution;

/**
 * <a href="https://leetcode.cn/problems/length-of-last-word/"><h1>58. Length of Last Word</h1></a>
 *
 * @author Kotohiko
 * @since 18:37 Sep 23, 2023
 */
public class _0058_LengthOfLastWord_Solution {

    public int lengthOfLastWord(String s) {
        var n = s.length();
        var i = n - 1;

        while (i >= 0 && Character.isSpaceChar(s.charAt(i))) {
            --i;
        }

        var j = i;
        while (j >= 0 && Character.isLetter(s.charAt(j))) {
            --j;
        }

        return i - j;
    }
}