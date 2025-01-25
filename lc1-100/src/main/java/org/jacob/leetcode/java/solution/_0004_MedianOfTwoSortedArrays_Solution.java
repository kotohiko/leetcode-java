package org.jacob.leetcode.java.solution;

import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/problems/median-of-two-sorted-arrays/"><h1>4. Median of Two Sorted Arrays</h1></a>
 *
 * @author Kotohiko
 * @since 14:20 Dec 05, 2023
 */
public class _0004_MedianOfTwoSortedArrays_Solution {

    /**
     * Finds the median of two sorted arrays.
     *
     * <p>This method finds the median of two sorted arrays by merging them into a single sorted array and then
     * calculating the median. The key idea is to:
     * <ol>
     *     <li>Combine the two input arrays into a new array.</li>
     *     <li>Sort the new combined array.</li>
     *     <li>Determine the median based on the length of the combined array (whether it is even or odd).</li>
     * </ol>
     *
     * <p>The method works as follows:
     * <ol>
     *     <li>Calculate the lengths of the two input arrays,{@code n}and{@code m}.</li>
     *     <li>Create a new array{@code arr}with a size equal to the sum of the lengths of the two input arrays
     *     ({@code n + m)}.</li>
     *     <li>Copy all elements from{@code nums1}and{@code nums2}into the new array{@code arr}.</li>
     *     <li>Sort the new array{@code arr}.</li>
     *     <li>If the total number of elements in{@code arr}is even, the median is the average of the two middle elements.
     *         If the total number of elements is odd, the median is the middle element.</li>
     * </ol>
     *
     * @param nums1 The first sorted array.
     * @param nums2 The second sorted array.
     * @return The median of the two sorted arrays.
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Length of the first array
        var n = nums1.length;
        // Length of the second array
        var m = nums2.length;

        // Construct a new array to hold the combined elements of both input arrays
        var arr = new int[n + m];
        // Index for the new array
        var idx = 0;

        // Copy elements from the first array into the new array
        for (var i : nums1) {
            arr[idx++] = i;
        }

        // Copy elements from the second array into the new array
        for (var i : nums2) {
            arr[idx++] = i;
        }

        // Sort the new combined array
        Arrays.sort(arr);

        // Determine the median based on the length of the combined array
        // Middle element if the length is odd, or the right middle element if the length is even
        var l = arr[(n + m) / 2];
        // Left middle element if the length is even, or the same as l if the length is odd
        var r = arr[(n + m - 1) / 2];

        // Return the median
        return (l + r) / 2.0;
    }
}

@SuppressWarnings("unused")
class MedianOfTwoSortedArrays_Solution2 {

    /**
     * Finds the median of two sorted arrays.
     *
     * <p>This method finds the median of two sorted arrays by using a binary search approach. The key idea is to partition
     * the arrays such that the left part contains the smaller half of the elements, and the right part contains the larger
     * half. The median is then determined based on the maximum element in the left part and the minimum element in the right
     * part.
     *
     * <p>The method first calculates the total number of elements in both arrays. If the total number of elements is even,
     * it finds the k-th smallest element for both{@code k = tot / 2}and{@code k = tot / 2 + 1}, and returns their average. If the
     * total number of elements is odd, it finds the k-th smallest element for{@code k = tot / 2 + 1}.
     *
     * <p>The{@code find}helper method is used to find the k-th smallest element in the two sorted arrays. It uses a binary
     * search approach to efficiently find the k-th smallest element.
     *
     * @param nums1 The first sorted array.
     * @param nums2 The second sorted array.
     * @return The median of the two sorted arrays.
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        var tot = nums1.length + nums2.length; // Total number of elements in both arrays
        // If the total number of elements is even
        if (tot % 2 == 0) {
            // Find the (tot/2)-th smallest element
            var left = find(nums1, 0, nums2, 0, tot / 2);
            // Find the (tot/2 + 1)-th smallest element
            var right = find(nums1, 0, nums2, 0, tot / 2 + 1);
            return (left + right) / 2.0; // Return the average of the two middle elements
        }
        // If the total number of elements is odd
        else {
            // Find the (tot/2 + 1)-th smallest element
            return find(nums1, 0, nums2, 0, tot / 2 + 1);
        }
    }

    /**
     * Finds the k-th smallest element in the two sorted arrays.
     *
     * <p>This helper method uses a binary search approach to find the k-th smallest element in the two sorted arrays. It
     * partitions the arrays such that the left part contains the smaller half of the elements, and the right part contains
     * the larger half. The method recursively narrows down the search space until it finds the k-th smallest element.
     *
     * <p>The method ensures that the smaller array is always the first one to be processed, which helps in reducing the
     * number of recursive calls and improving performance.
     *
     * @param n1 The first sorted array.
     * @param i  The starting index in the first array.
     * @param n2 The second sorted array.
     * @param j  The starting index in the second array.
     * @param k  The k-th smallest element to find.
     * @return The k-th smallest element.
     */
    int find(int[] n1, int i, int[] n2, int j, int k) {
        // Ensure the smaller array is the first one to be processed
        if (n1.length - i > n2.length - j) {
            return find(n2, j, n1, i, k);
        }
        // If the first array is exhausted, return the k-th element from the second array
        if (i >= n1.length) {
            return n2[j + k - 1];
        }

        // If k is 1, return the smaller of the two current elements
        if (k == 1) {
            return Math.min(n1[i], n2[j]);
        } else {
            // Calculate the partition points
            var si = Math.min(i + (k / 2), n1.length);
            var sj = j + k - (k / 2);
            // Compare the elements at the partition points
            if (n1[si - 1] > n2[sj - 1]) {
                // Recur with the second array's partition point
                return find(n1, i, n2, sj, k - (sj - j));
            } else {
                // Recur with the first array's partition point
                return find(n1, si, n2, j, k - (si - i));
            }
        }
    }
}