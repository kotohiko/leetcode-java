package org.jacob.leetcode.java.solution;

import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/problems/maximum-number-of-coins-you-can-get/description/">
 *     <h1>1561. Maximum Number of Coins You Can Get</h1>
 *     </a>
 * [Medium]
 * <p>
 * There are {@code 3n} piles of coins of varying size, you and your friends will take piles of coins as follows:
 * <p>
 *     <ul>
 *         <li>
 *             In each step, you will choose <b>any</b> <code>3</code> piles of coins (not necessarily consecutive).
 *         </li>
 *         <li>
 *             Of your choice, Alice will pick the pile with the maximum number of coins.
 *         </li>
 *         <li>
 *             You will pick the next pile with the maximum number of coins.
 *         </li>
 *         <li>
 *             Your friend Bob will pick the last pile.
 *         </li>
 *         <li>
 *             Repeat until there are no more piles of coins.
 *         </li>
 *     </ul>
 * Given an array of integers {@code piles} where {@code piles[i]} is the number of coins in the i<sup>th</sup> pile.
 * Return the maximum number of coins that you can have.
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> {@code piles = [2,4,1,2,7,8]}
 * <p>
 * <b>Output:</b> {@code 9}
 * <p>
 * <b>Explanation: </b>Choose the triplet (2, 7, 8), Alice Pick the pile with 8 coins, you the pile with <b>7</b> coins and Bob the last one.<p>
 * Choose the triplet (1, 2, 4), Alice Pick the pile with 4 coins, you the pile with <b>2</b> coins and Bob the last one.<p>
 * The maximum number of coins which you can have are: 7 + 2 = 9.<p>
 * On the other hand if we choose this arrangement (1, <b>2</b>, 8), (2, <b>4</b>, 7) you only get 2 + 4 = 6 coins which is not optimal.
 * </blockquote>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> {@code piles = [2,4,5]}
 * <p>
 * <b>Output:</b> {@code 4}
 * </blockquote>
 * <b>Example 3:</b>
 * <blockquote>
 * <b>Input:</b> {@code piles = [9,8,7,6,5,1,2,3,4]}
 * <p>
 * <b>Output:</b> {@code 18}
 * </blockquote>
 * <b>Constraints:</b>
 * <p>
 * <ul>
 *     <li><code>3 ≤ piles.length ≤ 10<sup>5</sup></code></li>
 *     <li>{@code piles.length % 3 == 0}</li>
 *     <li><code>1 ≤ piles[i] ≤ 10<sup>4</sup></code></li>
 * </ul>
 * @author Kotohiko
 * @since 08:40:25 Jan 22, 2025
 */
public class _1561_MaximumNumberOfCoinsYouCanGet_Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        var res = 0;
        var cycle = piles.length / 3;
        var i = piles.length - 2;
        var cnt = 0;
        while (i > 0 && cnt < cycle) {
            res += piles[i];
            i -= 2;
            ++cnt;
        }
        return res;
    }
}