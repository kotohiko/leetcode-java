package org.jacob.leetcode.java.test;

import com.eclipsesource.json.Json;
import org.jacob.leetcode.java.solution._2661_FirstCompletelyPaintedRowOrColumn_Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LeetCode Playground
 */
public class _2661_FirstCompletelyPaintedRowOrColumnTest {
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

    public static void main(String[] args) throws IOException {
        var in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            var arr = stringToIntegerArray(line);
            line = in.readLine();
            var mat = stringToInt2dArray(line);

            var ret = new _2661_FirstCompletelyPaintedRowOrColumn_Solution().firstCompleteIndex(arr, mat);

            var out = String.valueOf(ret);

            System.out.println(out);
        }
    }
}
