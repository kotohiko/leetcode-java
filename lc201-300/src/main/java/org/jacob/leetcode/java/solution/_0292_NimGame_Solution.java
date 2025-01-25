package org.jacob.leetcode.java.solution;

/**
 * <a href="https://leetcode.cn/problems/nim-game/description/"><h1>292. Nim Game</h1></a>
 *
 * @author Kotohiko
 * @since 12:36 Sep 13, 2024
 */
public class _0292_NimGame_Solution {
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }
}