/**
 * <a href="https://leetcode.cn/problems/harshad-number"><h1>3099. Harshad Number</h1></a>
 *
 * @author Jacob Suen
 * @since 07:45 Jul 03, 2024
 */
class HarshadNumber_Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        var sum = 0;
        var copy = x;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return copy % sum == 0 ? sum : -1;
    }
}