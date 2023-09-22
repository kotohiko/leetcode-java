/**
 * <h2>21. Merge Two Sorted Lists</h2>
 * <a href="https://leetcode.cn/problems/merge-two-sorted-lists/">LeetCode link</a>
 *
 * @author Jacob Suen
 * @create 17:39 21/09/2023
 */
class MergeTwoSortedLists_Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}