//https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/

//83. Remove Duplicates from Sorted List

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;
        while(list!=null && list.next!=null){
            if(list.val==list.next.val){
                list.next = list.next.next;
            }else{
                list = list.next;
            }
        }
        return head;
    }
}