package org.jacob.leetcode.java.solution;

import java.util.HashMap;

/**
 * <a href="https://leetcode.cn/problems/two-sum/"><h1>1. Two Sum</h1></a>
 * [Easy]
 * <p>
 * Given an array of integers{@code nums}and an integer{@code target}, return <i>indices of the two numbers
 * such that they add up to{@code target}</i>.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * Input: {@code nums = [2,7,11,15], target = 9}
 * <p>
 * Output: {@code [0,1]}
 * <p>
 * <b>Explanation: </b>Because{@code nums[0] + nums[1] == 9}, we return{@code [0, 1]}.
 * </blockquote>
 * <b>Example 2:</b>
 * <blockquote>
 * Input: {@code nums = [3,2,4], target = 6}
 * <p>
 * Output: {@code [1,2]}
 * </blockquote>
 * <b>Example 3:</b>
 * <blockquote>
 * Input: {@code nums = [3,3], target = 6}
 * <p>
 * Output: {@code [0,1]}
 * </blockquote>
 * <p>
 * <b>Constraints:</b>
 * <p>
 * <ul>
 *     <li><code>2 <= nums.length <= 10<sup>4</sup></code></li>
 *     <li><code> -10<sup>9</sup> <= nums[i] <= 10<sup>9</sup></code></li>
 *     <li><b>Only one valid answer exists.</b></li>
 * </ul>
 * <b>Follow-up: </b>Can you come up with an algorithm that is less than O(n<sup>2</sup>) time complexity?
 *
 * @author Kotohiko
 * @since 10:55 Sep 20, 2023
 */
public class _0001_TwoSum_Solution {
    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        var n = nums.length;
        for (var i = 0; i < n; ++i) {
            var complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}

@SuppressWarnings("unused")
class _0001_TwoSum_Solution2 {
    public int[] twoSum(int[] nums, int target) {
        var n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}