import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.cn/problems/longest-substring-without-repeating-characters/">
 * <h1>3. Longest Substring Without Repeating Characters</h1></a>
 * [Medium]
 * <p>
 * Given a string{@code s}, find the length of the longest substring<sup>1</sup> without repeating characters.
 * <p>
 * <blockquote>
 *     <ol>
 *         <li>A substring is a contiguous non-empty sequence of characters within a string.</li>
 *     </ol>
 * </blockquote>
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <p>
 * Input: <code>s = "abcabcbb"</code>
 * <p>
 * Output: <code>3</code>
 * <p>
 * <b>Explanation: </b>The answer is "abc", with the length of 3.
 * </blockquote>
 * Example 2:
 * <blockquote>
 * <p>
 * Input: <code>s = "bbbbb"</code>
 * <p>
 * Output: <code>1</code>
 * <p>
 * <b>Explanation: </b>The answer is "b", with the length of 1.
 * </blockquote>
 * Example 3:
 * <blockquote>
 * <p>
 * Input: {@code s = "pwwkew"}
 * <p>
 * Output: 3
 * </blockquote>
 * <b>Explanation: </b>The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * <p>
 * <p>
 * <b>Constraints:</b>
 * <ul>
 *     <li><code>1 <= s.length <= 5 * 10<sup>4</sup></code></li>
 *     <li>{@code s}consists of English letters, digits, symbols and spaces.</li>
 * </ul>
 *
 * @author Kotohiko
 * @since 19:05 Sep 20, 2023
 */
class LongestSubstringWithoutRepeatingCharacters_Solution {
    public int lengthOfLongestSubstring(String s) {
        // Map to store the last index of each character
        Map<Character, Integer> charIndexMap = new HashMap<>();
        // Length of the input string
        int n = s.length();
        // Variable to store the maximum length of substring without repeating characters
        int maxLength = 0;
        // Start index of the current window
        int start = 0;

        // Iterate over the string with the end index of the current window
        for (int end = 0; end < n; ++end) {
            // Current character at the end of the window
            char currentChar = s.charAt(end);

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