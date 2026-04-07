// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         int n = nums.length;
//         int[] result = new int[n];

//         int posIndex = 0;  // for positive numbers (even positions)
//         int negIndex = 1;  // for negative numbers (odd positions)

//         for (int num : nums) {
//             if (num > 0) {
//                 result[posIndex] = num;
//                 posIndex += 2;   // move to next even position
//             } else {
//                 result[negIndex] = num;
//                 negIndex += 2;   // move to next odd position
//             }
//         }

//         return result;
//     }
// }

class Solution {
    public int[] rearrangeArray(int[] A) {
        int n = A.length;
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        // Step 1: Separate positives and negatives
        for (int i = 0; i < n; i++) {
            if (A[i] > 0)
                pos.add(A[i]); // Add to positives
            else
                neg.add(A[i]); // Add to negatives
        }

        // Step 2: Place positives at even indices and negatives at odd indices
        for (int i = 0; i < n / 2; i++) {
            A[2 * i] = pos.get(i);       // Even index → positive
            A[2 * i + 1] = neg.get(i);   // Odd index → negative
        }

        return A;
    }
}