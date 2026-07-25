package cognizant;

//  Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class LinkedList {
    ListNode head;

    public void printLinkedList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> "); // nice arrow formatting
            }
            current = current.next;
        }
        System.out.println(); // move to new line after printing
    }
}
