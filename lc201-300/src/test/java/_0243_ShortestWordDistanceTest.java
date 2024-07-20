import com.eclipsesource.json.Json;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LeetCode Playground
 */
public class _0243_ShortestWordDistanceTest {
    public static String[] stringToStringArray(String line) {
        var jsonArray = Json.parse(line).asArray();
        var arr = new String[jsonArray.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = jsonArray.get(i).asString();
        }
        return arr;
    }

    public static String stringToString(String input) {
        return Json.parse("[" + input + "]").asArray().get(0).asString();
    }

    public static void main(String[] args) throws IOException {
        var in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            var wordsDict = stringToStringArray(line);
            line = in.readLine();
            var word1 = stringToString(line);
            line = in.readLine();
            var word2 = stringToString(line);

            var ret = new ShortestWordDistance_Solution().shortestDistance(wordsDict, word1, word2);

            var out = String.valueOf(ret);

            System.out.println(out);
        }
    }
}