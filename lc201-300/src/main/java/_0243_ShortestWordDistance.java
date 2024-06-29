/**
 * <a href="https://leetcode.cn/problems/shortest-word-distance/"><h1>243. Shortest Word Distance</h1></a>
 *
 * @author Jacob Suen
 * @since 16:06 Sep 21, 2023
 */
class ShortestWordDistance_Solution {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        var n = wordsDict.length;
        var left = -1;
        var right = -1;
        var ans = n;
        for (var i = 0; i < n; ++i) {
            if (wordsDict[i].equals(word1)) {
                left = i;
            } else if (wordsDict[i].equals(word2)) {
                right = i;
            }
            if (left >= 0 && right >= 0) {
                ans = Math.min(ans, Math.abs(left - right));
            }
        }
        return ans;
    }
}