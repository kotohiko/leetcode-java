/**
 * <a href="https://leetcode.cn/problems/clear-digits/description/">
 * <h1>3174. Clear Digits</h1></a>
 *
 * @author Jacob Suen
 * @since 20:04 Sep 06, 2024
 */
class ClearDigits_Solution {
    public String clearDigits(String s) {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()){
            if (Character.isDigit(c)) {
                res.deleteCharAt(res.length() - 1);
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}