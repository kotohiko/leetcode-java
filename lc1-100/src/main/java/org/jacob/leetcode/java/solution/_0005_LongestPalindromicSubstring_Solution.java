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

    /**
     * Finds the longest palindromic substring in the given string using <i>Manacher's algorithm</i>.
     *
     * <p>This method first converts the input string into a Manacher string by inserting '#' between characters and at the
     * beginning and end. This transformation ensures that all palindromes have an odd length, simplifying the algorithm.
     *
     * <p>The method then uses a dynamic programming approach to find the longest palindromic substring. It maintains an
     * array{@code pArr}to store the palindrome radius for each center. The variables{@code C}and{@code R}keep track of the current
     * center and the right boundary of the farthest-right palindrome found so far. The method iterates over the Manacher
     * string, expanding around each center to find the palindrome radius, and updates the{@code pArr}and the right boundary as
     * needed.
     *
     * <p>During the iteration, the method keeps track of the maximum palindrome length and its center. After processing the
     * entire Manacher string, it extracts the longest palindromic substring from the original string.
     *
     * @param s The input string.
     * @return The longest palindromic substring.
     */
    public String longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        // Convert the input string to a Manacher string
        char[] manacherChars = manacherString(s);
        var n = manacherChars.length;

        // Array to store the palindrome radius for each center
        int[] pArr = new int[n];

        // Variables to keep track of the current center and right boundary
        // Center
        var C = -1;
        // Right boundary
        var R = -1;

        // Variables to keep track of the maximum palindrome and its center
        var maxLen = Integer.MIN_VALUE;
        var pos = -1;

        // Iterate over the Manacher string to find the longest palindrome
        for (int i = 0; i < n; ++i) {
            // Initialize the palindrome radius for the current center
            pArr[i] = (i < R) ? Math.min(pArr[2 * C - i], R - i) : 1;

            // Expand around the current center
            while (i + pArr[i] < n && i - pArr[i] >= 0) {
                if (manacherChars[i + pArr[i]] == manacherChars[i - pArr[i]]) {
                    ++pArr[i];
                } else {
                    break;
                }
            }

            // Update the right boundary and center if necessary
            if (i + pArr[i] > R) {
                R = i + pArr[i];
                C = i;
            }

            // Update the maximum palindrome length and its center
            if (pArr[i] > maxLen) {
                maxLen = pArr[i];
                pos = i;
            }
        }

        // Extract the longest palindromic substring from the Manacher string
        var sb = new StringBuilder();
        for (int i = pos - maxLen + 1; i <= pos + maxLen - 1; ++i) {
            if (manacherChars[i] != '#') {
                sb.append(manacherChars[i]);
            }
        }

        return sb.toString();
    }

    /**
     * Converts the input string to a Manacher string by inserting{@code #}between characters and at the beginning and end.
     *
     * @param s The input string.
     * @return The Manacher string.
     */
    private char[] manacherString(String s) {
        char[] chars = new char[s.length() * 2 + 1];
        for (int i = 0, idx = 0; i < chars.length; ++i) {
            chars[i] = (i & 1) == 0 ? '#' : s.charAt(idx++);
        }
        return chars;
    }
}