/**
 * <a href="https://leetcode.cn/problems/remove-trailing-zeros-from-a-string/description">
 * <h1>2710. Remove Trailing Zeros From a String</h1></a>
 *
 * @author Jacob Suen
 * @since 08:16 Jun 29, 2024
 */
class RemoveTrailingZerosFromAString_Solution {
    public String removeTrailingZeros(String num) {
        var n = num.length();
        if (num.charAt(n - 1) != '0') {
            return num;
        }
        while (n > 0) {
            if (num.charAt(n - 1) == '0') {
                --n;
            } else {
                return num.substring(0, n);
            }
        }
        return null;
    }
}