//https://leetcode.com/problems/linked-list-cycle-ii/description/

// 142. Linked List Cycle II

class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp = head;
        HashMap<ListNode,Integer> map = new HashMap<>();
        while(temp!=null){
            if(map.containsKey(temp)){
                return temp;
            }else{
                map.put(temp,map.getOrDefault(temp,0)+1);
            }
            temp = temp.next;
        }
        return null;
    }
}