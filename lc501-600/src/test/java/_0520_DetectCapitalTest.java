import com.eclipsesource.json.Json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _0520_DetectCapitalTest {
    public static String stringToString(String input) {
        return Json.parse("[" + input + "]").asArray().get(0).asString();
    }

    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String word = stringToString(line);

            boolean ret = new DetectCapital_Solution().detectCapitalUse(word);

            String out = booleanToString(ret);

            System.out.print(out);
        }
    }
}
