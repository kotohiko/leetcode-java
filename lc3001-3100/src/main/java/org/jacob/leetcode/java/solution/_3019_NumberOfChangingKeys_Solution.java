package org.jacob.leetcode.java.solution;

/**
 * <a href="https://leetcode.cn/problems/number-of-changing-keys/description">
 * <h1>3019. Number of Changing Keys</h1></a>
 * <p>
 * [Easy]
 * <p>
 * You are given a <b>0-indexed</b> string {@code s} typed by a user. Changing a key is defined as using a key
 * different from the last used key. For example, {@code s = "ab"} has a change of a key while {@code s = "bBBb"}
 * does not have any.
 * <p>
 * Return <i>the number of times the user had to change the key</i>.
 * <p>
 * <b>Note:</b> Modifiers like shift or caps lock won't be counted in changing the key that is if a user typed the letter 'a' and then the letter 'A' then it will not be considered as a changing of key.
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> {@code s = "aAbBcC"}
 * <p>
 * <b>Output:</b> {@code 2}
 * <p>
 * <b>Explanation: </b>
 * <p>
 * {@code From s[0] = 'a' to s[1] = 'A', there is no change of key as caps lock or shift is not counted.}<p>
 * {@code From s[1] = 'A' to s[2] = 'b', there is a change of key.}<p>
 * {@code From s[2] = 'b' to s[3] = 'B', there is no change of key as caps lock or shift is not counted.}<p>
 * {@code From s[3] = 'B' to s[4] = 'c', there is a change of key.}<p>
 * {@code From s[4] = 'c' to s[5] = 'C', there is no change of key as caps lock or shift is not counted.}
 * </blockquote>
 *
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> {@code s = "AaAaAaaA"}
 * <p>
 * <b>Output:</b> {@code 0}
 * <p>
 * <b>Explanation: </b>{@code There is no change of key since only the letters 'a' and 'A' are pressed which does not require change of key.}
 * </blockquote>
 *
 * <p>
 * <b>Constraints:</b>
 * <p>
 * <ul>
 *     <li>{@code 1 <= s.length <= 100}</li>
 *     <li>{@code s} consists of only upper case and lower case English letters.</li>
 * </ul>
 *
 * @author Kotohiko
 * @version 1.0
 * @since 10:01:08 Jan 07, 2025
 */
public class _3019_NumberOfChangingKeys_Solution {
    public int countKeyChanges(String s) {
        var ans = 0;
        for (var i = 1; i < s.length(); ++i) {
            if ((s.charAt(i - 1) & 31) != (s.charAt(i) & 31)) {
                ++ans;
            }
        }
        return ans;
    }
}



