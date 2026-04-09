// class Solution {
//     public int peakIndexInMountainArray(int[] arr) {
//         int s=0;
//         int e=arr.length-1;

//         while(s<e){
//             int m= s+(e-s)/2;
//             if(arr[m]>arr[m+1]){
//                 e=m;
//                 }
//                 else{
//                     s=m+1;
//                 }
//             }
//             return s;
//         }
//     }


class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int s = 1;                  // start from 1 (safe)
        int e = arr.length - 2;     // end at n-2 (safe)

        while (s <= e) {
            int m = s + (e - s) / 2;

            // ✅ Check if peak
            if (arr[m] > arr[m - 1] && arr[m] > arr[m + 1]) {
                return m;
            }
            // 🔸 Increasing side → go right
            else if (arr[m] > arr[m - 1]) {
                s = m + 1;
            }
            // 🔸 Decreasing side → go left
            else {
                e = m - 1;
            }
        }

        return -1; // should not happen
    }
}

