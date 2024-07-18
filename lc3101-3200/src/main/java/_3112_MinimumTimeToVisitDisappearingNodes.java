import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * <a href="https://leetcode.cn/problems/minimum-time-to-visit-disappearing-nodes/">
 * <h1>3112. Minimum Time to Visit Disappearing Nodes</h1></a>
 *
 * @author Jacob Suen
 * @since 10:20 7月 18, 2024
 */
class MinimumTimeToVisitDisappearingNodes_Solution {
    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
        // 稀疏图用邻接表
        List<int[]>[] g = new ArrayList[n];
        Arrays.setAll(g, i -> new ArrayList<>());
        for (int[] e : edges) {
            int x = e[0];
            int y = e[1];
            int wt = e[2];
            g[x].add(new int[]{y, wt});
            g[y].add(new int[]{x, wt});
        }

        int[] dis = new int[n];
        Arrays.fill(dis, -1);
        dis[0] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] - b[0]));
        pq.offer(new int[]{0, 0});
        while (!pq.isEmpty()) {
            int[] p = pq.poll();
            int dx = p[0];
            int x = p[1];
            // x 之前出堆过
            if (dx > dis[x]) {
                continue;
            }
            for (int[] e : g[x]) {
                int y = e[0];
                int newDis = dx + e[1];
                if (newDis < disappear[y] && (dis[y] < 0 || newDis < dis[y])) {
                    // 更新 x 的邻居的最短路
                    dis[y] = newDis;
                    pq.offer(new int[]{newDis, y});
                }
            }
        }
        return dis;
    }
}