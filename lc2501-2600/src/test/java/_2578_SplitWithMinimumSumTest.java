import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LeetCode Playground
 */
public class _2578_SplitWithMinimumSumTest {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int num = Integer.parseInt(line);

            int ret = new SplitWithMinimumSum_Solution().splitNum(num);

            String out = String.valueOf(ret);

            System.out.println(out);
        }
    }
}