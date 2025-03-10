package org.jacob.leetcode.java.test;

import com.eclipsesource.json.Json;
import org.jacob.leetcode.java.solution._3112_MinimumTimeToVisitDisappearingNodes_Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LeetCode Playground
 */
public class _3112_MinimumTimeToVisitDisappearingNodesTest {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.isEmpty()) {
            return new int[0];
        }

        var parts = input.split(",");
        var output = new int[parts.length];
        for (var index = 0; index < parts.length; index++) {
            var part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static int[][] stringToInt2dArray(String input) {
        var jsonArray = Json.parse(input).asArray();
        if (jsonArray.isEmpty()) {
            return new int[0][0];
        }

        var arr = new int[jsonArray.size()][];
        for (var i = 0; i < arr.length; i++) {
            var cols = jsonArray.get(i).asArray();
            arr[i] = stringToIntegerArray(cols.toString());
        }
        return arr;
    }

    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }

        var result = new StringBuilder();
        for (var index = 0; index < length; index++) {
            var number = nums[index];
            result.append(number).append(", ");
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }

    public static void main(String[] args) throws IOException {
        var in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            var n = Integer.parseInt(line);
            line = in.readLine();
            var edges = stringToInt2dArray(line);
            line = in.readLine();
            var disappear = stringToIntegerArray(line);

            var ret = new _3112_MinimumTimeToVisitDisappearingNodes_Solution().minimumTime(n, edges, disappear);

            var out = integerArrayToString(ret);

            System.out.println(out);
        }
    }
}