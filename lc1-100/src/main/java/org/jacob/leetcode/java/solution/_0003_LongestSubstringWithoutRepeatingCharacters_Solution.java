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

    /**
     * Finds the length of the longest substring without repeating characters in the given string.
     *
     * <p>This method uses a sliding window approach to find the longest substring without repeating characters.
     * It maintains a hash map to store the last index of each character encountered.
     * As it iterates through the string, it adjusts the start of the current window if a repeating character is found.
     * The maximum length of the substring without repeating characters is updated accordingly.
     *
     * @param s The input string.
     * @return The length of the longest substring without repeating characters.
     */
    public int lengthOfLongestSubstring(String s) {
        // Map to store the last index of each character
        var charIndexMap = new HashMap<Character, Integer>();
        // Length of the input string
        var n = s.length();
        // Variable to store the maximum length of substring without repeating characters
        var maxLength = 0;
        // Start index of the current window
        var start = 0;

        // Iterate over the string with the end index of the current window
        for (int end = 0; end < n; ++end) {
            // Current character at the end of the window
            var currentChar = s.charAt(end);

            // If the character is already in the map, update the start index
            if (charIndexMap.containsKey(currentChar)) {
                // Move the start index to the right of the last occurrence of the current character
                start = Math.max(charIndexMap.get(currentChar) + 1, start);
            }

            // Update the last index of the current character
            charIndexMap.put(currentChar, end);

            // Calculate the length of the current window and update the maximum length
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}