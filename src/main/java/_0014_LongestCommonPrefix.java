/**
 * <h2>14. 最长公共前缀</h2>
 * <p>
 * <a href="https://leetcode.cn/problems/longest-common-prefix/">LeetCode link</a>
 *
 * @author Jacob Suen
 */
class LongestCommonPrefix_Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();
        if (strs.length == 0) {
            return ans.toString();
        }
        for (int i = 0; i <= 200; ++i) {
            String s = strs[0];
            if (s.length() <= i) {
                return ans.toString();
            }
            char c = s.charAt(i);
            for (String item : strs) {
                if (i >= item.length() || item.charAt(i) != c) {
                    return ans.toString();
                }
            }
            ans.append(c);
        }
        return ans.toString();
    }
}
