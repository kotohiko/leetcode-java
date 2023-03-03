import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Jacob Suen
 */
public class _0014_LongestCommonPrefixTest {
    public static String[] stringToStringArray(String line) {
        JsonArray jsonArray = Json.parse(line).asArray();
        String[] arr = new String[jsonArray.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = jsonArray.get(i).asString();
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            String[] strs = stringToStringArray(line);

            String ret = new LongestCommonPrefix_Solution().longestCommonPrefix(strs);

            System.out.println(ret);
        }
    }
}
