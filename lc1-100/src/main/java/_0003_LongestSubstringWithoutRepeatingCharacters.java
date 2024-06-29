import java.util.HashMap;

/**
 * <h1>3. Longest Substring Without Repeating Characters</h1>
 * <a href="https://leetcode.cn/problems/longest-substring-without-repeating-characters/">LeetCode link</a>
 *
 * @author Jacob Suen
 * @since 19:05 Sep 20, 2023
 */
class LongestSubstringWithoutRepeatingCharacters_Solution {
    public int lengthOfLongestSubstring(String s) {
        var map = new HashMap<Character, Integer>();
        var n = s.length();
        var ans = 0;
        for (int i = 0, j = 0; j < n; ++j) {
            var jCh = s.charAt(j);
            map.put(jCh, map.getOrDefault(jCh, 0) + 1);
            while (map.get(jCh) > 1) {
                var iCh = s.charAt(i);
                map.put(iCh, map.get(iCh) - 1);
                ++i;
            }
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}