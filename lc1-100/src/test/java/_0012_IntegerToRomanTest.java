import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LeetCode Playground
 */
public class _0012_IntegerToRomanTest {
    public static void main(String[] args) throws IOException {
        var in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            var num = Integer.parseInt(line);

            var out = (new IntegerToRoman_Solution().intToRoman(num));

            System.out.println(out);
        }
    }
}