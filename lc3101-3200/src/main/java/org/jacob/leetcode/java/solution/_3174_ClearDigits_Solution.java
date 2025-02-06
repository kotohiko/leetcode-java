package org.jacob.leetcode.java.solution;

/**
 * <a href="https://leetcode.cn/problems/clear-digits/description/">
 * <h1>3174. Clear Digits</h1></a>
 *
 * @author Kotohiko
 * @since 20:04 Sep 06, 2024
 */
public class _3174_ClearDigits_Solution {
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