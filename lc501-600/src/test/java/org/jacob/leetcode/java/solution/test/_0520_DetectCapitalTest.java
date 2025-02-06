package org.jacob.leetcode.java.solution.test;

import com.eclipsesource.json.Json;
import org.jacob.leetcode.java.solution._0520_DetectCapital_Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _0520_DetectCapitalTest {
    public static String stringToString(String input) {
        return Json.parse("[" + input + "]").asArray().get(0).asString();
    }

    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }

    public static void main(String[] args) throws IOException {
        var in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            var word = stringToString(line);

            var ret = new _0520_DetectCapital_Solution().detectCapitalUse(word);

            var out = booleanToString(ret);

            System.out.println(out);
        }
    }
}
