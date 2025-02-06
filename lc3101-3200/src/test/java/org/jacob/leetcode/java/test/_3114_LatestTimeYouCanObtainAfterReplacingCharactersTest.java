package org.jacob.leetcode.java.test;

import com.eclipsesource.json.Json;
import org.jacob.leetcode.java.solution._3114_LatestTimeYouCanObtainAfterReplacingCharacters_Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LeetCode Playground
 */
public class _3114_LatestTimeYouCanObtainAfterReplacingCharactersTest {
    public static String stringToString(String input) {
        return Json.parse("[" + input + "]").asArray().get(0).asString();
    }

    public static void main(String[] args) throws IOException {
        var in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            var s = stringToString(line);

            var out = new _3114_LatestTimeYouCanObtainAfterReplacingCharacters_Solution().findLatestTime(s);

            System.out.println(out);
        }
    }
}