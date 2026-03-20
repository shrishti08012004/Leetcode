import java.util.*;

class Solution {
    public int[] canSeePersonsCount(int[] arr) {

        int n = arr.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        // last person sees no one
        st.push(arr[n - 1]);
        ans[n - 1] = 0;

        // traverse from right to left
        for(int i = n - 2; i >= 0; i--){

            int count = 0;

            // remove all shorter people
            while(!st.isEmpty() && st.peek() <= arr[i]){
                count++;
                st.pop();
            }

            // if someone taller exists → can see that also
            if(!st.isEmpty()){
                count++;
            }

            ans[i] = count;

            // push current height
            st.push(arr[i]);
        }

        return ans;
    }
}