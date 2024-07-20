import com.eclipsesource.json.Json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LeetCode Playground
 */
public class _2710_RemoveTrailingZerosFromAStringTest {
    public static String stringToString(String input) {
        return Json.parse("[" + input + "]").asArray().get(0).asString();
    }

    public static void main(String[] args) throws IOException {
        var in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            var num = stringToString(line);

            var out = (new RemoveTrailingZerosFromAString_Solution().removeTrailingZeros(num));

            System.out.println(out);
        }
    }
}
