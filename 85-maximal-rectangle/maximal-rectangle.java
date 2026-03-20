import java.util.*;

class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] heights = new int[cols];
        int maxArea = 0;

        for (int i = 0; i < rows; i++) {

            // Build histogram for current row
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '1') {
                    heights[j] = heights[j] + 1;
                } else {
                    heights[j] = 0;
                }
            }

            // Find max rectangle in this histogram
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }

        return maxArea;
    }

    private int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int currHeight = (i == n) ? 0 : heights[i];

            while (!st.isEmpty() && heights[st.peek()] > currHeight) {
                int height = heights[st.pop()];

                int rightSmallIndex = i;
                int leftSmallIndex = st.isEmpty() ? -1 : st.peek();

                int width = rightSmallIndex - leftSmallIndex - 1;
                int area = height * width;

                maxArea = Math.max(maxArea, area);
            }

            st.push(i);
        }

        return maxArea;
    }
}