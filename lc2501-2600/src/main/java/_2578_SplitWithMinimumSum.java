import java.util.Arrays;

/**
 * <h2>2578. Split With Minimum Sum</h2>
 * <a href="https://leetcode.cn/problems/split-with-minimum-sum/">LeetCode link</a>
 *
 * @author Jacob Suen
 * @create 15:46 10/09/2023
 */
class SplitWithMinimumSum_Solution {
    public int splitNum(int num) {
        var charNum = Integer.toString(num).toCharArray();
        Arrays.sort(charNum);
        var num1 = 0;
        var num2 = 0;
        for (var i = 0; i < charNum.length; ++i) {
            if (i % 2 == 0) {
                num1 = num1 * 10 + charNum[i] - '0';
            } else {
                num2 = num2 * 10 + charNum[i] - '0';
            }
        }
        return num1 + num2;
    }
}