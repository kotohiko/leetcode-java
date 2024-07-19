import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LeetCode Playground
 */
public class _3099_HarshadNumberTest {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            var x = Integer.parseInt(line);

            var ret = new HarshadNumber_Solution().sumOfTheDigitsOfHarshadNumber(x);

            String out = String.valueOf(ret);

            System.out.println(out);
        }
    }
}