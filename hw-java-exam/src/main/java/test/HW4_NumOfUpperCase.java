package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Kotohiko
 * @since 22:49 9月 20, 2024
 */
public class HW4_NumOfUpperCase {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(countUpperCase(line));
        }
    }

    public static int countUpperCase(String line) {
        return (int) line.chars().filter(Character::isUpperCase).count();
    }
}