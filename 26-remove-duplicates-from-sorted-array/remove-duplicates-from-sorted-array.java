class Solution {
    public int removeDuplicates(int[] nums) {
    int  writer = 0;
    for(int reader =1; reader<nums.length; reader++){
        if(nums[reader]!= nums[writer]){
            writer++;
            nums[writer]= nums[reader];
            // writer++;
        }
    }
      return writer+1;  
    }
}



// class Solution {
//     public int removeDuplicates(int[] nums) {
        
//         HashSet<Integer> set = new HashSet<>();

//         // Step 1: Add elements to set
//         for (int ele : nums) {
//             set.add(ele);
//         }

//         // Step 2: Put unique elements back into array
//         int i = 0;
//         for (int val : set) {
//             nums[i] = val;
//             i++;
//         }

//         // Step 3: Sort again (important to maintain order)
//         Arrays.sort(nums, 0, i);

//         return i; // number of unique elements
//     }
// }