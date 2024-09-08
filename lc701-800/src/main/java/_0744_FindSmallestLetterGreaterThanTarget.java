/**
 * <a href="https://leetcode.cn/problems/find-smallest-letter-greater-than-target/">
 * <h1>744. Find Smallest Letter Greater Than Target</h1></a>
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