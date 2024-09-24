/**
 * <a href="https://leetcode.cn/problems/find-smallest-letter-greater-than-target/">
 * <h1>744. Find Smallest Letter Greater Than Target</h1></a>
 * [Easy]
 * <p>
 * You are given an array of characters{@code letters}that is sorted in <b>non-decreasing</b> order,
 * and a character{@code target}. There are <b>at least two different</b> characters in{@code letters}.
 * <p>
 * Return <i>the smallest character in</i>{@code letters}<i>that is lexicographically greater than</i>
 * {@code target}.
 * If such a character does not exist, return the first character in{@code letters}.
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input: </b>{@code letters = ["c","f","j"], target = "a"}
 * <p>
 * <b>Output: </b>{@code "c"}
 * <p>
 * <b>Explanation: </b>The smallest character that is lexicographically greater than 'a' in letters is 'c'.
 * </blockquote>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input: </b>{@code letters = ["c","f","j"], target = "c"}
 * <p>
 * <b>Output: </b>{@code "f"}
 * <p>
 * <b>Explanation: </b>The smallest character that is lexicographically greater than 'c' in letters is 'f'.
 * </blockquote>
 * Example 3:
 * <blockquote>
 * <b>Input: </b>{@code letters = ["x","x","y","y"], target = "z"}
 * <p>
 * <b>Output: </b>{@code "x"}
 * <p>
 * <b>Explanation: </b>There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
 * </blockquote>
 * <b>Constraints:</b>
 * <p>
 * <ul>
 *     <li>{@code 2 <= letters.length <= 104}</li>
 *     <li>{@code letters[i]} is a lowercase English letter.</li>
 *     <li>letters is sorted in non-decreasing order.</li>
 *     <li>letters contains at least two different characters.</li>
 *     <li>target is a lowercase English letter.</li>
 * </ul>
 *
 * @author Kotohiko
 * @since 10:30 Sep 22, 2023
 */
class FindSmallestLetterGreaterThanTarget_Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for (var letter : letters) {
            if (letter > target) {
                return letter;
            }
        }
        return letters[0];
    }
}