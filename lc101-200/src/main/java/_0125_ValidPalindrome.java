/**
 * <h2>125. Valid Palindrome</h2>
 * <a href="https://leetcode.cn/problems/valid-palindrome">LeetCode link</a>
 *
 * @author Jacob Suen
 * @create 16:23 Sep 28, 2023
 */
class ValidPalindrome_Solution {
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