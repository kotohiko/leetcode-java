package org.jacob.leetcode.java.solution;

/**
 * <a href="https://leetcode.cn/problems/convert-date-to-binary/description/">
 *     <h1>3280. Convert Date to Binary</h1>
 *     </a>
 *     <p>
 * [Easy]
 *
 * <p>
 * You are given a string {@code date} representing a Gregorian calendar date in the {@code yyyy-mm-dd} format.
 * <p>
 * {@code date} can be written in its binary representation obtained by converting year, month,
 * and day to their binary representations without any leading zeroes and writing them down in {@code year-month-day} format.
 * <p>
 * Return the <b>binary</b> representation of date.
 * <p>
 *
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> {@code date = "2080-02-29"}
 * <p>
 * <b>Output:</b> {@code "100000100000-10-11101"}
 * <p>
 * <b>Explanation: </b>
 * <p>
 *     {@code 100000100000, 10, and 11101 are the binary representations of 2080, 02, and 29 respectively.}
 * </blockquote>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> {@code date = "1900-01-01"}
 * <p>
 * <b>Output:</b> {@code "11101101100-1-1"}
 * <p>
 * <b>Explanation: </b>
 * <p>
 *     {@code 11101101100, 1, and 1 are the binary representations of 1900, 1, and 1 respectively.}
 * </blockquote>
 *
 * <p>
 * <b>Constraints:</b>
 * <p>
 * <ul>
 *     <li>{@code date.length == 10}</li>
 *     <li>{@code date[4] == date[7] == '-'}, and all other {@code date[i]}'s are digits.</li>
 *     <li>The input is generated such that {@code date} represents a valid Gregorian calendar date between
 *     Jan 1<sup>st</sup>, 1900 and Dec 31<sup>st</sup>, 2100 (both inclusive).</li>
 * </ul>
 *
 * @author Kotohiko
 * @since 14:11 Jan 3, 2025
 */
public class _03280_ConvertDateToBinary_Solution {
    public String convertDateToBinary(String date) {
        String[] splitStr = date.split("-");
        StringBuilder ret = new StringBuilder();
        for (String s : splitStr) {
            ret.append(Integer.toBinaryString(Integer.parseInt(s))).append("-");
        }
        return ret.deleteCharAt(ret.length() - 1).toString();
    }
}