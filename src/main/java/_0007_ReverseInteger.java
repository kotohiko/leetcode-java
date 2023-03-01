/**
 * <h2>7. 整数反转</h2>
 * <p>
 * <a href="https://leetcode.cn/problems/reverse-integer/">LeetCode link</a>
 *
 * @author Jacob Suen
 */
class ReverseInteger_Solution {
    public int reverse(int x) {
        int ans = 0;
        while (x != 0) {
            if (x > 0 && ans > (Integer.MAX_VALUE - x % 10) / 10) {
                return 0;
            }
            if (x < 0 && ans < (Integer.MIN_VALUE - x % 10) / 10) {
                return 0;
            }
            ans = ans * 10 + x % 10;
            x /= 10;
        }
        return ans;
    }
}
