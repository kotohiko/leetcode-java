import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LeetCode Playground
 */
public class _3096_MinimumLevelsToGainMorePointsTest {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.isEmpty()) {
            return new int[0];
        }

        var parts = input.split(",");
        var output = new int[parts.length];
        for (var index = 0; index < parts.length; index++) {
            var part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static void main(String[] args) throws IOException {
        var in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            var possible = stringToIntegerArray(line);

            var ret = new MinimumLevelsToGainMorePoints_Solution().minimumLevels(possible);

            var out = String.valueOf(ret);

            System.out.println(out);
        }
    }
}