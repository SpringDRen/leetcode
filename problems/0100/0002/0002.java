/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode add = l1;
        ListNode first = l1;
        ListNode second = l2;

        for (int flag = 0;;) {
            int value = flag;
            flag = 0;
            if (first != null) {
                value = value + first.val;
                first = first.next;
            }
            if (second != null) {
                value = value + second.val;
                second = second.next;
            }
            if (value >= 10) {
                flag = 1;
                value = value - 10;
            }
            add.val = value;
            if (first == null && second == null && flag == 0) {
                break;
            }
            if (add.next == null) {
                add.next = new ListNode();
            }
            add = add.next;
        }

        return l1;
    }
}