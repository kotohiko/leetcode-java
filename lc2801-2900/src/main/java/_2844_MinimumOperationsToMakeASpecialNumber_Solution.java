/**
 * <a href="https://leetcode.cn/problems/minimum-operations-to-make-a-special-number/description">
 * <h1>2844. Minimum Operations to Make a Special Number</h1></a>
 *
 * @author Kotohiko
 * @since 09:42 Jul 25, 2024
 */
class MinimumOperationsToMakeASpecialNumber_Solution {
    public int minimumOperations(String num) {
        var n = num.length();
        var found0 = false;
        var found5 = false;
        for (var i = n - 1; i >= 0; i--) {
            var c = num.charAt(i);
            if (found0 && (c == '0' || c == '5') || found5 && (c == '2' || c == '7')) {
                return n - i - 2;
            }
            if (c == '0') {
                found0 = true;
            } else if (c == '5') {
                found5 = true;
            }
        }
        return found0 ? n - 1 : n;
    }
}