package org.jacob.leetcode.java.solution;

/**
 * <a href="https://leetcode.cn/problems/plus-one/description/"><h1>66. Plus One</h1></a>
 * [Easy]
 * <p>
 * You are given a <b>large integer</b> represented as an integer array{@code digits}, where each{@code digits[i]}
 * is the<code>i<sup>th</sup></code>digit of the integer. The digits are ordered from most significant to least
 * significant in left-to-right order. The large integer does not contain any leading{@code 0}'s.
 * <p>
 * Increment the large integer by one and return <i>the resulting array of digits.</i>
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input: </b>{@code digits = [1,2,3]}
 * <p>
 * <b>Output: </b>{@code [1,2,4]}
 * <p>
 * <b>Explanation: </b>The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 * </blockquote>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input: </b>{@code digits = [4,3,2,1]}
 * <p>
 * <b>Output: </b>{@code [4,3,2,2]}
 * <p>
 * <b>Explanation: </b>The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 * </blockquote>
 * <b>Example 3:</b>
 * <blockquote>
 * <b><b>Input: </b></b>{@code digits = [9]}
 * <p>
 * <b><b>Output: </b></b>{@code [1,0]}
 * <p>
 * <b>Explanation: </b>The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 * </blockquote>
 * <p>
 * <b>Constraints:</b>
 * <p>
 * <ul>
 *     <li><code>1 <= digits.length <= 100</code></li>
 *     <li><code>0 <= digits[i] <= 9</code></li>
 *     <li>digits does not contain any leading{@code 0}'s.</li>
 * </ul>
 *
 * @author Kotohiko
 * @since 11:09 Sep 24, 2024
 */
public class _0066_PlusOne_Solution {
    public int[] plusOne(int[] digits) {
        var len = digits.length;
        for (var i = len - 1; i >= 0; --i) {
            if (digits[i] < 9) {
                ++digits[i];
                return digits;
            }
            digits[i] = 0;
        }
        var ans = new int[len + 1];
        ans[0] = 1;
        return ans;
    }
}