/**
 * <h2>24. 两两交换链表中的节点</h2>
 * <p>
 * <a href="https://leetcode.cn/problems/swap-nodes-in-pairs/">LeetCode link</a>
 *
 * @author Jacob Suen
 */
class SwapNodesInPairs_Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = head.next;
        head.next = swapPairs(newHead.next);
        newHead.next = head;
        return newHead;
    }
}
