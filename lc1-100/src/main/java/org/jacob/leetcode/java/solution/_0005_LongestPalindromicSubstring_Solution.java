package org.jacob.leetcode.java.solution;

/**
 * <a href="https://leetcode.cn/problems/longest-palindromic-substring/"><h1>5. Longest Palindromic Substring</h1></a>
 * [Medium]
 * <p>
 * Given a string{@code s}, return the longest palindromic substring in{@code s}.
 * <p>
 * Example 1:
 * <blockquote>
 * <b>Input: </b>{@code s = "babad"}
 * <p>
 * <b>Output: </b>{@code "bab"}<p>
 * <b>Explanation: </b>"aba" is also a valid answer.
 * </blockquote>
 * Example 2:
 * <blockquote>
 * <b>Input: </b>{@code s = "cbbd"}<p>
 * <b>Output: </b>{@code "bb"}
 * </blockquote>
 * <b>Constraints:</b>
 * <p>
 * <ul>
 *     <li>{@code 1 <= s.length <= 1000}</li>
 *     <li>{@code s}consist of only digits and English letters.</li>
 * </ul>
 *
 * @author Kotohiko
 * @since 15:58 Dec 08, 2023
 */
public class _0005_LongestPalindromicSubstring_Solution {

    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        char[] manacherChars = manacherString(s);
        var n = manacherChars.length;
        int[] pArr = new int[n];
        var C = -1;
        var R = -1;
        var maxLen = Integer.MIN_VALUE;
        var pos = -1;

        for (int i = 0; i < n; ++i) {
            pArr[i] = (i < R) ? Math.min(pArr[2 * C - i], R - i) : 1;
            while (i + pArr[i] < n && i - pArr[i] >= 0) {
                if (manacherChars[i + pArr[i]] == manacherChars[i - pArr[i]]) {
                    ++pArr[i];
                } else {
                    break;
                }
            }

            if (i + pArr[i] > R) {
                R = i + pArr[i];
                C = i;
            }

            if (pArr[i] > maxLen) {
                maxLen = pArr[i];
                pos = i;
            }
        }

        var sb = new StringBuilder();
        for (int i = pos - maxLen + 1; i <= pos + maxLen - 1; ++i) {
            if (manacherChars[i] != '#') {
                sb.append(manacherChars[i]);
            }
        }

        return sb.toString();
    }

    private char[] manacherString(String s) {
        char[] chars = new char[s.length() * 2 + 1];
        for (int i = 0, idx = 0; i < chars.length; ++i) {
            chars[i] = (i & 1) == 0 ? '#' : s.charAt(idx++);
        }
        return chars;
    }
}