/**
 * <a href="https://leetcode.cn/problems/find-the-town-judge/description/"><h1>997. Find the Town Judge</h1></a>
 *
 * @author Kotohiko
 * @since 12:23 Sep 23, 2024
 */
class FindTheTownJudge_Solution {
    public int findJudge(int n, int[][] trust) {
        // 初始化两个数组，用于记录每个人被信任的次数和信任别人的次数
        // 被信任次数
        int[] trustCounts = new int[n + 1];
        // 信任别人次数
        int[] trustGiven = new int[n + 1];

        // 遍历trust数组，统计每个人的被信任次数和信任别人次数
        for (int[] t : trust) {
            // 信任别人的人
            int truster = t[0];
            // 被信任的人
            int trusted = t[1];
            // 被信任次数 +1
            trustCounts[trusted]++;
            // 信任别人次数 +1
            trustGiven[truster]++;
        }

        // 查找法官（被信任 n-1 次且没有信任别人的人）
        for (int i = 1; i <= n; ++i) {
            // 法官必须被所有人（n-1 人）信任，并且没有信任过任何人
            if (trustCounts[i] == n - 1 && trustGiven[i] == 0) {
                // 返回法官的编号
                return i;
            }
        }

        // 如果没有找到法官，则返回 -1
        return -1;
    }
}