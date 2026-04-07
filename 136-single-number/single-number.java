// class Solution {
//     public int singleNumber(int[] nums) {
//         int Xor = 0;
//         for(int i=0;i<nums.length;i++){ // Xor^nums[i]
//            // Xor^= nums[i];
//            Xor= Xor ^ nums[i];
//         }
//         return Xor;
//     }
// }

import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int ele : nums) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }

        // Find element with frequency 1
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }

        return -1; // fallback
    }
}