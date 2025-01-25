package org.jacob.leetcode.java.test;

import org.jacob.leetcode.java.solution._1561_MaximumNumberOfCoinsYouCanGet_Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Kotohiko
 * @since 23:50 1月 24, 2025
 */
public class _1561_MaximumNumberOfCoinsYouCanGetTest {
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
            int[] piles = stringToIntegerArray(line);

            int ret = new _1561_MaximumNumberOfCoinsYouCanGet_Solution().maxCoins(piles);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}