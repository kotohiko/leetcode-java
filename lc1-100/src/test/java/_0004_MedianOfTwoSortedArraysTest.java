import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 * @author LeetCode Playground
 */
public class _0004_MedianOfTwoSortedArraysTest {
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

    public static String doubleToString(double input) {
        return new DecimalFormat("0.00000").format(input);
    }

    public static void main(String[] args) throws IOException {
        var in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            var nums1 = stringToIntegerArray(line);
            line = in.readLine();
            var nums2 = stringToIntegerArray(line);

            var ret = new MedianOfTwoSortedArrays_Solution().findMedianSortedArrays(nums1, nums2);

            var out = doubleToString(ret);

            System.out.println(out);
        }
    }
}