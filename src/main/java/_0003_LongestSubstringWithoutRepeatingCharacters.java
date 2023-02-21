import java.util.HashMap;
import java.util.Map;

/**
 * <h2>3. 无重复字符的最长子串</h2>
 * <p>
 * <a href="https://leetcode.cn/problems/longest-substring-without-repeating-characters/">LeetCode link</a>
 *
 * @author Jacob Suen
 */
class LongestSubstringWithoutRepeatingCharacters_Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length();
        int ans = 0;
        for (int i = 0, j = 0; j < n; ++j) {
            char jCh = s.charAt(j);
            map.put(jCh, map.getOrDefault(jCh, 0) + 1);
            while (map.get(jCh) > 1) {
                char iCh = s.charAt(i);
                map.put(iCh, map.get(iCh) - 1);
                ++i;
            }
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
    }
}
