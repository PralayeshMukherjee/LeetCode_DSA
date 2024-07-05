//https://leetcode.com/problems/merge-two-sorted-lists/description/

//21. Merge Two Sorted Lists

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode node = new ListNode(-1);
        ListNode list = node;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                list.next = list2;
                list2 = list2.next;
            } else {
                list.next = list1;
                list1 = list1.next;
            }
            list =list.next;
        }
        if(list1==null){
            list.next = list2;
        }
        if(list2==null){
            list.next = list1;
        }
        return node.next;
    }
}