import com.eclipsesource.json.Json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LeetCode Playground
 */
public class _0058_LengthOfLastWordTest {
    public static String stringToString(String input) {
        return Json.parse("[" + input + "]").asArray().get(0).asString();
    }

    public static void main(String[] args) throws IOException {
        var in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            var s = stringToString(line);

            var ret = new LengthOfLastWord_Solution().lengthOfLastWord(s);

            var out = String.valueOf(ret);

            System.out.println(out);
        }
    }
}