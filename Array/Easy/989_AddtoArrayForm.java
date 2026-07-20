package Array.Easy;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int i = num.length - 1;

        while (i >= 0 && k > 0) {
            k += num[i];
            num[i] = k % 10;
            k /= 10;
            i--;
        }

        List<Integer> ans = new ArrayList<>();

        while (k > 0) {
            ans.add(k % 10);
            k /= 10;
        }

        Collections.reverse(ans);

        for (int x : num) {
            ans.add(x);
        }

        return ans;
    }
}