import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/problems/split-with-minimum-sum/"><h1>2578. Split With Minimum Sum</h1></a>
 *
 * @author Jacob Suen
 * @since 15:46 Oct 09, 2023
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