// class Solution {
//     public double findMedianSortedArrays(int[] nums1, int[] nums2) {

//         int m = nums1.length;
//         int n = nums2.length;

//         int[] merged = new int[m+n];

//         int i=0,j=0,k=0;

//         // merge arrays
//         while(i<m && j<n){

//             if(nums1[i] < nums2[j])
//                 merged[k++] = nums1[i++];
//             else
//                 merged[k++] = nums2[j++];
//         }

//         while(i<m)
//             merged[k++] = nums1[i++];

//         while(j<n)
//             merged[k++] = nums2[j++];

//         int total = m+n;

//         if(total%2==1)
//             return merged[total/2];
//         else
//             return (merged[total/2] + merged[total/2 -1]) / 2.0;
//     }
// }

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if(nums1.length > nums2.length)
            return findMedianSortedArrays(nums2, nums1);

        int m = nums1.length;
        int n = nums2.length;

        int low = 0;
        int high = m;

        while(low <= high){

            int partitionX = (low + high)/2;
            int partitionY = (m+n+1)/2 - partitionX;

            int maxLeftX = (partitionX==0) ? Integer.MIN_VALUE : nums1[partitionX-1];
            int minRightX = (partitionX==m) ? Integer.MAX_VALUE : nums1[partitionX];

            int maxLeftY = (partitionY==0) ? Integer.MIN_VALUE : nums2[partitionY-1];
            int minRightY = (partitionY==n) ? Integer.MAX_VALUE : nums2[partitionY];

            if(maxLeftX <= minRightY && maxLeftY <= minRightX){

                if((m+n)%2==0)
                    return (Math.max(maxLeftX,maxLeftY) + Math.min(minRightX,minRightY))/2.0;
                else
                    return Math.max(maxLeftX,maxLeftY);
            }

            else if(maxLeftX > minRightY)
                high = partitionX - 1;

            else
                low = partitionX + 1;
        }

        return 0;
    }
}