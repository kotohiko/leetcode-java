package org.jacob.leetcode.java.solution;

import org.jacob.leetcode.java.common.ListNode;

/**
 * <a href="https://leetcode.cn/problems/add-two-numbers/"><h1>2. Add Two Numbers</h1></a>
 * [Medium]
 * <p>
 * You are given two <b>non-empty</b> linked lists representing two non-negative integers.
 * The digits are stored in <b>reverse order</b>, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 *
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input: </b>{@code l1 = [2,4,3], l2 = [5,6,4]}
 * <p>
 * <b>Output: </b>{@code [7,0,8]}
 * <p>
 * <b>Explanation: </b>
 * 342 + 465 = 807.
 * </blockquote>
 *
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input: </b>{@code l1 = [0], l2 = [0]}
 * <p>
 * <b>Output: </b>{@code [0]}
 * </blockquote>
 *
 * <b>Example 3:</b>
 * <blockquote>
 * <b>Input: </b>{@code l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]}
 * <p>
 * <b>Output: </b>{@code [8,9,9,9,0,0,0,1]}
 * </blockquote>
 *
 * <b>Constraints:</b>
 * <ul>
 *   <li>The number of nodes in each linked list is in the range [1, 100].</li>
 *   <li>0 ≤ {@code Node.val} ≤ 9</li>
 *   <li>It is guaranteed that the list represents a number that does not have leading zeros.</li>
 * </ul>
 *
 * @author Kotohiko
 * @since 12:13 Sep 20, 2023
 */
public class _0002_AddTwoNumbers_Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var dummy = new ListNode(0);
        var current = dummy;
        var carry = 0;

        while (l1 != null || l2 != null) {
            var x = (l1 != null) ? l1.val : 0;
            var y = (l2 != null) ? l2.val : 0;
            var sum = carry + x + y;

            current.next = new ListNode(sum % 10);
            carry = sum / 10;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

            current = current.next;
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummy.next;
    }
}