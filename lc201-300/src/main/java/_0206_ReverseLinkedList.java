/**
 * <h2>206. Reverse Linked List</h2>
 * <a href="https://leetcode.cn/problems/reverse-linked-list/">LeetCode link</a>
 *
 * @author Jacob Suen
 * @create 20:52 20/09/2023
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