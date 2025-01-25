import java.util.HashMap;

/**
 * <a href="https://leetcode.cn/problems/first-completely-painted-row-or-column/">
 * <h1>2661. First Completely Painted Row or Column</h1></a>
 *
 * @author Kotohiko
 * @since 16:46 Dec 01, 2023
 */
public class _2661_FirstCompletelyPaintedRowOrColumn_Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        var n = mat.length;
        var m = mat[0].length;
        var map = new HashMap<Integer, int[]>();
        for (var i = 0; i < n; ++i) {
            for (var j = 0; j < m; ++j) {
                map.put(mat[i][j], new int[]{i, j});
            }
        }
        var c1 = new int[n];
        var c2 = new int[m];
        for (var i = 0; i < n * m; ++i) {
            var info = map.get(arr[i]);
            var x = info[0];
            var y = info[1];
            if (++c1[x] == m || ++c2[y] == n) {
                return i;
            }
        }
        return -1; // never
    }
}