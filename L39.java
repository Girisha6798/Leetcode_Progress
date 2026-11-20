class Solution {
    public void Soln(int idx, int[] arr, int target, List<Integer> ans, List<List<Integer>> result){
        if(idx >= arr.length){
            if(target == 0){ // agar level niche jate takk target 0 hogya to add ans in result
                result.add(new ArrayList<>(ans));
            }
            return; // to end 
        }
        if(arr[idx] <= target){ // = also as arr[i] = 7 for target 7 is also right
            ans.add(arr[idx]);
            Soln(idx, arr, target - arr[idx], ans, result); // same ele add, target reduce hota jaega
            ans.remove(ans.size() - 1); // backtrack krne ke lye added ele ko remove and then backtrack
        }

        Soln(idx + 1, arr, target, ans, result);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Soln(0, candidates, target, ans, result);
        return result;
    }
}