// class Solution {
//     public boolean check(int[] nums) {
//         int count = 0;
//         int n = nums.length;

//         for (int i = 0; i < n; i++) {
//          // compare current element with next (using modulo for circular array)
//             if (nums[i] > nums[(i + 1) % n]) {
//                 count++;
//             }
//             // if more than 1 breaks found, it's not sorted-rotated
//             if (count > 1) {
//                 return false;
//             }
//         }

//         return true;
//     }
// }

class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
         // compare current element with next (using modulo for circular array)
            if (nums[i] > nums[(i+1)%n]) {
                count++;
            }
            // if more than 1 breaks found, it's not sorted-rotated
            if (count > 1) {
                return false;
            }
        }

        return true;
    }
}