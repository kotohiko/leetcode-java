package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Kotohiko
 * @since 09:45 9月 21, 2024
 */
public class HW1_PlaceholderReplacement {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int argIdx = Integer.parseInt(in.readLine());
            char[] arg = in.readLine().toCharArray();
            System.out.println(replacement(line, argIdx, arg));
        }
    }

    public static String replacement(String str, int strLen, char[] arg) {
        StringBuilder ans = new StringBuilder();
        int argIdx = 0;

        for (int i = 0; i < strLen; ++i) {
            if (i + 1 < strLen && str.charAt(i) == '%' && str.charAt(i + 1) == 's') {
                ans.append(arg[argIdx++]);
                ++i;
            } else {
                ans.append(str.charAt(i));
            }
        }

        while (argIdx < arg.length) {
            ans.append(arg[argIdx++]);
        }

        return ans.toString();
    }
}