package org.jacob.leetcode.java.solution;

/**
 * <a href="https://leetcode.cn/problems/valid-mountain-array/description/">
 * <h1>941. Valid Mountain Array</h1>
 * </a>
 * [Easy]
 * <p>
 * Given an array of integers{@code arr}, return<i><code>true</code> if and only if it is a valid mountain array.</i>
 * <p>
 * Recall that {@code arr} is a mountain array if and only if:
 * <p>
 *     <ul>
 *         <li>
 *             <code>arr.length >= 3</code>
 *         </li>
 *         <li>
 *             There exists some {@code i} with {@code 0 < i < arr.length - 1} such that:
 *             <ul>
 *                 <li>
 *                     <code>arr[0] < arr[1] < ... < arr[i - 1] < arr[i]</code><p>
 *                 </li>
 *                 <li>
 *                     <code>arr[i] > arr[i + 1] > ... > arr[arr.length - 1]</code>
 *                 </li>
 *             </ul>
 *         </li>
 *     </ul>
 * <p>
 * <b>Example 1: </b>
 * <blockquote>
 * <b>Input:</b> {@code arr = [2,1]}
 * <p>
 * <b>Output:</b> {@code false}
 * <p>
 * <!-- Optional -->
 * </blockquote>
 *
 * <b>Example 2: </b>
 * <blockquote>
 * <b>Input:</b> {@code arr = [3,5,5]}
 * <p>
 * <b>Output:</b> {@code false}
 * <p>
 * <!-- Optional -->
 * </blockquote>
 *
 * <b>Example 3: </b>
 * <blockquote>
 * <b>Input:</b> {@code arr = [0,3,2,1]}
 * <p>
 * <b>Output:</b> {@code true}
 * <p>
 * <!-- Optional -->
 * </blockquote>
 *
 * <b>Constraints:</b>
 * <p>
 * <ul>
 *     <li><code>1 <= arr.length <= 10<sup>4</sup></code></li>
 *     <li><code>0 <= arr[i] <= 10<sup>4</sup></code></li>
 * </ul>
 *
 * @author Kotohiko
 * @since 12:09 Jan 25, 2025
 */
public class _0941_ValidMountainArray_Solution {
    public boolean validMountainArray(int[] arr) {
        var n = arr.length;
        var i = 0;

        // 递增扫描
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            ++i;
        }

        // 最高点不能是数组的第一个位置或最后一个位置
        if (i == 0 || i == n - 1) {
            return false;
        }

        // 递减扫描
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            ++i;
        }

        return i == n - 1;
    }
}