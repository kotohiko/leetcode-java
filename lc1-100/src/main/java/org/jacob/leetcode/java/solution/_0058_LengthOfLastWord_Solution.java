package org.jacob.leetcode.java.solution;

/**
 * <a href="https://leetcode.cn/problems/length-of-last-word/"><h1>58. Length of Last Word</h1></a>
 *
 * @author Kotohiko
 * @since 18:37 Sep 23, 2023
 */
public class _0058_LengthOfLastWord_Solution {

    /**
     * Finds the length of the last word in a given string.
     *
     * <p>This method calculates the length of the last word in the input string. A word is defined as a sequence of
     * non-space characters. The input string may contain leading or trailing spaces, and multiple spaces between words.
     *
     * <p>The method works as follows:
     * <ol>
     *     <li>It starts by finding the end of the last word, skipping any trailing spaces.</li>
     *     <li>Once the end of the last word is found, it then moves backwards to find the start of the last word,
     *     stopping when it encounters a space or reaches the beginning of the string.</li>
     *     <li>The length of the last word is then calculated as the difference between the end and start indices.</li>
     * </ol>
     *
     * @param s The input string.
     * @return The length of the last word in the string. If the string does not contain any words, returns 0.
     */
    public int lengthOfLastWord(String s) {
        // Length of the input string
        var n = s.length();
        // Start from the end of the string
        var i = n - 1;

        // Skip any trailing spaces
        while (i >= 0 && Character.isSpaceChar(s.charAt(i))) {
            --i;
        }

        // Find the start of the last word
        var j = i;
        while (j >= 0 && Character.isLetter(s.charAt(j))) {
            --j;
        }

        // Calculate the length of the last word
        return i - j;
    }
}