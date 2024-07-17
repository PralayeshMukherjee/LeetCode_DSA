//https://leetcode.com/problems/combination-sum-ii/description/

//40. Combination Sum II

class Solution {
    public void f(int i, int target, List<List<Integer>> list, List<Integer> ll, int[] candidates) {
        if (target == 0) {
            list.add(new ArrayList<>(ll));
            return;
        }
        for (int j = i; j < candidates.length; j++) {
            if (j > i && candidates[j] == candidates[j - 1])
                continue;
            if (candidates[j] > target)
                break;

            ll.add(candidates[j]);
            f(j + 1, target - candidates[j], list, ll, candidates);
            ll.remove(ll.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        Arrays.sort(candidates);
        f(0, target, list, ll, candidates);
        return list;
    }
}