//21. Merge Two Sorted Lists
class Solution {
    //Code Writer -: Aman 
    //Time Complexity -: O(n+m), Space Complexity - O(1)
    //Last time cofused on temp = head1 or temp = head2
    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode node = new ListNode(7);// dummmy node
        ListNode temp = node;//node creating a node for traversing

        //execute while one list is compelted
        while(head1 != null && head2 != null){
            if(head1.val > head2.val){
                temp.next = head2;
                head2 = head2.next;
            }else{
                temp.next = head1;
                head1 = head1.next;
            }
            temp = temp.next;
        }
        //add remaining list
        if(head1 != null) temp.next = head1;
        if(head2 != null)  temp.next = head2;

        //return next node beacuse we created one extra node for dummy
        return node.next;
    }
}