package org.jacob.leetcode.java.solution;

/**
 * <a href="https://leetcode.cn/problems/valid-palindrome"><h1>125. Valid Palindrome</h1></a>
 *
 * @author Kotohiko
 * @since 16:23 Sep 28, 2023
 */
public class _0125_ValidPalindrome_Solution {
    public boolean isPalindrome(String s) {
        var chars = s.toLowerCase().toCharArray();
        var len = chars.length;
        var sb = new StringBuilder();
        for (var i = len - 1; i >= 0; --i) {
            if (chars[i] != ' ' && Character.isLetterOrDigit(chars[i])) {
                sb.append(chars[i]);
            }
        }
        return sb.toString().contentEquals(sb.reverse());
    }
}