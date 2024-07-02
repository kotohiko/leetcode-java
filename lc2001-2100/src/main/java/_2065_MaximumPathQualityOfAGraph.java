import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/maximum-path-quality-of-a-graph/description/">
 * <h1>2065. 最大化一张图中的路径价值</h1></a>
 *
 * @author Jacob Suen
 * @since 23:31 Jul 01, 2024
 */
class MaximumPathQualityOfAGraph_Solution {
    int ans = 0;
    int[] values;
    int maxTime;
    List<int[]>[] g;
    boolean[] visited;

    public int maximalPathQuality(int[] values, int[][] edges, int maxTime) {
        this.values = values;
        this.maxTime = maxTime;
        int n = values.length;
        g = new List[n];
        for (int i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }
        for (int[] edge : edges) {
            g[edge[0]].add(new int[]{edge[1], edge[2]});
            g[edge[1]].add(new int[]{edge[0], edge[2]});
        }

        visited = new boolean[n];
        visited[0] = true;

        dfs(0, 0, values[0]);
        return ans;
    }

    public void dfs(int u, int time, int value) {
        if (u == 0) {
            ans = Math.max(ans, value);
        }
        for (int[] arr : g[u]) {
            int v = arr[0], dist = arr[1];
            if (time + dist <= maxTime) {
                if (!visited[v]) {
                    visited[v] = true;
                    dfs(v, time + dist, value + values[v]);
                    visited[v] = false;
                } else {
                    dfs(v, time + dist, value);
                }
            }
        }
    }
}