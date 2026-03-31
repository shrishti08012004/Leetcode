// class Solution {
//     public int rob(int[] money) {
//        return rob(money,0);
//     }

//      public int rob(int[] money, int houseNo) {

//         //base case
//         if(houseNo>=money.length){
//             return 0;
//         }
//         //choice 1- rob the current house and then skip the next house
//         int choice1 = money[houseNo] + rob(money, houseNo+2);

//         //choice 2- not pick the current house , just move to the next house
//         int choice2 = rob(money, houseNo+1);

//         int result = Math.max(choice1, choice2);
//         return result;

//     }
// }

// //Approach 2: Memoization
// class Solution {
//     public int rob(int[] money) {
//         Integer[] cache = new  Integer[money.length];
//        return rob(money,0,cache);
//     }

//      public int rob(int[] money, int houseNo, Integer cache[]) {
//         //base case
//         if(houseNo>=money.length){
//             return 0;
//         }
//         //before doing choice 1 , first check  is it already compute it
//         if(cache[houseNo]!= null){
//             return cache[houseNo];
//         }
//         //choice 1- rob the current house and then skip the next house
//         int choice1 = money[houseNo] + rob(money, houseNo+2,cache);

//         //choice 2- not pick the current house , just move to the next house
//         int choice2 = rob(money, houseNo+1, cache);

//         int result = Math.max(choice1, choice2);
//         cache[houseNo] = result;
//         return result;

//     }
// }

//Approach 3: Tabulation

class Solution {
    public int rob(int[] money) {
        int n = money.length;
        if (n == 0) return 0;
        if (n == 1) return money[0];

        int[] dp = new int[n];

        // Base cases
        dp[0] = money[0];
        dp[1] = Math.max(money[0], money[1]);

        // Build the dp table
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], money[i] + dp[i - 2]);
        }

        return dp[n - 1];
    }
}
