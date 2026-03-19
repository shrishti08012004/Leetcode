import java.util.*;

// class Solution {
//     public int[] nextGreaterElements(int[] nums) {

//         int n = nums.length;
//         int[] nge = new int[n];

//         Stack<Integer> st = new Stack<>();

//         for(int i = 2*n - 1; i >= 0; i--){

//             int idx = i % n;

//             while(!st.isEmpty() && st.peek() <= nums[idx]){
//                 st.pop();
//             }

//             if(i < n){
//                 if(st.isEmpty()) nge[idx] = -1;
//                 else nge[idx] = st.peek();
//             }

//             st.push(nums[idx]);
//         }

//         return nge;
//     }
//  }

class Solution {

    public int[] nextGreaterElements(int[] arr) {

        int n = arr.length;
        int[] nge = new int[n];

        Stack<Integer> st = new Stack<>();

        // Step 1: Fill stack (simulate circular)
        for(int i = n - 1; i >= 0; i--){
            st.push(arr[i]);
        }

        // Step 2: Find next greater elements
        for(int i = n - 1; i >= 0; i--){

            // remove smaller elements
            while(!st.isEmpty() && arr[i] >= st.peek()){
                st.pop();
            }

            // assign answer
            if(st.isEmpty())
                nge[i] = -1;
            else
                nge[i] = st.peek();

            // push current element
            st.push(arr[i]);
        }

        return nge;
    }
}