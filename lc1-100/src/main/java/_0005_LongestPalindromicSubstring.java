/**
 * <a href="https://leetcode.cn/problems/longest-palindromic-substring/"><h1>5. Longest Palindromic Substring</h1></a>
 *
 * @author Kotohiko
 * @since 15:58 Dec 08, 2023
 */
class LongestPalindromicSubstring_Solution {

    /**
     * Finds the longest palindromic substring in the given string.
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
        int n = manacherChars.length;

        // Array to store the palindrome radius for each center
        int[] pArr = new int[n];

        // Variables to keep track of the current center and right boundary
        int C = -1; // Center
        int R = -1; // Right boundary

        // Variables to keep track of the maximum palindrome and its center
        int maxLen = Integer.MIN_VALUE;
        int pos = -1;

        // Iterate over the Manacher string to find the longest palindrome
        for (int i = 0; i < n; i++) {
            // Initialize the palindrome radius for the current center
            pArr[i] = (i < R) ? Math.min(pArr[2 * C - i], R - i) : 1;

            // Expand around the current center
            while (i + pArr[i] < n && i - pArr[i] >= 0) {
                if (manacherChars[i + pArr[i]] == manacherChars[i - pArr[i]]) {
                    pArr[i]++;
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
        StringBuilder sb = new StringBuilder();
        for (int i = pos - maxLen + 1; i <= pos + maxLen - 1; i++) {
            if (manacherChars[i] != '#') {
                sb.append(manacherChars[i]);
            }
        }

        return sb.toString();
    }

    /**
     * Converts the input string to a Manacher string by inserting '#' between characters and at the beginning and end.
     *
     * @param s The input string.
     * @return The Manacher string.
     */
    private char[] manacherString(String s) {
        char[] chars = new char[s.length() * 2 + 1];
        for (int i = 0, idx = 0; i < chars.length; i++) {
            chars[i] = (i & 1) == 0 ? '#' : s.charAt(idx++);
        }
        return chars;
    }
}