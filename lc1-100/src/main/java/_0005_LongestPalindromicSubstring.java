/**
 * <h1>5. Longest Palindromic Substring</h1>
 * <a href="https://leetcode.cn/problems/longest-palindromic-substring/">LeetCode link</a>
 *
 * @author Jacob Suen
 * @since 15:58 Dec 08, 2023
 */
class LongestPalindromicSubstring_Solution {
    public String longestPalindrome(String s) {
        if (s.length() == 1) {
            return s;
        }
        var chars = manacherString(s);
        var n = chars.length;
        var pArr = new int[n];
        var C = -1;
        var R = -1;
        var pos = -1;
        var max = Integer.MIN_VALUE;
        for (var i = 0; i < n; ++i) {
            pArr[i] = i < R ? Math.min(pArr[C * 2 - i], R - i) : 1;
            while (i + pArr[i] < n && i - pArr[i] > -1) {
                if (chars[i + pArr[i]] == chars[i - pArr[i]]) {
                    ++pArr[i];
                } else {
                    break;
                }
            }
            if (i + pArr[i] > R) {
                R = i + pArr[i];
                C = i;
            }
            if (pArr[i] > max) {
                max = pArr[i];
                pos = i;
            }
        }
        var offset = pArr[pos];
        StringBuilder sb = new StringBuilder();
        for (var i = pos - offset + 1; i <= pos + offset - 1; ++i) {
            if (chars[i] != '#') {
                sb.append(chars[i]);
            }
        }
        return sb.toString();
    }

    char[] manacherString(String s) {
        var chars = new char[s.length() * 2 + 1];
        for (int i = 0, idx = 0; i < chars.length; ++i) {
            chars[i] = (i & 1) == 0 ? '#' : s.charAt(idx++);
        }
        return chars;
    }
}