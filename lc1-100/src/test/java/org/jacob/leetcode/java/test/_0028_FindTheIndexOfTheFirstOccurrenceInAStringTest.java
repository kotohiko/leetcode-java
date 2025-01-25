package org.jacob.leetcode.java.test;

import com.eclipsesource.json.Json;
import org.jacob.leetcode.java.solution._0028_FindTheIndexOfTheFirstOccurrenceInAString_Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LeetCode Playground
 */
public class _0028_FindTheIndexOfTheFirstOccurrenceInAStringTest {
    public static String stringToString(String input) {
        return Json.parse("[" + input + "]").asArray().get(0).asString();
    }

    public static void main(String[] args) throws IOException {
        var in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            var haystack = stringToString(line);
            line = in.readLine();
            var needle = stringToString(line);

            var ret = new _0028_FindTheIndexOfTheFirstOccurrenceInAString_Solution().strStr(haystack, needle);

            var out = String.valueOf(ret);

            System.out.println(out);
        }
    }
}