//83. Remove Duplicates from Sorted List
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        /*
        //Code Writer : Aman
        //Mistake to remember : Not using prev pointer prviously (Do not forget to use it ) 
        //Time complexity : O(n), Space Complexity : O(n)
        HashSet<Integer> set = new HashSet();

        ListNode temp = head;// curr node
        ListNode prev = null;// prev  node

        while(temp != null){
            if(set.contains(temp.val)){
                prev.next = temp.next;// removing curr node
            }
            else {
                set.add(temp.val);// if this node appear first time then add it in set
                prev = temp;// move prev to temp
            }
            temp = temp.next;// move temp to next node

        }
        return head;
        */

        ListNode node = head;

        while(head != null && head.next != null){
            if(head.val == head.next.val) head.next = head.next.next;
            else head = head.next;
        }
        return node;
    }
}