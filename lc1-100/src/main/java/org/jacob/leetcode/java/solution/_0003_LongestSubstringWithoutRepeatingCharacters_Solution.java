package org.jacob.leetcode.java.solution;

import java.util.HashMap;

/**
 * <a href="https://leetcode.cn/problems/longest-substring-without-repeating-characters/">
 * <h1>3. Longest Substring Without Repeating Characters</h1></a>
 * [Medium]
 * <p>
 * Given a string{@code s}, find the length of the <b>longest substring</b><sup>1</sup> without repeating characters.
 * <p>
 * <blockquote>
 *     <ol>
 *         <li>A <b>substring</b> is a contiguous non-empty sequence of characters within a string.</li>
 *     </ol>
 * </blockquote>
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <p>
 * <b>Input: </b><code>s = "abcabcbb"</code>
 * <p>
 * <b>Output: </b><code>3</code>
 * <p>
 * <b>Explanation: </b>The answer is "abc", with the length of 3.
 * </blockquote>
 * Example 2:
 * <blockquote>
 * <p>
 * <b>Input: </b><code>s = "bbbbb"</code>
 * <p>
 * <b>Output: </b><code>1</code>
 * <p>
 * <b>Explanation: </b>The answer is "b", with the length of 1.
 * </blockquote>
 * Example 3:
 * <blockquote>
 * <p>
 * <b>Input: </b>{@code s = "pwwkew"}
 * <p>
 * <b>Output: </b>3
 * <p>
 * <b>Explanation: </b>The answer is "wke", with the length of 3.
 * <p>
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * </blockquote>
 *     <b>Constraints:</b>
 * <ul>
 *     <li><code>1 <= s.length <= 5 * 10<sup>4</sup></code></li>
 *     <li>{@code s}consists of English letters, digits, symbols and spaces.</li>
 * </ul>
 *
 * @author Kotohiko
 * @since 19:05 Sep 20, 2023
 */
public class _0003_LongestSubstringWithoutRepeatingCharacters_Solution {

    public int lengthOfLongestSubstring(String s) {
        var charIndexMap = new HashMap<Character, Integer>();
        var n = s.length();
        var maxLength = 0;
        var start = 0;

        for (int end = 0; end < n; ++end) {
            var currentChar = s.charAt(end);
            if (charIndexMap.containsKey(currentChar)) {
                start = Math.max(charIndexMap.get(currentChar) + 1, start);
            }
            charIndexMap.put(currentChar, end);
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}