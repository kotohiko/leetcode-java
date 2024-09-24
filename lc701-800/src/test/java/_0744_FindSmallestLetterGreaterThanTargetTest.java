import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LeetCode Playground
 */
public class _0744_FindSmallestLetterGreaterThanTargetTest {

    public static char[] jsonToCharArray(String line) {
        // Parse the JSON string to a JsonArray
        JsonArray jsonArray = Json.parse(line).asArray();

        // Create a char array with the same length as the JsonArray
        char[] result = new char[jsonArray.size()];

        // Iterate over the JsonArray and convert each element to a char
        for (int i = 0; i < jsonArray.size(); ++i) {
            String str = jsonArray.get(i).asString();
            result[i] = str.charAt(0);
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        var in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            char[] s = jsonToCharArray(line);

            char target = in.readLine().charAt(0);

            var ret = new FindSmallestLetterGreaterThanTarget_Solution().nextGreatestLetter(s, target);

            System.out.println(ret);
        }
    }
}