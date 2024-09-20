import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Kotohiko
 * @since 16:19 Sep 19, 2024
 */
public class HW4_NumOfUpperCase {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(countUpperCase(line));
        }
    }

    public static int countUpperCase(String str) {
        return (int) str.codePoints().filter(Character::isUpperCase).count();
    }
}