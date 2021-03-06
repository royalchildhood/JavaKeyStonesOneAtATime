package leetcode.linkedlist;

import baseObj.ListNode;
import leetcode.tag.company.Bloomberg;
import leetcode.tag.level.Medium;
import leetcode.tag.type.LinkedListTag;
import leetcode.tag.type.Sorting;

/**
 * 147. Insertion Sort List
 *
 * Sort a linked list using insertion sort.
 *
 *
 * A graphical example of insertion sort. The partial sorted list (black) initially contains only the first element in the list.
 * With each iteration one element (red) is removed from the input data and inserted in-place into the sorted list
 *
 *
 * Algorithm of Insertion Sort:
 *
 * Insertion sort iterates, consuming one input element each repetition, and growing a sorted output list.
 * At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list, and inserts it there.
 * It repeats until no input elements remain.
 *
 * Example 1:
 *
 * Input: 4->2->1->3
 * Output: 1->2->3->4
 * Example 2:
 *
 * Input: -1->5->3->4->0
 * Output: -1->0->3->4->5
 */
@Bloomberg

@Medium
@Sorting
@LinkedListTag
public class InsertionSortList {
    public ListNode insertionSortList(ListNode head) {

        ListNode walker = head, walkerNext = null;
        // l is a fake head
        ListNode dummy = new ListNode(0);

        while(walker != null) {
            walkerNext = walker.next;

            // re-search again
            ListNode swap = dummy;

            while(swap.next != null && swap.next.val < walker.val) {
                swap = swap.next;
            }

            walker.next = swap.next;
            swap.next = walker;
            walker = walkerNext;
        }

        return  dummy.next;
    }
}
