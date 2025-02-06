package org.jacob.leetcode.java.test;

import com.eclipsesource.json.Json;
import org.jacob.leetcode.java.solution._03280_ConvertDateToBinary_Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LeetCode Playground
 */
public class _3280_ConvertDateToBinaryTest {
    public static String stringToString(String input) {
        return Json.parse("[" + input + "]").asArray().get(0).asString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String date = stringToString(line);

            String out = (new _03280_ConvertDateToBinary_Solution().convertDateToBinary(date));

            System.out.print(out);
        }
    }
}