import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LeetCode Playground
 */
public class _2578_SplitWithMinimumSumTest {
    public static void main(String[] args) throws IOException {
        var in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            var num = Integer.parseInt(line);

            var ret = new SplitWithMinimumSum_Solution().splitNum(num);

            var out = String.valueOf(ret);

            System.out.println(out);
        }
    }
}