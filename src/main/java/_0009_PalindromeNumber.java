/**
 * <h2>9. 回文数</h2>
 * <p>
 * <a href="https://leetcode.cn/problems/palindrome-number/">LeetCode link</a>
 *
 * @author Jacob Suen
 */
class PalindromeNumber_Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int ans = 0, t = x;
        while (x != 0) {
            ans = ans * 10 + x % 10;
            x /= 10;
        }
        return t == ans;
    }
}
