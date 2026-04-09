class Solution {
    public int maximumCount(int[] nums) {
        //Method 1:
        int n= nums.length;
        // int l = 0;
        // int h= n-1;
        int pos = 0;
        int neg = 0;
        for(int i=0; i<n; i++){
            if(nums[i]==0) {continue;} 
            if(nums[i]<0) {neg++;}
            if(nums[i]>0) {pos++;}
        }
        return Math.max(pos, neg);   

    

    //      //Method 2: Using Binary Search
    //     // public int maximumCountUsingBinarySearch(int[] nums) {
    //     int n = nums.length;

    //     // count negatives
    //     int neg = firstIndexGreaterEqualZero(nums);

    //     // count positives
    //     int pos = n - firstIndexGreaterThanZero(nums);

    //     return Math.max(neg, pos);
    // }

    // // Finds first index where value >= 0
    // private int firstIndexGreaterEqualZero(int[] nums) {
    //     int l = 0, h = nums.length - 1;
    //     int ans = nums.length;

    //     while (l <= h) {
    //         int m = l + (h - l) / 2;
    //         if (nums[m] >= 0) {
    //             ans = m;
    //             h = m - 1;
    //         } else {
    //             l = m + 1;
    //         }
    //     }
    //     return ans;
    // }

    // // Finds first index where value > 0
    // private int firstIndexGreaterThanZero(int[] nums) {
    //     int l = 0, h = nums.length - 1;
    //     int ans = nums.length;

    //     while (l <= h) {
    //         int m = l + (h - l) / 2;
    //         if (nums[m] > 0) {
    //             ans = m;
    //             h = m - 1;
    //         } else {
    //             l = m + 1;
    //         }
    //     }
    //     return ans;

    }
}




