import java.util.*;

import java.util.*;

class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                list.add(1);
            }
            ans.add(list);
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    ans.get(i).set(j,1);
                }
                else {
                    int val = ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
                    ans.get(i).set(j,val);
                }
            }
        }
        return ans;
    }
}

// class Solution {
//     public List<List<Integer>> generate(int numRows) {
//         List<List<Integer>> triangle = new ArrayList<>();

//         // Base case: first row is always [1]
//         if (numRows == 0) return triangle;

//         // Add the first row
//         triangle.add(new ArrayList<>());
//         triangle.get(0).add(1);

//         // Build each next row
//         for (int i = 1; i < numRows; i++) {
//             List<Integer> prevRow = triangle.get(i - 1);
//             List<Integer> currentRow = new ArrayList<>();

//             // First element is always 1
//             currentRow.add(1);

//             // Middle elements
//             for (int j = 1; j < i; j++) {
//                 int num = prevRow.get(j - 1) + prevRow.get(j);
//                 currentRow.add(num);
//             }

//             // Last element is always 1
//             currentRow.add(1);

//             // Add the current row to the triangle
//             triangle.add(currentRow);
//         }

//         return triangle;
//     }
// }
