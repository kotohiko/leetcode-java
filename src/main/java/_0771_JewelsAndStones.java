import java.util.HashSet;
import java.util.Set;

/**
 * <h2>771. 宝石与石头</h2>
 * <p>
 * <a href="https://leetcode.cn/problems/jewels-and-stones/">LeetCode link</a>
 *
 * @author Jacob Suen
 */
class JewelsAndStones_Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int jewelsLength = jewels.length();
        int stonesLength = stones.length();
        int ans = 0;
        Set<Character> jewelsSet = new HashSet<>();
        for (int i = 0; i < jewelsLength; ++i) {
            jewelsSet.add(jewels.charAt(i));
        }
        for (int i = 0; i < stonesLength; ++i) {
            if (jewelsSet.contains(stones.charAt(i))) {
                ans++;
            }
        }
        return ans;
    }
}
