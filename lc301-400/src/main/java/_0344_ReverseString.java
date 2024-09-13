/**
 * <a href="https://leetcode.cn/problems/reverse-string/description/"><h1>344. Reverse String</h1></a>
 *
 * @author Kotohiko
 * @since 12:10 Sep 13, 2024
 */
class ReverseString_Solution {
    public void reverseString(char[] s) {
        var n = s.length;
        for (var i = 0; i < n / 2; i++) {
            var tmp = s[i];
            s[i] = s[n - 1 - i];
            s[n - 1 - i] = tmp;
        }
    }
}