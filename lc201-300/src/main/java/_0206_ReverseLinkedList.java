/**
 * <a href="https://leetcode.cn/problems/reverse-linked-list/"><h1>206. Reverse Linked List</h1></a>
 *
 * @author Kotohiko
 * @since 20:52 Sep 20, 2023
 */
class ReverseLinkedList_Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode tmp;
        while (head != null) {
            tmp = head.next;
            head.next = prev;
            prev = head;
            head = tmp;
        }
        return prev;
    }
}