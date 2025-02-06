package org.jacob.leetcode.java.solution;

/**
 * <a href="https://leetcode.cn/problems/find-the-town-judge/description/"><h1>997. Find the Town Judge</h1></a>
 * [Easy]
 * <p>
 * In a town, there are{@code n}people labeled from{@code 1}to{@code n}.
 * There is a rumor that one of these people is secretly the town judge.
 * <p>
 * If the town judge exists, then:
 * <p>
 * <ol>
 *   <li>The town judge trusts nobody.</li>
 *   <li>Everybody (except for the town judge) trusts the town judge.</li>
 *   <li>There is exactly one person that satisfies properties <b>1</b> and <b>2</b>.</li>
 * </ol>
 * You are given an array{@code trust}where<code>trust[i] = [a<sub>i</sub>, b<sub>i</sub>]</code>representing that
 * the person labeled<code>a<sub>i</sub></code>trusts the person labeled<code>b<sub>i</sub></code>.
 * If a trust relationship does not exist in{@code trust}array, then such a trust relationship does not exist.
 * <p>
 * Return <i>the label of the town judge if the town judge exists and can be identified,
 * or return</i> {@code -1} <i>otherwise.</i>
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input: </b>{@code n = 2, trust = [[1,2]]}
 * <p>
 * <b>Output: </b>{@code 2}
 * </blockquote>
 *
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input: </b>{@code n = 3, trust = [[1,3],[2,3]]}
 * <p>
 * <b>Output: </b>{@code 3}
 * </blockquote>
 *
 * <b>Example 3:</b>
 * <blockquote>
 * <b>Input: </b>{@code n = 3, trust = [[1,3],[2,3],[3,1]]}
 * <p>
 * <b>Output: </b>{@code -1}
 * </blockquote>
 * <p>
 * <b>Constraints:</b>
 * <ul>
 *   <li>1 ≤ n ≤ 1000</li>
 *   <li><code>0 ≤ trust.length ≤ 10<sup>4</sup></code></li>
 *   <li>{@code trust[i].length == 2}</li>
 *   <li>All the pairs of{@code trust}are <b>unique</b>.</li>
 *   <li><code>a<sub>i</sub> != b<sub>i</sub></code></li>
 *   <li><code>1 ≤ a<sub>i</sub>, b<sub>i</sub> ≤ n</code></li>
 * </ul>
 *
 * @author Kotohiko
 * @since 12:23 Sep 23, 2024
 */
public class _0997_FindTheTownJudge_Solution {

    public int findJudge(int n, int[][] trust) {
        int[] trustCounts = new int[n + 1];
        int[] trustGiven = new int[n + 1];

        for (int[] t : trust) {
            int truster = t[0];
            int trusted = t[1];
            ++trustCounts[trusted];
            ++trustGiven[truster];
        }

        for (int i = 1; i <= n; i++) {
            if (trustCounts[i] == n - 1 && trustGiven[i] == 0) {
                return i;
            }
        }

        return -1;
    }
}