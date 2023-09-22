/**
 * <h2>744. Find Smallest Letter Greater Than Target</h2>
 * <a href="https://leetcode.cn/problems/find-smallest-letter-greater-than-target/">LeetCode link</a>
 *
 * @author Jacob Suen
 * @create 10:30 22/09/2023
 */
class FindSmallestLetterGreaterThanTarget_Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        for (char letter : letters) {
            if (letter > target) {
                return letter;
            }
        }
        return letters[0];
    }
}