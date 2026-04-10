import java.util.*;

class Solution {
    public int minimumDistance(int[] nums) {

        HashMap<Integer, List<Integer>> map = new HashMap<>();

        // Step 1: store indices
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        int ans = Integer.MAX_VALUE;

        // Step 2: check each value
        for (List<Integer> list : map.values()) {

            if (list.size() < 3) continue;

            // check consecutive triplets
            for (int i = 0; i <= list.size() - 3; i++) {
                int i1 = list.get(i);
                int i2 = list.get(i + 1);
                int i3 = list.get(i + 2);

                int dist = Math.abs(i1 - i2) + Math.abs(i2 - i3) + Math.abs(i3 - i1);

                ans = Math.min(ans, dist);
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}