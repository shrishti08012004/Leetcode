class Solution {
    // public int subarraySum(int[] nums, int k) {
    //     int n= nums.length;
    //     int count = 0;

    //     for(int i=0; i<n; i++){ // starting point
    //           int  sum = 0;
    //           for(int j=i; j<n; j++){
    //             sum += nums[j];
    //             if(sum == k)  count++;
    //           }
    //     }
    //     return count;
    // }


       public int subarraySum(int[] arr, int k) {
        // Size of the array
        int n = arr.length;

        // Map to store frequency of prefix sums
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();

        // Initialize prefix sum and count of subarrays
        int prefixSum = 0;
        int count = 0;

        // Base case: prefix sum 0 has occurred once
        prefixSumCount.put(0, 1);

        // Traverse through the array
        for (int i = 0; i < n; i++) {
            // Add current element to prefix sum
            prefixSum += arr[i];

            // Calculate the prefix sum that needs to be removed
            int remove = prefixSum - k;

            // If this prefix sum has been seen before,
            // add its count to the result
            if (prefixSumCount.containsKey(remove)) {
                count += prefixSumCount.get(remove);
            }

            // Update the frequency of the current prefix sum
            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);
        }

        // Return the total count of subarrays
        return count;
}
}