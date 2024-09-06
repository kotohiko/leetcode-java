import com.eclipsesource.json.Json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LeetCode Playground
 */
public class _3174_ClearDigitsTest {
    public static String stringToString(String input) {
        return Json.parse("[" + input + "]").asArray().get(0).asString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String s = stringToString(line);

            String out = (new ClearDigits_Solution().clearDigits(s));

            System.out.print(out);
        }
    }
}