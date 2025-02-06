package org.jacob.leetcode.java.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/maximum-path-quality-of-a-graph/description/">
 * <h1>2065. Maximum Path Quality of a Graph</h1></a>
 *
 * @author Kotohiko
 * @since 23:31 Jul 01, 2024
 */
public class _2065_MaximumPathQualityOfAGraph_Solution {

    /**
     * The maximum path quality found
     */
    private int ans = 0;

    /**
     * The values associated with each node
     */
    private int[] values;

    /**
     * The maximum allowed time for the path
     */
    private int maxTime;

    /**
     * The graph represented as an adjacency list
     */
    private List<int[]>[] g;

    /**
     * An array to keep track of visited nodes
     */
    private boolean[] visited;

    /**
     * Finds the maximal path quality in a graph.
     *
     * <p>This method finds the maximal path quality in a graph, where the quality of a path is defined as the sum of
     * the values of all distinct nodes visited on the path. The path must start and end at node 0, and the total time
     * spent on the path (sum of edge weights) must not exceed the given{@code maxTime}.
     *
     * <p>The method works as follows:
     * <ol>
     *     <li>Initialize the graph using an adjacency list representation.</li>
     *     <li>Populate the graph with the given edges.</li>
     *     <li>Initialize the{@code visited}array to keep track of visited nodes.</li>
     *     <li>Start a depth-first search (DFS) from node 0, passing the initial time and value.</li>
     *     <li>During the DFS, update the{@code ans}with the maximum path quality found that ends at node 0.</li>
     * </ol>
     *
     * @param values  The values associated with each node.
     * @param edges   The edges of the graph, where each edge is represented as [u, v, time].
     * @param maxTime The maximum allowed time for the path.
     * @return The maximal path quality.
     */
    @SuppressWarnings("unchecked")
    public int maximalPathQuality(int[] values, int[][] edges, int maxTime) {
        // Initialize the values array
        this.values = values;
        // Initialize the maximum allowed time
        this.maxTime = maxTime;
        // Number of nodes in the graph
        var n = values.length;

        // Initialize the graph as an adjacency list
        g = new List[n];
        for (var i = 0; i < n; i++) {
            g[i] = new ArrayList<>();
        }

        // Populate the graph with the given edges
        for (var edge : edges) {
            // Add edge from u to v with weight
            g[edge[0]].add(new int[]{edge[1], edge[2]});
            // Add edge from v to u with weight
            g[edge[1]].add(new int[]{edge[0], edge[2]});
        }

        // Initialize the visited array
        visited = new boolean[n];
        // Mark the starting node as visited
        visited[0] = true;

        // Start the DFS from node 0 with initial time and value
        dfs(0, 0, values[0]);
        // Return the maximal path quality
        return ans;
    }

    /**
     * Performs a depth-first search (DFS) to find the maximal path quality.
     *
     * <p>This helper method performs a depth-first search (DFS) to explore all possible paths starting from the
     * current node{@code u}. It updates the{@code ans}with the maximum path quality found that ends at node 0.
     *
     * <p>The method works as follows:
     * <ol>
     *     <li>If the current node is node 0, update the{@code ans}with the maximum path quality found so far.</li>
     *     <li>For each neighbor{@code v}of the current node{@code u}, if the total time spent does not exceed{@code maxTime}:
     *         <ul>
     *             <li>If{@code v}has not been visited, mark it as visited and recursively call{@code dfs}for{@code v}.</li>
     *             <li>If{@code v}has been visited, recursively call{@code dfs}for{@code v}without adding its value again.</li>
     *         </ul>
     *     </li>
     *     <li>Backtrack by marking the current node{@code u}as unvisited after exploring all its neighbors.</li>
     * </ol>
     *
     * @param u     The current node.
     * @param time  The current time spent on the path.
     * @param value The current path quality.
     */
    public void dfs(int u, int time, int value) {
        // If we are back at the starting node, update the maximal path quality
        if (u == 0) {
            ans = Math.max(ans, value);
        }

        // Explore all neighbors of the current node
        for (int[] arr : g[u]) {
            // Neighbor node
            var v = arr[0];
            // Distance to the neighbor
            var dist = arr[1];

            // If the total time spent does not exceed the maximum allowed time
            if (time + dist <= maxTime) {
                // If the neighbor has not been visited
                if (!visited[v]) {
                    // Mark the neighbor as visited
                    visited[v] = true;
                    // Recursively call dfs for the neighbor, adding its value to the current path quality
                    dfs(v, time + dist, value + values[v]);
                    // Backtrack: mark the neighbor as unvisited
                    visited[v] = false;
                } else {
                    // Recursively call dfs for the neighbor without adding its value again
                    dfs(v, time + dist, value);
                }
            }
        }
    }
}