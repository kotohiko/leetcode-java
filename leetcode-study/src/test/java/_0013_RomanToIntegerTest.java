import com.eclipsesource.json.Json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _0013_RomanToIntegerTest {
    public static String stringToString(String input) {
        return Json.parse("[" + input + "]").asArray().get(0).asString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String s = stringToString(line);

            int ret = new RomanToInteger_Solution().romanToInt(s);

            String out = String.valueOf(ret);

            System.out.println(out);
        }
    }
}
