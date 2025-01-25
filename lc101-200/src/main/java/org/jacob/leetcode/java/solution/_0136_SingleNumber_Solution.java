package org.jacob.leetcode.java.solution;

/**
 * <a href="https://leetcode.cn/problems/single-number"><h1>136. Single Number</h1></a>
 *
 * @author Kotohiko
 * @since 23:38 Oct 14, 2023
 */
public class _0136_SingleNumber_Solution {
    public int singleNumber(int[] nums) {
        var single = 0;
        for (var num : nums) {
            single ^= num;
        }
        return single;
    }
}