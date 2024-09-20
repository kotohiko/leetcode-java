package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Kotohiko
 * @since 21:28 Sep 18, 2024
 */
public class HW5_CommonCharacterRemover {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String str1 = line;
            line = in.readLine();
            String str2 = line;
            String ans = removeCommonCharacters(str1, str2);
            System.out.println(ans);
        }
    }

    public static String removeCommonCharacters(String str1, String str2) {
        StringBuilder result = new StringBuilder();
        Set<Character> charsToRemove = new HashSet<>();

        for (char c : str2.toCharArray()) {
            charsToRemove.add(c);
        }

        for (char c : str1.toCharArray()) {
            if (!charsToRemove.contains(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }
}