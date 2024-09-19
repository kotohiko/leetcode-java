import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Kotohiko
 * @since 17:23 Sep 19, 2024
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
        int spaceCount = 0;
        for (int i = 0; i < len; ++i) {
            if (iniString.charAt(i) == ' ') {
                ++spaceCount;
            }
        }

        int newLength = len + spaceCount * 2;
        char[] result = new char[newLength];

        int index = newLength - 1;
        for (int i = len - 1; i >= 0; i--) {
            if (iniString.charAt(i) == ' ') {
                result[index--] = '0';
                result[index--] = '2';
                result[index--] = '%';
            } else {
                result[index--] = iniString.charAt(i);
            }
        }

        return new String(result);
    }
}