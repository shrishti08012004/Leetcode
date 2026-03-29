// class Solution {
//     public int arrangeCoins(int n) {
//         int rows = 0;
//         int coins = n;

//         for (int i = 1; i <= n; i++) {
//             if (coins >= i) {
//                 coins -= i;   // use i coins
//                 rows++;       // one full row built
//             } else {
//                 break;        // not enough coins
//             }
//         }
//         return rows;
//     }
// }

class Solution {
    public int arrangeCoins(int n) {
        long low = 0, high = n;
        
        while (low <= high) {
            long mid = low + (high - low) / 2;
            long coins = mid * (mid + 1) / 2;

            if (coins == n) {
                return (int) mid;
            } 
            else if (coins < n) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        return (int) high;
    }
}
