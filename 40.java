
class Solution {

    public void Soln(int idx, int[] candidates, List<Integer> ans,
                     int target, List<List<Integer>> result) {

        if(target == 0) {
            result.add(new ArrayList<>(ans));
            return;
        }

        for(int i = idx; i < candidates.length; i++) {

            if(i > idx && candidates[i] == candidates[i - 1]) {
                continue;
            }

            if(candidates[i] > target) {
                break;
            }

            // PICK
            ans.add(candidates[i]);

            Soln(i + 1, candidates, ans,
                 target - candidates[i], result);

            // BACKTRACK
            ans.remove(ans.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        Soln(0, candidates, ans, target, result);

        return result;
    }
}
