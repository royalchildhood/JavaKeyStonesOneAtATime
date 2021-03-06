package leetcode.linkedlist;

import baseObj.ListNode;
import leetcode.tag.company.Amazon;
import leetcode.tag.company.Apple;
import leetcode.tag.company.Bloomberg;
import leetcode.tag.company.Google;
import leetcode.tag.company.Microsoft;
import leetcode.tag.level.Medium;
import leetcode.tag.type.LinkedListTag;

/**
 2 Add Two Numbers

 You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 Example:

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 Explanation: 342 + 465 = 807.
 */

@Amazon
@Microsoft
@Apple
@Bloomberg
@Google

@Medium
@LinkedListTag
public class AddTwoNumbers
{
    /**
     * Trick list: dummy head, merge two linked list, but doing calculation instead
     *
     * starting from a new head
     */
    public static ListNode addTwoNumbersAnswer(ListNode l1, ListNode l2)
    {
        ListNode dummyHead = new ListNode(0);

        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;

        while (p != null || q != null)
        {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;

            // Set current nodeValue
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (p != null)
            {
                p = p.next;
            }
            if (q != null)
            {
                q = q.next;
            }
        }

        if (carry > 0)
        {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}
