package org.jacob.leetcode.java.test;

import org.jacob.leetcode.java.solution._1450_NumberOfStudentsDoingHomeworkAtAGivenTime_Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LeetCode Playground
 */
public class _1450_NumberOfStudentsDoingHomeworkAtAGivenTimeTest {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.isEmpty()) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for (int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] startTime = stringToIntegerArray(line);
            line = in.readLine();
            int[] endTime = stringToIntegerArray(line);
            line = in.readLine();
            int queryTime = Integer.parseInt(line);

            int ret = new _1450_NumberOfStudentsDoingHomeworkAtAGivenTime_Solution()
                    .busyStudent(startTime, endTime, queryTime);

            String out = String.valueOf(ret);

            System.out.println(out);
        }
    }
}