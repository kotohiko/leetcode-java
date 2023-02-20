import java.util.Arrays;

/**
 * <h2>2335. 装满杯子需要的最短总时长</h2>
 * <p>
 * <a href="https://leetcode.cn/problems/minimum-amount-of-time-to-fill-cups/">LeetCode link</a>
 *
 * @author Jacob Suen
 */
class MinimumAmountOfTimeToFillCups_Solution {
    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        if (amount[0] + amount[1] <= amount[2]) {
            return amount[2];
        }
        return ((amount[0] + amount[1] + amount[2] + 1) / 2);
    }
}
