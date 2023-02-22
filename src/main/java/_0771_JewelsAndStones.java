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
        int jLength = jewels.length();
        int sLength = stones.length();
        int ans = 0;
        Set<Character> jSet = new HashSet<>();
        for (int i = 0; i < jLength; ++i) {
            char jewel = jewels.charAt(i);
            jSet.add(jewel);
        }
        for (int i = 0; i < sLength; ++i) {
            char stone = stones.charAt(i);
            if (jSet.contains(stone)) {
                ++ans;
            }
        }
        return ans;
    }
}
