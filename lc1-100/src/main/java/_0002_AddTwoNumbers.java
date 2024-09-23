/**
 * <a href="https://leetcode.cn/problems/add-two-numbers/"><h1>2. Add Two Numbers</h1></a>
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
 * <b>Input: </b>l1 = [2,4,3], l2 = [5,6,4]
 * <p>
 * <b>Output: </b>[7,0,8]
 * <p>
 * <b>Explanation: </b>
 * 342 + 465 = 807.
 * </blockquote>
 *
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input: </b>l1 = [0], l2 = [0]
 * <p>
 * <b>Output: </b>[0]
 * </blockquote>
 *
 * <b>Example 3:</b>
 * <blockquote>
 * <b>Input: </b>l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * <p>
 * <b>Output: </b>[8,9,9,9,0,0,0,1]
 * </blockquote>
 *
 * <b>Constraints:</b>
 * <ul>
 *   <li>The number of nodes in each linked list is in the range [1, 100].</li>
 *   <li>0 <= Node.val <= 9</li>
 *   <li>It is guaranteed that the list represents a number that does not have leading zeros.</li>
 * </ul>
 *
 * @author Kotohiko
 * @since 12:13 Sep 20, 2023
 */
class AddTwoNumbers_Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Initialize a dummy head node to simplify head insertion
        var dummy = new ListNode(0);
        // Use current to iterate through the result list
        var current = dummy;
        // Initialize carry to 0
        var carry = 0;

        // Iterate through both lists simultaneously
        while (l1 != null || l2 != null) {
            // If l1 is not null, get its value, else 0
            var x = (l1 != null) ? l1.val : 0;
            // If l2 is not null, get its value, else 0
            var y = (l2 != null) ? l2.val : 0;

            // Add the values of the current nodes, along with the carry from the previous addition
            var sum = carry + x + y;

            // Update the current node's next to a new node with the sum modulo 10
            current.next = new ListNode(sum % 10);

            // Update carry for the next addition
            carry = sum / 10;

            // Move to the next nodes in both lists
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }

            // Move to the next node in the result list
            current = current.next;
        }

        // If there's still a carry after iterating through both lists, add it to the result
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        // Return the head of the result list (skipping the dummy node)
        return dummy.next;
    }
}