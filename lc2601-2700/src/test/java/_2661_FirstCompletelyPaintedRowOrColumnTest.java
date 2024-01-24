import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LeetCode Playground
 */
public class _2661_FirstCompletelyPaintedRowOrColumnTest {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.isEmpty()) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for (int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static int[][] stringToInt2dArray(String input) {
        JsonArray jsonArray = Json.parse(input).asArray();
        if (jsonArray.isEmpty()) {
            return new int[0][0];
        }

        int[][] arr = new int[jsonArray.size()][];
        for (int i = 0; i < arr.length; i++) {
            JsonArray cols = jsonArray.get(i).asArray();
            arr[i] = stringToIntegerArray(cols.toString());
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] arr = stringToIntegerArray(line);
            line = in.readLine();
            int[][] mat = stringToInt2dArray(line);

            int ret = new FirstCompletelyPaintedRowOrColumn_Solution().firstCompleteIndex(arr, mat);

            String out = String.valueOf(ret);

            System.out.print(out);
        }
    }
}
