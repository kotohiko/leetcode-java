import com.eclipsesource.json.Json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LeetCode Playground
 */
public class _0771_JewelsAndStonesTest {
    public static String stringToString(String input) {
        return Json.parse("[" + input + "]").asArray().get(0).asString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String jewels = stringToString(line);
            line = in.readLine();
            String stones = stringToString(line);

            int ret = new JewelsAndStones_Solution().numJewelsInStones(jewels, stones);

            String out = String.valueOf(ret);

            System.out.println(out);
        }
    }
}
