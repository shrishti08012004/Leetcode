class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        brute(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    private void brute(int[] arr, int target, int index, List<Integer> curr, List<List<Integer>> res) {
        
        if (target == 0) {
            res.add(new ArrayList<>(curr));
            return;
        }

        if (index == arr.length || target < 0) {
            return;
        }

        // Take current element
        curr.add(arr[index]);
        brute(arr, target - arr[index], index, curr, res);

        // Don't take current element
        curr.remove(curr.size() - 1);
        brute(arr, target, index + 1, curr, res);
    }
}