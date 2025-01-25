package org.jacob.leetcode.java.test;

import org.jacob.leetcode.java.solution._0292_NimGame_Solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LeetCode Playground
 */
public class _0292_NimGameTest {
    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(line);

            boolean ret = new _0292_NimGame_Solution().canWinNim(n);

            String out = booleanToString(ret);

            System.out.println(out);
        }
    }
}