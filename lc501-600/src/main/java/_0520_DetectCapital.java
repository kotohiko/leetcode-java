/**
 * <a href="https://leetcode.cn/problems/detect-capital/"><h1>520. Detect Capital</h1></a>
 *
 * @author Kotohiko
 * @since 22:48 08/10/2023
 */
class DetectCapital_Solution {
    public boolean detectCapitalUse(String word) {
        var n = word.length();
        if (n == 1) {
            return true;
        }
        var first = word.charAt(0);
        for (var i = 1; i < n; ++i) {
            if (Character.isUpperCase(first)
                    && Character.isLowerCase(word.charAt(1)) && (Character.isUpperCase(word.charAt(i)))) {
                return false;
            }
            if (Character.isUpperCase(first)
                    && Character.isUpperCase(word.charAt(1)) && (Character.isLowerCase(word.charAt(i)))) {
                return false;
            }
            if (Character.isLowerCase(first)
                    && (Character.isUpperCase(word.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}