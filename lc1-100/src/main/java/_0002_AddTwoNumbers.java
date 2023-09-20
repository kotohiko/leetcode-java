/**
 * <h2>2. Add Two Numbers</h2>
 * <a href="https://leetcode.cn/classic/problems/add-two-numbers/">LeetCode link</a>
 *
 * @author Jacob Suen
 * @since 12:13 20/09/2023
 */
class AddTwoNumbers_Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode tmp = dummy;
        var t = 0;
        while (l1 != null || l2 != null) {
            var a = l1 != null ? l1.val : 0;
            var b = l2 != null ? l2.val : 0;
            t += a + b;
            tmp.next = new ListNode(t % 10);
            t /= 10;
            tmp = tmp.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (t > 0) {
            tmp.next = new ListNode(t);
        }
        return dummy.next;
    }
}