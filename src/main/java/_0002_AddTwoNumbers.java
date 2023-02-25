/**
 * <h2>2. 两数相加</h2>
 * <p>
 * <a href="https://leetcode.cn/problems/add-two-numbers/">LeetCode link</a>
 *
 * @author Jacob Suen
 */
class AddTwoNumbers_Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        int t = 0;
        while (l1 != null || l2 != null) {
            int a = l1 != null ? l1.val : 0;
            int b = l2 != null ? l2.val : 0;
            t += a + b;
            cur.next = new ListNode(t % 10);
            t /= 10;
            cur = cur.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (t > 0) {
            cur.next = new ListNode(t);
        }
        return dummy.next;
    }
}
