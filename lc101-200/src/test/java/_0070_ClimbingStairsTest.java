import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LeetCode Playground
 */
public class _0070_ClimbingStairsTest {
    public static void main(String[] args) throws IOException {
        var in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            var n = Integer.parseInt(line);

            var ret = new ClimbingStairs_Solution().climbStairs(n);

            var out = String.valueOf(ret);

            System.out.println(out);
        }
    }
}