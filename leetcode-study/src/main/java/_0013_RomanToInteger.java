import java.util.HashMap;
import java.util.Map;

/**
 * <h2>13. 罗马数字转整数</h2>
 * <a href="https://leetcode.cn/problems/roman-to-integer/">LeetCode link</a>
 *
 * @author Jacob Suen
 */
class RomanToInteger_Solution {

    Map<Character, Integer> map = new HashMap<>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public int romanToInt(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            int val = map.get(s.charAt(i));
            if (i < n - 1 && val < map.get(s.charAt(i + 1))) {
                ans -= val;
            } else {
                ans += val;
            }
        }
        return ans;
    }
}
