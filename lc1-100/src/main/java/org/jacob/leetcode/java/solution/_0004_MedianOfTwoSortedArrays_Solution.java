package org.jacob.leetcode.java.solution;

import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/problems/median-of-two-sorted-arrays/"><h1>4. Median of Two Sorted Arrays</h1></a>
 *
 * @author Kotohiko
 * @since 14:20 Dec 05, 2023
 */
public class _0004_MedianOfTwoSortedArrays_Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        var n = nums1.length;
        var m = nums2.length;
        var arr = new int[n + m];
        var idx = 0;

        for (var i : nums1) {
            arr[idx++] = i;
        }
        for (var i : nums2) {
            arr[idx++] = i;
        }

        Arrays.sort(arr);
        var l = arr[(n + m) / 2];
        var r = arr[(n + m - 1) / 2];
        return (l + r) / 2.0;
    }
}

@SuppressWarnings("unused")
class MedianOfTwoSortedArrays_Solution2 {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        var tot = nums1.length + nums2.length;
        if (tot % 2 == 0) {
            var left = find(nums1, 0, nums2, 0, tot / 2);
            var right = find(nums1, 0, nums2, 0, tot / 2 + 1);
            return (left + right) / 2.0;
        } else {
            return find(nums1, 0, nums2, 0, tot / 2 + 1);
        }
    }

    int find(int[] n1, int i, int[] n2, int j, int k) {
        if (n1.length - i > n2.length - j) {
            return find(n2, j, n1, i, k);
        }
        if (i >= n1.length) {
            return n2[j + k - 1];
        }
        if (k == 1) {
            return Math.min(n1[i], n2[j]);
        } else {
            var si = Math.min(i + (k / 2), n1.length);
            var sj = j + k - (k / 2);
            if (n1[si - 1] > n2[sj - 1]) {
                return find(n1, i, n2, sj, k - (sj - j));
            } else {
                return find(n1, si, n2, j, k - (si - i));
            }
        }
    }
}