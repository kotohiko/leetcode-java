/**
 * <h2>48. Rotate Image</h2>
 * <a href="https://leetcode.cn/problems/rotate-image/">LeetCode link</a>
 *
 * @author Jacob Suen
 * @since 12:36 Nov 29, 2023
 */
class RotateImage_Solution {
    public void rotate(int[][] matrix) {
        var n = matrix.length;
        for (var i = 0; i < n / 2; ++i) {
            for (var j = 0; j < (n + 1) / 2; ++j) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[n - j - 1][i];
                matrix[n - j - 1][i] = matrix[n - i - 1][n - j - 1];
                matrix[n - i - 1][n - j - 1] = matrix[j][n - i - 1];
                matrix[j][n - i - 1] = temp;
            }
        }
    }
}