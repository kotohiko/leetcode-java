import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LeetCode Playground
 */
public class _0243_ShortestWordDistanceTest {
    public static String[] stringToStringArray(String line) {
        JsonArray jsonArray = Json.parse(line).asArray();
        String[] arr = new String[jsonArray.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = jsonArray.get(i).asString();
        }
        return arr;
    }

    public static String stringToString(String input) {
        return Json.parse("[" + input + "]").asArray().get(0).asString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String[] wordsDict = stringToStringArray(line);
            line = in.readLine();
            String word1 = stringToString(line);
            line = in.readLine();
            String word2 = stringToString(line);

            int ret = new ShortestWordDistance_Solution().shortestDistance(wordsDict, word1, word2);

            String out = String.valueOf(ret);

            System.out.println(out);
        }
    }
}