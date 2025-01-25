package org.jacob.leetcode.java.test;

import org.jacob.leetcode.java.solution._3099_HarshadNumber_Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LeetCode Playground
 */
public class _3099_HarshadNumberTest {
    public static void main(String[] args) throws IOException {
        var in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            var x = Integer.parseInt(line);

            var ret = new _3099_HarshadNumber_Solution().sumOfTheDigitsOfHarshadNumber(x);

            var out = String.valueOf(ret);

            System.out.println(out);
        }
    }
}