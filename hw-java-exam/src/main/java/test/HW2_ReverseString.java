package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Kotohiko
 * @since 22:40 9月 20, 2024
 */
public class HW2_ReverseString {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String ans = reverseString(line);
            System.out.println(ans);
        }
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}