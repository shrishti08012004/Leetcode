// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         HashMap <Integer , Integer> map=new HashMap<>();
//         int result[] = new int[2];
//         for(int i=0;i<nums.length;i++){
//             if(map.containsKey(target- nums[i])){
//                 result[0]= map.get(target-nums[i]);
//                 result[1]=i;
//                 break;
//             }
//             map.put(nums[i],i);
//         }
//         return result;    
//     }
// }

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] temp = nums.clone();
        Arrays.sort(temp);

        int i = 0, j = temp.length - 1;

        while (i < j) {
            int sum = temp[i] + temp[j];

            if (sum == target) {
                int first = temp[i];
                int second = temp[j];

                int idx1 = -1, idx2 = -1;

                // find indices in original array
                for (int k = 0; k < nums.length; k++) {
                    if (nums[k] == first && idx1 == -1) {
                        idx1 = k;
                    } 
                    else if (nums[k] == second && idx2 == -1) {
                        idx2 = k;
                    }
                }

                return new int[]{idx1, idx2};
            } 
            else if (sum < target) {
                i++;
            } 
            else {
                j--;
            }
        }

        return new int[]{-1, -1};
    }
}
