import java.util.HashMap;
import java.util.Map;

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
 * Example 3:
 * <blockquote>
 * Input: {@code nums = [3,3], target = 6}
 * <p>
 * Output: {@code [0,1]}
 * </blockquote>
 * <p>
 * <b>Constraints:</b>
 * <p>
 * <ul>
 *     <li>{@code 2 <= nums.length <= 104}</li>
 *     <li>{@code -109 <= nums[i] <= 109}</li>
 *     <li><b>Only one valid answer exists.</b></li>
 * </ul>
 * <b>Follow-up: </b>Can you come up with an algorithm that is less than O(n<sup>2</sup>) time complexity?
 *
 * @author Kotohiko
 * @since 10:55 Sep 20, 2023
 */
class TwoSum_Solution {
    public int[] twoSum(int[] nums, int target) {
        // Map to store the value and its index
        Map<Integer, Integer> numIndexMap = new HashMap<>();

        // Iterate over the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement of the current number
            int complement = target - nums[i];

            // Check if the complement is already in the map
            if (numIndexMap.containsKey(complement)) {
                // If found, return the indices of the two numbers
                return new int[]{numIndexMap.get(complement), i};
            }

            // Store the current number and its index in the map
            numIndexMap.put(nums[i], i);
        }

        // If no solution is found, return an empty array
        return new int[0];
    }
}