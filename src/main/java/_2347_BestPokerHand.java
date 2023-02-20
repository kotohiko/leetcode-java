import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <h2>2347. 最好的扑克手牌</h2>
 * <p>
 * <a href="https://leetcode.cn/problems/best-poker-hand/">LeetCode link</a>
 *
 * @author Jacob Suen
 */
@SuppressWarnings("unused")
class BestPokerHand_Solution {
    public String bestHand(int[] ranks, char[] suits) {
        Set<Character> set = new HashSet<>();
        for (char suit : suits) {
            set.add(suit);
        }
        if (set.size() == 1) {
            return "Flush";
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int rank : ranks) {
            map.put(rank, map.getOrDefault(rank, 0) + 1);
        }
        if (map.size() == 5) {
            return "High Card";
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 2) {
                return "Three of a Kind";
            }
        }
        return "Pair";
    }
}
