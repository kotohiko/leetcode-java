package org.jacob.leetcode.java.test;

import com.eclipsesource.json.Json;
import org.jacob.leetcode.java.solution._3019_NumberOfChangingKeys_Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _3019_NumberOfChangingKeysTest {
    public static String stringToString(String input) {
        return Json.parse("[" + input + "]").asArray().get(0).asString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String s = stringToString(line);

            int ret = new _3019_NumberOfChangingKeys_Solution().countKeyChanges(s);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}