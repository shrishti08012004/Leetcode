class Solution {

    private void helper(List<Integer> arr, int[] nums, int idx, List<List<Integer>> res){

        // Base case
        if(idx == nums.length){
            res.add(new ArrayList<>(arr)); // ✅ copy
            return;
        }

        // 🔸 Pick
        arr.add(nums[idx]);
        helper(arr, nums, idx + 1, res);

        // 🔸 Backtrack (remove last)
        arr.remove(arr.size() - 1);

        // 🔸 Skip
        helper(arr, nums, idx + 1, res);
    }

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();

        helper(arr, nums, 0, res);

        return res;
    }
}