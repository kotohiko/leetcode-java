package org.jacob.leetcode.java.solution;

/**
 * <a href="https://leetcode.cn/problems/longer-contiguous-segments-of-ones-than-zeros/description/">
 * <h1>1869. Longer Contiguous Segments of Ones than Zeros</h1>
 * </a>
 *
 * @author Kotohiko
 * @since 21:31 Oct 31, 2024
 */
public class _1869_LongerContiguousSegmentsOfOnesThanZeros_Solution {
    public boolean checkZeroOnes(String s) {
        var n = s.length();
        var maxCountOfOne = 0;
        var maxCountOfZero = 0;
        var currentCount = 0;
        var currentChar = s.charAt(0);

        for (var i = 0; i < n; ++i) {
            if (s.charAt(i) == currentChar) {
                ++currentCount;
            } else {
                if (currentChar == '1') {
                    maxCountOfOne = Math.max(maxCountOfOne, currentCount);
                } else {
                    maxCountOfZero = Math.max(maxCountOfZero, currentCount);
                }
                currentChar = s.charAt(i);
                currentCount = 1;
            }
        }

        if (currentChar == '1') {
            maxCountOfOne = Math.max(maxCountOfOne, currentCount);
        } else {
            maxCountOfZero = Math.max(maxCountOfZero, currentCount);
        }

        return maxCountOfOne > maxCountOfZero;
    }
}