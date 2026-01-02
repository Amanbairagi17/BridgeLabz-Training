//234. Palindrome Linked List
class Solution {
    private ListNode cloneList(ListNode head){
        if(head == null) return null;

        ListNode newNode = new ListNode(head.val);
        ListNode newCurr = newNode;
        ListNode oldCurr = head;

        while(oldCurr != null){
            newCurr.next  = new ListNode(oldCurr.val);
            oldCurr = oldCurr.next;
            newCurr = newCurr.next;
           
        }

        return newNode;
    }
    private ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode temp = cloneList(head);
        ListNode newHead = reverse(temp);

        ListNode curr = head;
        ListNode newCurr = newHead;

        while(curr != null && newCurr != null){
            if(curr.val != newCurr.val) return false;
            curr = curr.next;
            newCurr = newCurr.next;
        }
        return true;


    }
}