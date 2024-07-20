import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LeetCode Playground
 */
public class _2956_FindCommonElementsBetweenTwoArraysTest {
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

    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }

        var result = new StringBuilder();
        for (var index = 0; index < length; index++) {
            var number = nums[index];
            result.append(number).append(", ");
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }

    public static void main(String[] args) throws IOException {
        var in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            var nums1 = stringToIntegerArray(line);
            line = in.readLine();
            var nums2 = stringToIntegerArray(line);

            var ret = new FindCommonElementsBetweenTwoArrays_Solution().findIntersectionValues(nums1, nums2);

            var out = integerArrayToString(ret);

            System.out.println(out);
        }
    }
}