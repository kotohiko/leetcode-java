/**
 * <a href="https://leetcode.cn/problems/number-of-students-doing-homework-at-a-given-time/description/">
 * <h1>1450. Number of Students Doing Homework at a Given Time</h1>
 * </a>
 *
 * @author Kotohiko
 * @since 15:43 Sep 06, 2024
 */
class NumberOfStudentsDoingHomeworkAtAGivenTime_Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        var ans = 0;
        var n = startTime.length;
        for (var i = 0; i < n; ++i) {
            if (queryTime <= endTime[i] && queryTime >= startTime[i]) {
                ++ans;
            }
        }
        return ans;
    }
}