package org.jacob.leetcode.java.solution;

/**
 * <a href="https://leetcode.cn/problems/integer-to-roman/"><h1>12. Integer to Roman</h1></a>
 * [Medium]
 * <p>
 * Seven different symbols represent Roman numerals with the following values:
 * <table>
 * <tr>
 *      <th>Symbol</th>
 *      <th>Value</th>
 * </tr>
 * <tr>
 *      <td>I</td>
 *      <td>1</td>
 * </tr>
 * <tr>
 *      <td>V</td>
 *      <td>5</td>
 * </tr>
 * <tr>
 *      <td>X</td>
 *      <td>10</td>
 * </tr>
 * <tr>
 *      <td>L</td>
 *      <td>50</td>
 * </tr>
 * <tr>
 *      <td>C</td>
 *      <td>100</td>
 * </tr>
 * <tr>
 *      <td>D</td>
 *      <td>500</td>
 * </tr>
 * <tr>
 *      <td>M</td>
 *      <td>1000</td>
 * </tr>
 * </table>
 * Roman numerals are formed by appending the conversions of decimal place values from highest to lowest.
 * Converting a decimal place value into a Roman numeral has the following rules:
 * <p>
 * <ul>
 *     <li>If the value does not start with 4 or 9, select the symbol of the maximal value that can be subtracted
 *     from the input, append that symbol to the result, subtract its value, and convert the remainder to
 *     a Roman numeral.</li>
 *     <li>If the value starts with 4 or 9 use the subtractive form representing one symbol subtracted from
 *     the following symbol, for example, 4 is 1 ({@code I}) less than 5 ({@code V}): IV and 9 is 1 (<code>I</code>)
 *     less than 10 (X): IX.
 *     Only the following subtractive forms are used: 4 ({@code IV}), 9 ({@code IX}), 40 ({@code XL}), 90 ({@code XC}),
 *     400 ({@code CD}) and 900 ({@code CM}).</li>
 *     <li>Only powers of 10 (({@code I}), ({@code X}), ({@code C}), ({@code M})) can be appended consecutively
 *     at most 3 times to represent multiples of 10.
 *     You cannot append 5 ({@code V}), 50 ({@code L}), or 500 ({@code D}) multiple times. If you need
 *     to append a symbol 4 times
 *     use the subtractive form.</li>
 * </ul>
 * <p>
 * Given an integer, convert it to a Roman numeral.
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * Input: num = 3749
 * <p>
 * Output: "MMMDCCXLIX"
 * <p>
 * <b>Explanation: </b><p>
 *     3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)<p>
 *  700 = DCC as 500 (D) + 100 (C) + 100 (C)<p>
 *   40 = {@code XL} as 10 ({@code X}) less of 50 ({@code L})<p>
 *    9 = IX as 1 (I) less of 10 (X)<p>
 * Note: 49 is not 1 (I) less of 50 (L) because the conversion is based on decimal places
 * </blockquote>
 *
 * <b>Example 2:</b>
 * <blockquote>
 * Input: num = 58
 * <p>
 * Output: "LVIII"<p>
 * <b>Explanation: </b><p>
 * 50 = L<p>
 *  8 = VIII
 * </blockquote>
 *
 * <b>Example 3:</b>
 * <blockquote>
 * Input: num = 1994
 * <p>
 * Output: "MCMXCIV"<p>
 * <b>Explanation: </b>
 * <p>
 * 1000 = {@code M}<p>
 *  900 = {@code CM}<p>
 *   90 = {@code XC}<p>
 *    4 = {@code IV}
 * </blockquote>
 * <p>
 * <b>Constraints:</b>
 * <ul>
 *     <li>{@code 1 <= num <= 3999}</li>
 * </ul>
 *
 * @author Kotohiko
 * @since 09:34 Dec 06, 2023
 */
public class _0012_IntegerToRoman_Solution {
    public String intToRoman(int num) {
        var nums = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        var romans = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder stringBuilder = new StringBuilder();
        var index = 0;
        while (index < 13) {
            while (num >= nums[index]) {
                stringBuilder.append(romans[index]);
                num -= nums[index];
            }
            ++index;
        }
        return stringBuilder.toString();
    }
}