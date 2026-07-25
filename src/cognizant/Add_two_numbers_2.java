package cognizant;

public class Add_two_numbers_2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;

            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummyHead.next;
    }

    static void main() {
        ListNode h1 = new ListNode(2);
        h1.next = new ListNode(3);
        h1.next.next = new ListNode(4);

        ListNode h2 = new ListNode(5);
        h2.next = new ListNode(6);
        h2.next.next = new ListNode(7);

        LinkedList list = new LinkedList();
        list.head = addTwoNumbers(h1, h2);
        list.printLinkedList();
    }
}
