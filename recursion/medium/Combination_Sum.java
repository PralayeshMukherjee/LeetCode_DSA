// https://leetcode.com/problems/combination-sum/description/

// 39. Combination Sum
import java.util.*;
class Solution {
    public void f(int i,int target,List<List<Integer>> list,List<Integer> ll,int[] candidates){
        if(i==candidates.length){
            if(target==0){
                list.add(new ArrayList<>(ll));
            }
            return;
        }
        if(candidates[i]<=target){
            ll.add(candidates[i]);
            f(i,target-candidates[i],list,ll,candidates);
            ll.remove(ll.size()-1);
        }
        f(i+1,target,list,ll,candidates);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        f(0,target,list,ll,candidates);
        return list;
    }
}