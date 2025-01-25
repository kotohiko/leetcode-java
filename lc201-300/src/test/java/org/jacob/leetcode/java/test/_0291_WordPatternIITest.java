package org.jacob.leetcode.java.test;

import com.eclipsesource.json.Json;
import org.jacob.leetcode.java.solution._0291_WordPatternII_Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Kotohiko
 * @since 10:17 Jan 25, 2025
 */
public class _0291_WordPatternIITest {
    public static String stringToString(String input) {
        return Json.parse("[" + input + "]").asArray().get(0).asString();
    }

    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String pattern = stringToString(line);
            line = in.readLine();
            String s = stringToString(line);

            boolean ret = new _0291_WordPatternII_Solution().wordPatternMatch(pattern, s);

            String out = booleanToString(ret);

            System.out.print(out);
        }
    }
}