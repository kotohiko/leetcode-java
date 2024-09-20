package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Kotohiko
 * @since 22:31 9月 20, 2024
 */
public class HW1_PlaceholderReplacement {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String A = line;
            int n = Integer.parseInt(in.readLine());
            char[] arg = in.readLine().toCharArray();
            System.out.println(replacement(A, n, arg));
        }
    }

    public static String replacement(String A, int n, char[] arg) {
        StringBuilder ans = new StringBuilder();
        int argIdx = 0;
        for (int i = 0; i < n; ++i) {
            if (i + 1 < n && A.charAt(i) == '%' && A.charAt(i + 1) == 's') {
                ans.append(arg[argIdx++]);
                ++i;
            } else {
                ans.append(A.charAt(i));
            }
        }
        while (argIdx < arg.length) {
            ans.append(arg[argIdx++]);
        }

        return ans.toString();
    }
}