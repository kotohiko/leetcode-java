package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Kotohiko
 * @since 22:42 Sep 20, 2024
 */
public class HW3_ReplaceSpaces {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int len = Integer.parseInt(in.readLine());
            String result = replaceSpaces(line, len);
            System.out.println(result);
        }
    }

    public static String replaceSpaces(String iniString, int len) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < len; ++i) {
            if (iniString.charAt(i) == ' ') {
                ans.append("%20");
            } else {
                ans.append(iniString.charAt(i));
            }
        }
        return ans.toString();
    }
}