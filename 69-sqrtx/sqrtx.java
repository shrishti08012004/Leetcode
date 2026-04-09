class Solution {
    public int mySqrt(int x) {
        int low = 1;
        int high = x;
        int ans = 0;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if ((long) mid * mid == x) {
                return mid;          // perfect square
            }
            else if ((long) mid * mid < x) {
                ans = mid;           // possible answer
                low = mid + 1;       // move right
            }
            else {
                high = mid - 1;      // move left
            }
        }
        return ans;
    }
}


