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
 *
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
 *
 * <p>
 * <b>Constraints:</b>
 * <p>
 * <ul>
 *     <li>{@code 2 <= nums.length <= 104}</li>
 *     <li> -10<sup>9</sup> <= {@code nums[i]} <= 10<sup>9</sup></li>
 *     <li><b>Only one valid answer exists.</b></li>
 * </ul>
 * <b>Follow-up: </b>Can you come up with an algorithm that is less than O(n<sup>2</sup>) time complexity?
 *
 * @author Kotohiko
 * @since 10:55 Sep 20, 2023
 */
class TwoSum_Solution {

    /**
     * <p>This method uses a hash map to store the value and its index as it iterates through the array.
     * For each element, it calculates the complement (i.e., the number that, when added to the current element,
     * equals the target).
     * If the complement is found in the hash map, it means we have found the two indices that add up to the target.
     * The method then returns these indices. If no such pair is found, it returns an empty array.
     *
     * @param nums   The input array of integers.
     * @param target The target sum.
     * @return An array containing the indices of the two numbers that add up to the target,
     * or an empty array if no such pair exists.
     */
    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
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
class TwoSum_Solution2 {
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