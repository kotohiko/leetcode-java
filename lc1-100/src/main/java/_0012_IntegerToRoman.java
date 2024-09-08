/**
 * <a href="https://leetcode.cn/problems/integer-to-roman/"><h1>12. Integer to Roman</h1></a>
 *
 * @author Kotohiko
 * @since 09:34 Dec 06, 2023
 */
class IntegerToRoman_Solution {
    public String intToRoman(int num) {
        // 把阿拉伯数字与罗马数字可能出现的所有情况和对应关系，放在两个数组中，并且按照阿拉伯数字的大小降序排列
        var nums = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        var romans = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder stringBuilder = new StringBuilder();
        var index = 0;
        while (index < 13) {
            // 特别注意：这里是等号
            while (num >= nums[index]) {
                stringBuilder.append(romans[index]);
                num -= nums[index];
            }
            ++index;
        }
        return stringBuilder.toString();
    }
}