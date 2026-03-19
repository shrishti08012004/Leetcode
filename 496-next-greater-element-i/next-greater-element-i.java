class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      
        // int[] res = new int[nums1.length];
        
        // for (int i = 0; i < nums1.length; i++) {
        //     int num = nums1[i];
        //     int j = 0;
            
        //     // Find position of nums1[i] in nums2
        //     while (j < nums2.length && nums2[j] != num) {
        //         j++;
        //     }
            
        //     // Now find the next greater element
        //     int k = j + 1;
        //     while (k < nums2.length && nums2[k] <= num) {
        //         k++;
        //     }
            
        //     if (k < nums2.length) {
        //         res[i] = nums2[k];
        //     } else {
        //         res[i] = -1;
        //     }
        // }
        
        // return res;

        // Map<Integer, Integer> map = new HashMap<>(); // num -> next greater
        // Stack<Integer> stack = new Stack<>();

        // for (int num : nums2) {
        //     while (!stack.isEmpty() && num > stack.peek()) {
        //         map.put(stack.pop(), num);
        //     }
        //     stack.push(num);
        // }

        // int[] res = new int[nums1.length];
        // for (int i = 0; i < nums1.length; i++) {
        //     res[i] = map.getOrDefault(nums1[i], -1);
        // }
        // return res;



        int n = nums2.length;

        int[] nge = new int[n];

        Stack<Integer> st = new Stack<>();

        // last element has no greater element
        nge[n-1] = -1;
        st.push(nums2[n-1]);

        // Step 1: find NGE for nums2 (right to left)
        for(int i = n-2; i >= 0; i--){

            while(!st.isEmpty() && nums2[i] >= st.peek()){
                st.pop();
            }

            if(st.isEmpty()) nge[i] = -1;
            else nge[i] = st.peek();

            st.push(nums2[i]);
        }

        // Step 2: map values of nums2 to their NGE
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            map.put(nums2[i], nge[i]);
        }

        // Step 3: answer for nums1
        int[] ans = new int[nums1.length];

        for(int i = 0; i < nums1.length; i++){
            ans[i] = map.get(nums1[i]);
        }

        return ans;
    }
}
    