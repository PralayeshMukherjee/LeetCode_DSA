// https://leetcode.com/problems/subsets-ii/description/

// 90. Subsets II

class Solution {
    public void f(int i,List<Integer> ll,List<List<Integer>> list, int[] nums){
        // if(i==nums.length){
        //     list.add(new ArrayList<>(ll));
        //     return;
        // }
        list.add(new ArrayList<>(ll));
        for(int j=i;j<nums.length;j++){
            if(j>i && nums[j]==nums[j-1]) continue;
            ll.add(nums[j]);
            f(j+1,ll,list,nums);
            ll.remove(ll.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list  = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        Arrays.sort(nums);
        f(0,ll,list,nums);
        return list;
    }
}